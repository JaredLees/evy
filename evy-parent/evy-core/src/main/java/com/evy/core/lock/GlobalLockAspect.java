package com.evy.core.lock;

import com.evy.core.exception.BusinessException;
import com.evy.core.sandbox.TenantContext;
import com.evy.core.utils.LockUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jonny
 * @Description: 全局锁处理逻辑
 *  使用场景说明：
 *         业务冲突处理锁，在某个耗时业务发生的同时，不希望对立业务同时发生。
 *
 *  使用：
 *      采用@GlobalLockSetter对业务切入点进行封锁。
 *      采用@GlobalLockChecker对业务切入点进行锁检测。
 *      Aspect核心处理器：GlobalLockAspect
 *
 * @date 2018/5/3上午9:20
 */
@Aspect
@Order(1) // 控制多个Aspect的执行顺序，越小越先执行
@Component
public class GlobalLockAspect {

    private ThreadLocal<Set<String>> isUsingGlobalLockKeySets = new ThreadLocal<>();

    private void addToIsUsingGlobalLockKeySets(String key){
        if(isUsingGlobalLockKeySets.get() == null){
            isUsingGlobalLockKeySets.set(new HashSet<String>());
        }
        isUsingGlobalLockKeySets.get().add(key);
    }

    private boolean IsUsingGlobalLockKeySetsContains(String key){
        if(isUsingGlobalLockKeySets.get() == null){
            return false;
        }
        return isUsingGlobalLockKeySets.get().contains(key);
    }

    @Before("@annotation(lockChecker)")
    public void doLockCheck(GlobalLockChecker lockChecker) {
        //如果本次请求包含了封锁和锁检测，判断是嵌套调用，放过此次检测
        if(IsUsingGlobalLockKeySetsContains(lockChecker.key())){
            return ;
        }
        doLockCheck(lockChecker.key(), lockChecker.message());
    }

    private void doLockCheck(String key, String message){
        String buildKey = buildKey(key);
        boolean isLock = LockUtils.getInstance().checkLock(buildKey);
        if (isLock) {
            throw new BusinessException(message);
        }
    }

    @Around("@annotation(lockSetter)")
    public void doLock(ProceedingJoinPoint pjp, GlobalLockSetter lockSetter) throws Throwable {
        addToIsUsingGlobalLockKeySets(lockSetter.key());

        String key = buildKey(lockSetter.key());
        boolean success = LockUtils.getInstance().doLock(key);
        boolean failAtHadLocked = lockSetter.fail();
        if (!success) {
            if (failAtHadLocked) {
                throw new BusinessException(lockSetter.message());
            } else {
                return;
            }
        }
        try {
            pjp.proceed();
        } finally {
            LockUtils.getInstance().releaseLock(key);
        }
    }

    private String buildKey(String lockerKeyPrex) {
        if (TenantContext.getTenantId() == null) {
            throw new BusinessException("dbid is missing");
        }
        return lockerKeyPrex + "_" + TenantContext.getTenantId();
    }
}
