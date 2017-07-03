package com.syswin.ocm.validate.rule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.syswin.ocm.validate.ValidationRule;

//包括正数和浮点数
public class NumericRule extends ValidationRule {

	NumericRule() {		
	}
	
	@Override
	public boolean check(String str) {
		// TODO Auto-generated method stub
		if ( str != null ) {
			Pattern pattern = Pattern.compile("^(-?\\d+)(\\.\\d+)?$");  
			Matcher isNum = pattern.matcher(str);  
			return isNum.matches() ? true : false;        
		}
		return false;
	}
}
