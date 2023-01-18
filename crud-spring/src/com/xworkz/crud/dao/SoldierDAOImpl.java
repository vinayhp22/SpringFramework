package com.xworkz.crud.dao;

import com.xworkz.crud.dto.SoldierDTO;

public class SoldierDAOImpl implements SoldierDAO {

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("save method in DAO/Repo impl...");
		return false;
	}

}
