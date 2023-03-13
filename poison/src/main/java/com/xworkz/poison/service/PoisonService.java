package com.xworkz.poison.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.poison.dto.PoisonDTO;
import com.xworkz.poison.entity.PoisonEntity;

public interface PoisonService {

	Set<ConstraintViolation<PoisonDTO>> validateAndSave(PoisonDTO dto);
	
	Set<ConstraintViolation<PoisonDTO>> validateAndUpdate(PoisonDTO dto);

	PoisonDTO delete(int id);
	
	default PoisonDTO findById(int id) {
		return null;
	}
	
	default List<PoisonDTO> findByCompany(String company) {
		return Collections.emptyList();
	}
	
	default List<PoisonDTO> findByName(String name) {
		return Collections.emptyList();
	}
	
	default List<PoisonDTO> list(){
		return Collections.emptyList();
	}
	
	default List<PoisonDTO> searchByNameAndCompany(String company, String name){
		return Collections.emptyList();
	}
	
}
