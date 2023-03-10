package com.xworkz.bigbasket.customvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
	
		public String message() default "1st letter must be upper case and 4th letter should be special character";
		
		public Class<?>[] groups() default {};
		
		public Class<? extends Payload>[] payload() default {};
}
