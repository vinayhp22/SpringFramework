package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryRepository bakeryRepository;
	
	public BakeryServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave(BakeryDTO dto)"+dto);
		boolean saved = this.bakeryRepository.save(dto);
		System.out.println("Saved in repo : "+saved);
		return false;
	}

}