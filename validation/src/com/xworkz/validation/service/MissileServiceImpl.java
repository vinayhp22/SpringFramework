package com.xworkz.validation.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.xworkz.validation.dao.MissileDAO;
import com.xworkz.validation.dto.MissileDTO;

@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	@Qualifier("validatorMissile")
	private Validator validator;
	@Autowired
	private MissileDAO missileDAO;

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running validateAndSave - MissileServiceImpl");
		System.out.println("MissileDAO : " + missileDAO);
		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("There are validation errors..");
			violations.forEach(v -> System.err.println(v.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid... so can save..");
			boolean saved = this.missileDAO.save(dto);
			System.out.println("Saved missileDAO : " + missileDAO);
			return saved;
		}
	}

}
