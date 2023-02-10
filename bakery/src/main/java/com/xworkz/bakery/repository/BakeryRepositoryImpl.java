package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;
import com.xworkz.bakery.dto.BakeryDTO;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository {

	public BakeryRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running save(BakeryDTO dto) in BakeryRepositoryImpl");
		return false;
	}

}
