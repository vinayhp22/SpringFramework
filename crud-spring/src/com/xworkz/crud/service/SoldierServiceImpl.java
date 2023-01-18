package com.xworkz.crud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import com.xworkz.crud.dao.SoldierDAO;
import com.xworkz.crud.dto.SoldierDTO;

public class SoldierServiceImpl implements SoldierService {

	SoldierDAO dao;

	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl..");
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("validateAndSave method in SoldierServiceImpl...");
		System.out.println("DTO : " + dto);
		Set<ConstraintViolation<SoldierDTO>> violations = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(dto);
		
		if (!violations.isEmpty()) {
			System.out.println("Errors present....");
			violations.forEach(v -> System.out.println("Violations are" + v.getMessage()));
			return false;
		} else {
			System.out.println("Data is Correct, going to save..");
			return dao.save(dto);
		}
	}
	
	public SoldierDAO getDao() {
		return dao;
	}
	
	public void setDao(SoldierDAO dao) {
		this.dao = dao;
	}

}
