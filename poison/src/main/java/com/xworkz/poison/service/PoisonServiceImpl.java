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

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PoisonServiceImpl implements PoisonService {

	@Autowired
	private PoisonRepo poisonRepo;

	public PoisonServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<PoisonDTO>> validateAndSave(PoisonDTO dto) {
		log.info("validateAndSave(PoisonDTO PoisonDTO)");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<PoisonDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			log.error("Violations in dto" + dto);
			return violations;
		}
		log.info("There is no violations in dto, can save" + dto);

		PoisonEntity entity = new PoisonEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean saved = this.poisonRepo.save(entity);
		log.info("Entity saved : " + saved);
		return Collections.emptySet();
	}

	@Override
	public PoisonDTO findById(int id) {
		log.info("findById in service");
		if (id > 0) {
			PoisonEntity entity = this.poisonRepo.find(id);
			PoisonDTO dto = new PoisonDTO();
			if (entity != null) {
				log.info("entity is found in service for id: " + id);
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return null;
	}

	@Override
	public List<PoisonDTO> findByCompany(String company) {
		log.info("findByCompany in service : " + company);
		List<PoisonEntity> list = this.poisonRepo.findByCompany(company);
		List<PoisonDTO> dtos = new ArrayList<>();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos :" + dtos.size());
			log.info("Size of entities : " + list.size());
			return dtos;
		} else {
			log.info("Campany name is invalid, which is not present in the database");
			return Collections.emptyList();
		}
	}

	@Override
	public List<PoisonDTO> findByName(String name) {
		log.info("findByName in service : " + name);
		List<PoisonEntity> list = this.poisonRepo.findByName(name);
		List<PoisonDTO> dtos = new ArrayList<>();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos :" + dtos.size());
			log.info("Size of entities : " + list.size());
			return dtos;
		} else {
			log.info("Campany name is invalid, which is not present in the database");
			return Collections.emptyList();
		}
	}

	@Override
	public Set<ConstraintViolation<PoisonDTO>> validateAndUpdate(PoisonDTO dto) {
		log.info("validateAndUpdate(PoisonDTO PoisonDTO) in serviceImpl");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<PoisonDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			log.error("Violations in dto , can't update" + dto);
			return violations;
		}
		log.info("There is no violations in dto, can update" + dto);
		PoisonEntity entity = new PoisonEntity();
		BeanUtils.copyProperties(dto, entity);
		boolean saved = this.poisonRepo.update(entity);
		log.info("Entity updated : " + saved);
		return Collections.emptySet();
	}

	@Override
	public PoisonDTO delete(int id) {
		log.info("delete in Service..");
		PoisonEntity entity = this.poisonRepo.deleteRow(id);
		PoisonDTO dto = new PoisonDTO();
		if (entity != null) {
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<PoisonDTO> list() {
		log.info("list in service");
		List<PoisonEntity> list = this.poisonRepo.list();
		List<PoisonDTO> dtos = new ArrayList<>();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos :" + dtos.size());
			log.info("Size of entities : " + list.size());
			return dtos;
		} else {
			log.info("No data found in database");
			return Collections.emptyList();
		}
	}

	@Override
	public List<PoisonDTO> searchByNameAndCompany(String company, String name) {
		log.info("searchByNameAndCompany in service");
		List<PoisonEntity> list = this.poisonRepo.searchByNameAndCompany(company, name);
		List<PoisonDTO> dtos = new ArrayList<>();
		if (list != null && !list.isEmpty()) {
			for (PoisonEntity entity : list) {
				PoisonDTO dto = new PoisonDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos :" + dtos.size());
			log.info("Size of entities : " + list.size());
			return dtos;
		} else {
			log.info("No data found in database");
			return Collections.emptyList();
		}
	}
}
