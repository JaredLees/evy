package com.evy.core.exception;

import com.evy.core.returns.ReturnCode;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Jonny
 * @date 2018/4/5下午2:38
 */
public class EvyException extends RuntimeException {
    protected int code = 525;

    protected String msg;

    private static final long serialVersionUID = 6803196718150375116L;

    public EvyException(int code,String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public EvyException(ReturnCode code) {
        super(code.getMessage());
        this.msg = code.getMessage();
        this.code = code.getCode();
    }

    public EvyException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public EvyException() {
        this("业务数据异常");
        this.msg = "业务数据异常";
    }

    public EvyException(Exception cause) {
        super(cause);
    }

    public EvyException(String msg,Exception cause) {
        super(msg,cause);
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        if(StringUtils.isNotBlank(msg)) {
            return "code:" + getCode() + ",msg:" + msg + ";";
        }
        return super.toString() + ";code:" + getCode();
    }

}
