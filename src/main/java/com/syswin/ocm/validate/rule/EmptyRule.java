package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;


public class EmptyRule extends ValidationRule {
	
	EmptyRule() {
		
	}
	
	@Override
	public boolean check(String val) {
		// TODO Auto-generated method stub
		if ( val != null ) {
			return (val.trim().length()>0) ? true : false;
		}
		return false;
	}

}
