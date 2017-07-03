package com.syswin.ocm.validate;
import java.lang.reflect.Method;


public class Validator {	
	
	private String fieldName;
	private ValidationRule rule;
	private int errorCode;
	private String errorMsg;
	
	public Validator(String fieldName, ValidationRule rule, int errorCode,
			String errorMsg) {
		super();
		this.fieldName = fieldName;
		this.rule = rule;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public ValidationRule getRule() {
		return rule;
	}

	public void setRule(ValidationRule rule) {
		this.rule = rule;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public void validate(Object obj){
		
		Object val = getFieldValueByName(this.fieldName, obj);
		
		if ( (val == null) || !rule.check(val.toString()) ) {
			 throw new ValidationException(errorCode, errorMsg);
		}
	}	
	
	/**
	 * 根据属性名获取属性值
	 * */
	private Object getFieldValueByName(String fieldName, Object o) {
		try {
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);
			Method method = o.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(o, new Object[] {});
			return value;
		} catch (Exception e) {
			return null;
		}
	}
}
