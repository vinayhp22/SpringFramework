package com.xworkz.bigbasket.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.bigbasket.dto.BigbasketDTO;
import com.xworkz.bigbasket.entity.BigbasketEntity;
import com.xworkz.bigbasket.repo.BigbasketRepo;

@Service
public class BigbasketServiceImpl implements BigbasketService {

	@Autowired
	private BigbasketRepo bigbasketRepo;

	public BigbasketServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigbasketDTO>> validateAndSave(BigbasketDTO bigbasketDTO) {
		System.out.println("validateAndSave in BigbasketServiceImpl" + bigbasketDTO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<BigbasketDTO>> violations = validator.validate(bigbasketDTO);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation(s) in dto : " + bigbasketDTO);
			return violations;
		} else {
			System.out.println("violation is not there in dto, can save");

			BigbasketEntity entity = new BigbasketEntity();
			entity.setItem(bigbasketDTO.getItem());
			entity.setDiscountInPers(bigbasketDTO.getDiscountInPers());
			entity.setQuantity(bigbasketDTO.getQuantity());
			entity.setMfdDate(bigbasketDTO.getMfdDate());
			entity.setExpiryDate(bigbasketDTO.getExpiryDate());
			entity.setCustName(bigbasketDTO.getCustName());
			entity.setMobileNumber(bigbasketDTO.getMobileNumber());
			entity.setEmail(bigbasketDTO.getEmail());
			entity.setPassword(bigbasketDTO.getPassword());
			entity.setArea(bigbasketDTO.getArea());

			boolean saved = this.bigbasketRepo.save(entity);
			System.out.println("Entity saved : " + saved);

			return Collections.emptySet();
		}

	}
}