package com.evy.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonny
 * @Description: 反射工具类
 * @date 2018/4/24上午9:50
 */
public class ReflectUtils {

    /**
     * 通过名称或者类型类型去获取
     * @param clazz
     * @param name
     * @return
     */
    public static Field findField(Class<?> clazz, String name) {
        notNull(clazz, "Class must not be null");
        isTrue(name != null , "Either name of the field must be specified");
        Class<?> searchType = clazz;
        while (Object.class != searchType && searchType != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if ((name == null || name.equals(field.getName()))) {
                    return field;
                }
            }
            searchType = searchType.getSuperclass();
        }
        return null;
    }

    /**
     * 反射判断实例中的所有get属性是否为空
     * @param instance
     * @param <T>
     * @return
     */
    public static <T> boolean isAllAttributeEmpty(T instance) {
        Class clazz = instance.getClass();
        Field[] fields = clazz.getDeclaredFields();
        boolean isEmpty = false;
        if(fields == null || fields.length == 0){
            isEmpty = true;
        }
        List<Method> targetMethod = new ArrayList<>();
        Class<?> searchType = clazz;
        while (searchType != null) {
            Method[] methods = (searchType.isInterface() ? searchType.getMethods() : clazz.getDeclaredMethods());
            for (Method method : methods) {
                if (method.getName().startsWith("get")) {
                    targetMethod.add(method);
                }
            }
            searchType = searchType.getSuperclass();
        }
        isEmpty = targetMethod.stream().allMatch(method -> {
            Object result = invokeMethod(method,instance);
            return  result == null || "".equals(result);
        });
        return isEmpty;
    }

    public static void setField(Field field, Object target, Object value) {
        try {
            field.set(target, value);
        }
        catch (IllegalAccessException ex) {
            throw new IllegalStateException(
                    "Unexpected reflection exception - " + ex.getClass().getName() + ": " + ex.getMessage());
        }
    }

    public static Method findMethod(Class<?> clazz, String name) {
        notNull(clazz, "Class must not be null");
        notNull(name, "Method name must not be null");
        Class<?> searchType = clazz;
        while (searchType != null) {
            Method[] methods = (searchType.isInterface() ? searchType.getMethods() : clazz.getDeclaredMethods());
            for (Method method : methods) {
                if (name.equals(method.getName())) {
                    return method;
                }
            }
            searchType = searchType.getSuperclass();
        }
        return null;
    }

    public static Object invokeMethod(Method method, Object target) {
        return invokeMethod(method, target, new Object[0]);
    }

    public static Object invokeMethod(Method method, Object target, Object... args) {
        try {
            return method.invoke(target, args);
        }
        catch (Exception ex) {
            handleReflectionException(ex);
        }
        throw new IllegalStateException("Should never get here");
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void handleReflectionException(Exception ex) {
        if (ex instanceof NoSuchMethodException) {
            throw new IllegalStateException("Method not found: " + ex.getMessage());
        }
        if (ex instanceof IllegalAccessException) {
            throw new IllegalStateException("Could not access method: " + ex.getMessage());
        }
        if (ex instanceof InvocationTargetException) {
            handleInvocationTargetException((InvocationTargetException) ex);
        }
        if (ex instanceof RuntimeException) {
            throw (RuntimeException) ex;
        }
        throw new UndeclaredThrowableException(ex);
    }

    public static void handleInvocationTargetException(InvocationTargetException ex) {
        rethrowRuntimeException(ex.getTargetException());
    }

    public static void rethrowRuntimeException(Throwable ex) {
        if (ex instanceof RuntimeException) {
            throw (RuntimeException) ex;
        }
        if (ex instanceof Error) {
            throw (Error) ex;
        }
        throw new UndeclaredThrowableException(ex);
    }
}
