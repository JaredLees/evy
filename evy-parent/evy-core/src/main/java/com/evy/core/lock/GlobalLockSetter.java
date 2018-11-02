package com.evy.core.lock;

import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Jonny
 * @Description: 业务锁开启
 * @date 2018/5/3上午9:18
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface GlobalLockSetter {

    /**
     * 如果取redis 锁标识位失败，是否抛出异常
     */
    boolean fail() default false;

    String key();

    String message() default StringUtils.EMPTY;
}
