package com.evy.core.exception;


import com.evy.core.returns.ReturnCode;

/**
 * @author Jonny
 * @Description: 校验类异常
 * @date 2018/4/5下午2:09
 */
public class ValidationException extends EvyException{

    protected int code = 402;

    public ValidationException() {
        super("数据不能通过验证");
    }

    public ValidationException(int code, String msg) {
        super(code,msg);
    }

    public ValidationException(ReturnCode code) {
        super(code);
    }

    public ValidationException(String msg) {
        super(msg);
    }

    public ValidationException(Exception cause) {
        super(cause);
    }

    public ValidationException(String msg, Exception cause) {
        super(msg,cause);
    }
}
