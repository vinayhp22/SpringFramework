package com.xworkz.crud.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import com.xworkz.crud.dto.TerroristDTO;

public class TerroristServiceimpl implements TerroristService {

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("Validatation started...");
		System.out.println("Dto passed : "+dto);
		Set<ConstraintViolation<TerroristDTO>> violations =Validation.buildDefaultValidatorFactory().getValidator().validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("Error is there : ");
			violations.forEach(c->System.err.println(c.getMessage()));
		}
		if(dto.isAlive()) {
			System.out.println("Most dangeros");
		}
		return false;
	}

}
