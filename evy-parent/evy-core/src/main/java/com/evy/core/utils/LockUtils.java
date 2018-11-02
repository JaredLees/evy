package com.evy.core.utils;

import com.evy.core.exception.EvyException;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @author Jonny
 * @Description: 业务锁工具类
 * @date 2018/5/3上午9:18
 */
@Slf4j
public class LockUtils {
	private static final int EXPIRED_TIME = 1800;
	private static final int TIME_OUT = 2;
	private final RedisUtil redisUtil;
	private final ExecutorService executor;

	private LockUtils() {
		redisUtil = ApplicationContextHolder.getBean("redisUtil");
		executor = Executors.newCachedThreadPool();
	}

	public boolean doLock(String key) {
		return execute(() -> {
			//key被设置，返回success = true，否则false，由此来判断是否正在处理的请求
			Boolean isSuccess = redisUtil.getRedisTemplate().boundValueOps(key).setIfAbsent(true);;
			if (isSuccess) {
				redisUtil.expire(key, EXPIRED_TIME, TimeUnit.SECONDS);
			}
			return isSuccess;
		});
	}

	public boolean checkLock(String key) {
		return execute(() -> {
			Boolean isLock = Boolean.parseBoolean(redisUtil.get(key));
			return isLock != null && isLock;
		});
	}

	public void releaseLock(String key) {
		execute(() -> {
			redisUtil.delete(key);
			return null;
		});
	}

	public boolean doLock(String key, Long dbid) {
		return doLock(getDbidKey(key, dbid));
	}

	public boolean checkLock(String key, Long dbid) {
		return checkLock(getDbidKey(key, dbid));
	}

	public void releaseLock(String key, Long dbid) {
		releaseLock(getDbidKey(key, dbid));
	}

	public static LockUtils getInstance() {
		return Inner.INSTANCE;
	}

	private static class Inner {
		static final LockUtils INSTANCE = new LockUtils();
	}

	public <T> T execute(Callable<T> task) {
		try {
			Future<T> future = executor.submit(task);
			return future.get(TIME_OUT, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			throw new EvyException();
		}
	}

	private String getDbidKey(String key, Long dbid) {
		if (dbid == null) {
			new EvyException("用户信息为空，请先登录！");
		}
		return key + "_" + dbid;
	}
}
