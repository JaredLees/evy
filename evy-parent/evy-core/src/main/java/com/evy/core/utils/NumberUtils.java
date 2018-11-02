package com.evy.core.utils;

import com.evy.core.exception.ValidationException;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/13下午3:15
 */
public class NumberUtils {

    public static boolean isNullOrZero(Long number) {
        return null == number || number == 0;
    }

    public static boolean isNullOrZero(Integer number) {
        return null == number || number == 0;
    }

    public static boolean isNullOrZero(Double number) {
        return null == number || number == 0;
    }

    public static boolean isNullOrZero(Float number) {
        return null == number || number == 0;
    }

    public static boolean isNullOrZero(BigDecimal number) {
        return null == number || number.compareTo(BigDecimal.ZERO) == 0;
    }

    public static boolean toBoolean(Integer number) {
        if(number.equals(0) || number.equals(1)){
            return number.equals(1) ? true:false;
        }else{
            throw new ValidationException(MessageFormat.format("{0}转换到boolean类型错误",number));
        }
    }
}
