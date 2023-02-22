package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.aeroplane.dto.AeroDTO;
import com.xworkz.aeroplane.entity.AeroEntity;
import com.xworkz.aeroplane.repository.AeroRepo;

@Service
public class AeroServiceImpl implements AeroService {

	@Autowired
	private AeroRepo aeroRepo;

	public AeroServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroDTO>> validateAndSave(AeroDTO dto) {
		System.out.println("validateAndSave(AeroDTO aeroDTO)");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<AeroDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return violations;
		}
		System.out.println("There is no violations in dto, can save" + dto);

		AeroEntity entity = new AeroEntity();
		entity.setCompany(dto.getCompany());
		entity.setName(dto.getName());
		entity.setCost(dto.getCost());
		entity.setType(dto.getType());
		entity.setCountry(dto.getCountry());

		boolean saved = this.aeroRepo.save(entity);
		System.out.println("Entity saved : " + saved);
		return Collections.emptySet();
	}
	
	@Override
	public AeroDTO findById(int id) {
		if(id>0) {
			AeroEntity entity = this.aeroRepo.find(id);
			if(entity!=null) {
				System.out.println("entity is found in service for id"+id);
				AeroDTO dto = new AeroDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}
		}
		return AeroService.super.findById(id);
	}

}
