package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;

public class LengthRule extends ValidationRule {

	private int minLength;
	private int maxLength;
	
	LengthRule(int minLength, int maxLength) {
		this.minLength = minLength;
		this.maxLength = maxLength;
	}
	
	@Override
	public boolean check(String val) {
		// TODO Auto-generated method stub
		if ( (val != null) && (val.length() >=minLength) && (val.length()<=maxLength) ) {
			return true;
		}
		return false;
	}
}
