package com.xworkz.validation.dao;

import org.springframework.stereotype.Component;
import com.xworkz.validation.dto.MissileDTO;

@Component
public class MissileDAOImpl implements MissileDAO {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Running save - MissileDAOImpl");
		System.out.println("MissileDTO : "+dto);
		return false;
	}

}
