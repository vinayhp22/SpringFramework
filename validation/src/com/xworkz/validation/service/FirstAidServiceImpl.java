package com.xworkz.validation.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.xworkz.validation.dao.FirstAidDAO;
import com.xworkz.validation.dto.FirstAidDTO;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	@Qualifier("validatorFirstAid")
	private Validator validator;
	@Autowired
	private FirstAidDAO firstAidDAO;

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running validateAndSave - FirstAidServiceImpl");
		System.out.println("firstAidDAO : " + firstAidDAO);

		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(dto);

		if (!violations.isEmpty()) {
			System.err.println("There are validation errors..");
			violations.forEach(v -> System.err.println(v.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid... so can save..");
			boolean saved = this.firstAidDAO.save(dto);
			System.out.println("Saved firstAidDAO : " + firstAidDAO);
			return saved;
		}
	}
}
