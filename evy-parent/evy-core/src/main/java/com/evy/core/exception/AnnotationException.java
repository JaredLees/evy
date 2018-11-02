package com.evy.core.exception;

import com.evy.core.returns.ReturnCode;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/18上午10:55
 */
public class AnnotationException extends EvyException{
    public AnnotationException() {
        super("注解异常");
    }

    public AnnotationException(int code,String msg) {
        super(code,msg);
    }

    public AnnotationException(ReturnCode code) {
        super(code);
    }

    public AnnotationException(String msg) {
        super(msg);
    }

    public AnnotationException(Exception cause) {
        super(cause);
    }

    public AnnotationException(String msg,Exception cause) {
        super(msg,cause);
    }
}
