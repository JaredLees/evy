package com.evy.core.exception;


import com.evy.core.returns.ReturnCode;

/**
 * @author Jonny
 * @Description: 业务异常
 * @date 2018/4/5下午2:38
 */
public class BusinessException extends EvyException{

    public BusinessException() {
        super("业务逻辑异常");
    }

    public BusinessException(int code,String msg) {
        super(code,msg);
    }

    public BusinessException(ReturnCode code) {
        super(code);
    }

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(Exception cause) {
        super(cause);
    }

    public BusinessException(String msg,Exception cause) {
        super(msg,cause);
    }

}
