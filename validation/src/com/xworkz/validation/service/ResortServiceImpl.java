package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.xworkz.validation.dao.ResortDAO;
import com.xworkz.validation.dto.ResortDTO;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	@Qualifier("validatorResort")
	private Validator validator;
	@Autowired
	private ResortDAO resortDAO;

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Running validateAndSave - ResortServiceImpl");
		System.out.println("ResortDAO : " + resortDAO);
		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There are validation errors..");
			violations.forEach(v -> System.err.println(v.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid... so can save..");
			boolean saved = this.resortDAO.save(dto);
			System.out.println("Saved ResortDAO : "+resortDAO);
			return saved;
		}
	}

}
