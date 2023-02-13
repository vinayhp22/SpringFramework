package com.xworkz.egg.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CMDTO;

@Service
public class CMServiceImpl implements CMService {

	public CMServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		System.out.println("Validate And Save in CM..."+cmdto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations = validator.validate(cmdto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("ConstraintViolations exists, return constraintviolations");
			return constraintViolations;
		}else {
			System.out.println("ConstraintViolations not found , data is good");
			return Collections.emptySet();
		}
		
	}
	

}
