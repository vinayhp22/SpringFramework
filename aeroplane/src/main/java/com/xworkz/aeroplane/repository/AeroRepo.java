package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.entity.AeroEntity;

public interface AeroRepo {

	boolean save(AeroEntity aeroEntity);
	
	default AeroEntity find(int id) {
		return null;
	}
}
