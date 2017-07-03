package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;


public class ValidateRule {
	public static ValidationRule  EMAIL = new EmailRule();
	public static ValidationRule  EMPTY = new EmptyRule();
	public static ValidationRule  MOBILE = new MobileRule();
	public static ValidationRule  NUMERIC = new NumericRule();
	public static ValidationRule  INTEGER = new IntegerRule();
	public static ValidationRule getLengthRule(int minLength, int maxLength) {
		return new LengthRule(minLength, maxLength);
	}
	
	public static ValidationRule getRangeRule(long minVal, long maxVal) {
		return new RangeRule(minVal, maxVal);
	}
	
	public static ValidationRule getEqualRule(String[] targetValue) {
		return new EqualRule(targetValue);
	}
}
