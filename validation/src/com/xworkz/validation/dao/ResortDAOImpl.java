package com.xworkz.validation.dao;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.ResortDTO;

@Component
public class ResortDAOImpl implements ResortDAO {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save - ResortDAOImpl");
		System.out.println("ResortDTO : "+dto);
		return false;
	}

}
