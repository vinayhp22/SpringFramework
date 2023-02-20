package com.javatpoint.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> {

	public boolean isValid(String s, ConstraintValidatorContext cvc) {
		
		boolean result=(s.charAt(0)==s.toUpperCase().charAt(0));
		return result;
	}
}
