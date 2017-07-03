package com.syswin.ocm.validate.rule;

import com.syswin.ocm.validate.ValidationRule;

public class IntegerRule extends ValidationRule {

	IntegerRule() {		
	}
	
	@Override
	public boolean check(String val) {
		// TODO Auto-generated method stub
		try{  
            Integer.parseInt(val);  
            return true;  
        }catch(Exception ex){  
            return false;  
        }
	}
}
