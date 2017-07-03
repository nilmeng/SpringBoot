package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;

public class EmailRule extends ValidationRule {

	EmailRule() {		
	}
	
	@Override
	public boolean check(String val) {
		// TODO Auto-generated method stub
		if ( val != null ) {
			return val.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$");
		}
		return false;
	}

}
