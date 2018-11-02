package com.evy.core.utils;

import com.evy.core.exception.BusinessException;
import com.evy.core.exception.ValidationException;

import java.util.regex.Pattern;

/**
 * 异常处理工具类
 */
public class ExceptionUtil {

    public static void isTrue(Boolean boole,String msg){
        if(boole){
           throw new ValidationException(msg);
        }
    }

    public static void isNull(Object obj,String msg){
        if(obj==null){
            throw new BusinessException(msg);
        }
    }

    public static void isNotNull(Object obj,String msg){
        if(obj!=null){
            throw new BusinessException(msg);
        }
    }

    public static void isMatcher(String regex,String str,String msg){
        if(!Pattern.matches(regex, str)){
            throw new BusinessException(msg);
        }
    }
}
