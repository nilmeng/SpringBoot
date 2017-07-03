/**
 * 
 */
package com.syswin.ocm.validate.rule;

import java.util.Arrays;

import com.syswin.ocm.validate.ValidationRule;

/**
 * <p>Title:EqualRule </p>
 * @author Administrator
 * @date 2016-12-8
 */
public class EqualRule extends ValidationRule {
	private String[] targetValue;
	
	public String[] getTargetValue() {
		return targetValue;
	}
	public void setTargetValue(String[] targetValue) {
		this.targetValue = targetValue;
	}
	EqualRule(String[] targetValue){
		this.targetValue = targetValue;
	}
	@Override
	public boolean check(String value) {
		Arrays.sort(targetValue);
		return Arrays.binarySearch(targetValue, value)>=0?true:false;
	}
}
