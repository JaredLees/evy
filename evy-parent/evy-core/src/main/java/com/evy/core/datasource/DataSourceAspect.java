package com.evy.core.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;

/**
 * @author Jonny
 * @Description:
 *  对Transactional注解做2次增强，目的是获取到当前业务方法属于何种类型的事务
 *
 *  有以下强制有求：
 *  service中的业务方法必须带上 @Transactional 注解
 *
 *  只读请指定 @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
 *
 * @date 2018/8/16下午8:07
 */
@Slf4j
@Aspect
@Component
@Order(-1)
public class DataSourceAspect {

    @Pointcut("@annotation(org.springframework.transaction.annotation.Transactional)")
    public void getTransactional() {}

    @Around("getTransactional()")
    public Object Around(final ProceedingJoinPoint point) throws Throwable {
        try {
            Method m = ((MethodSignature) point.getSignature()).getMethod();
            if (m != null && m.isAnnotationPresent(Transactional.class)) {
                Transactional transactional = m.getAnnotation(Transactional.class);
                if (transactional.propagation().equals(Propagation.SUPPORTS) && transactional.readOnly()) {
                    DynamicDataSourceHolder.setDataSource(DataSource.SLAVE);
                } else {
                    DynamicDataSourceHolder.setDataSource(DataSource.MASTER);
                }
            } else {
                DynamicDataSourceHolder.setDataSource(DataSource.MASTER);
            }
        } catch (Exception e) {
            DynamicDataSourceHolder.clear();
            log.error(e.getMessage());
        }
        return point.proceed();
    }

}
