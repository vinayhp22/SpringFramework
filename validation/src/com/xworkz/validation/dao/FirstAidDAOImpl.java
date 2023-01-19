package com.xworkz.validation.dao;

import org.springframework.stereotype.Component;
import com.xworkz.validation.dto.FirstAidDTO;

@Component
public class FirstAidDAOImpl implements FirstAidDAO {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save - FirstAidDAOImpl");
		System.out.println("FirstAidDTO : "+dto);
		return false;
	}

}
