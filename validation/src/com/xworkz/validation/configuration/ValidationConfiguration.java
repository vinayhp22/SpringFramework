package com.xworkz.validation.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.validation")
public class ValidationConfiguration {
	@Bean
	public Validator validatorFirstAid() {
		System.out.println("registering validatorFirstAid");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		return validator;
	}
	
	@Bean
	public Validator validatorMissile() {
		System.out.println("registering validatorMissile");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		return validator;
	}
	
	@Bean
	public Validator validatorResort() {
		System.out.println("registering validatorResort");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		return validator;
	}
	

}
