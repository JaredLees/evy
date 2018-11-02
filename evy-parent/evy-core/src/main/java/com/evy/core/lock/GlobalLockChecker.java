package com.evy.core.lock;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Jonny
 * @Description: 业务锁检查
 * @date 2018/5/3上午9:18
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface GlobalLockChecker {
	String message();

	String key();
}