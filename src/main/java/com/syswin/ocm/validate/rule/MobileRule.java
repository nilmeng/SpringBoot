package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;

public class MobileRule extends ValidationRule {
	
	MobileRule() {
		
	}
	
	@Override
	public boolean check(String val) {
		// TODO Auto-generated method stub
		if( val != null ) {  
            return val.matches("^(13|14|15|18)\\d{9}$"); 
		}
		return false;
	}

}
