package com.xworkz.poison.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.poison.dto.PoisonDTO;
import com.xworkz.poison.entity.PoisonEntity;
import com.xworkz.poison.repository.PoisonRepo;

@Service
public class PoisonServiceImpl implements PoisonService {

	@Autowired
	private PoisonRepo poisonRepo;

	public PoisonServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<PoisonDTO>> validateAndSave(PoisonDTO dto) {
		System.out.println("validateAndSave(PoisonDTO PoisonDTO)");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<PoisonDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return violations;
		}
		System.out.println("There is no violations in dto, can save" + dto);

		PoisonEntity entity = new PoisonEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean saved = this.poisonRepo.save(entity);
		System.out.println("Entity saved : " + saved);
		return Collections.emptySet();
	}

	@Override
	public PoisonDTO findById(int id) {
		System.out.println("findById in service");
		if (id > 0) {
			PoisonEntity entity = this.poisonRepo.find(id);
			PoisonDTO dto = new PoisonDTO();
			if (entity != null) {
				System.out.println("entity is found in service for id: " + id);
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return null;
	}

	@Override
	public List<PoisonDTO> findByCompany(String company) {
		System.out.println("findByCompany in service : "+company);
		List<PoisonEntity> list = this.poisonRepo.findByCompany(company);
		List<PoisonDTO> dtos = new ArrayList();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos :" + dtos.size());
			System.out.println("Size of entities : " + list.size());
			return dtos;
		} else {
			System.out.println("Campany name is invalid, which is not present in the database");
			return Collections.emptyList();
		}
	}
	
	@Override
	public List<PoisonDTO> findByName(String name) {
		System.out.println("findByName in service : "+name);
		List<PoisonEntity> list = this.poisonRepo.findByName(name);
		List<PoisonDTO> dtos = new ArrayList();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos :" + dtos.size());
			System.out.println("Size of entities : " + list.size());
			return dtos;
		} else {
			System.out.println("Campany name is invalid, which is not present in the database");
			return Collections.emptyList();
		}
	}

	@Override
	public Set<ConstraintViolation<PoisonDTO>> validateAndUpdate(PoisonDTO dto) {
		System.out.println("validateAndUpdate(PoisonDTO PoisonDTO) in serviceImpl");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<PoisonDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto , can't update" + dto);
			return violations;
		}
		System.out.println("There is no violations in dto, can update" + dto);
		PoisonEntity entity = new PoisonEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean saved = this.poisonRepo.update(entity);
		System.out.println("Entity updated : " + saved);
		return Collections.emptySet();
	}
	@Override
	public PoisonDTO delete(int id) {
		System.out.println("delete in Service..");
		PoisonEntity entity = this.poisonRepo.deleteRow(id);
		PoisonDTO dto = new PoisonDTO();
		if(entity!=null) {
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}
	@Override
	public List<PoisonDTO> list() {
		System.out.println("list in service");
		List<PoisonEntity> list = this.poisonRepo.list();
		List<PoisonDTO> dtos = new ArrayList();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos :" + dtos.size());
			System.out.println("Size of entities : " + list.size());
			return dtos;
		} else {
			System.out.println("No data found in database");
			return Collections.emptyList();
		}
	}
	
	@Override
	public List<PoisonDTO> searchByNameAndCompany(String company, String name) {
		System.out.println("searchByNameAndCompany in service");
		List<PoisonEntity> list = this.poisonRepo.searchByNameAndCompany(company, name);
		List<PoisonDTO> dtos = new ArrayList();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos :" + dtos.size());
			System.out.println("Size of entities : " + list.size());
			return dtos;
		} else {
			System.out.println("No data found in database");
			return Collections.emptyList();
		}
	}
}
