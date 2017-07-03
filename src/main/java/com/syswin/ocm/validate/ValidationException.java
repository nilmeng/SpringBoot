package com.syswin.ocm.validate;

public class ValidationException extends RuntimeException {
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	private static final long serialVersionUID = 1L;
	
	private String msg;
	private int code;
	
	public ValidationException(int code, String msg) {
		this.code = code;
		this.msg  = msg;
	}
}
