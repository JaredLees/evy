package com.evy.core.exception;

import com.evy.core.returns.ReturnCode;

/**
 * @author Jonny
 * @Description:
 * @date 2018/4/10下午4:58
 */
public class UnauthorizedException extends EvyException {
	
	private static final long serialVersionUID = 80751033678861340L;
	
	protected int code = ReturnCode.C401.getCode();
	
	public UnauthorizedException() {
		super("没有登录授权");
	}
	
	public UnauthorizedException(int code, String msg) {
		super(code,msg);
	}
	
	public UnauthorizedException(ReturnCode code) {
		super(code);
	}
	
	public UnauthorizedException(String msg) {
		super(msg);
	}
	
    public UnauthorizedException(Exception cause) {
        super(cause);
    }
    
    public UnauthorizedException(String msg, Exception cause) {
    	super(msg,cause);
    }
	
}
