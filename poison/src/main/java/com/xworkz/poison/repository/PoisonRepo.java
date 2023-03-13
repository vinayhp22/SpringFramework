package com.xworkz.poison.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.poison.entity.PoisonEntity;

public interface PoisonRepo {

	boolean save(PoisonEntity PoisonEntity);
	
	boolean update(PoisonEntity entity);

	PoisonEntity deleteRow(int id);
	
	default PoisonEntity find(int id) {
		return null;
	}
	
	default List<PoisonEntity> findByCompany(String company) {
		return Collections.emptyList();
	}
	
	default List<PoisonEntity> findByName(String name) {
		return Collections.emptyList();
	}
	
	default List<PoisonEntity> list(){
		return Collections.emptyList();
	}
	
	default List<PoisonEntity> searchByNameAndCompany(String company, String name){
		return Collections.emptyList();
	}

	;
	
}
