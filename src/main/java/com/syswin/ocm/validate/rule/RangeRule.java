package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;

public class RangeRule extends ValidationRule {

	private long minVal;
	private long maxVal;
	
	RangeRule(long minVal, long maxVal) {
		this.minVal = minVal;
		this.maxVal = maxVal;
	}
	
	@Override
	public boolean check(String str) {
		// TODO Auto-generated method stub
		try {			
			if ( str != null ){
				long val = Long.parseLong(str);			
				return ( (val>=minVal) && (val<=maxVal) ) ? true : false;
			}
		} catch (NumberFormatException e) {			
		}
		
		return false;
	}

}
