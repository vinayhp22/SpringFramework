package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.dto.ValentineDTO;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineDTO dto) {
		System.out.println("Running save in ValentineRepositoryImpl");
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		manager.close();
		
		return false;
	}
}
