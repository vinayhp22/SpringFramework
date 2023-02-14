package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.egg.dto.CMDTO;

@Repository
public class CMRepositoryImpl implements CMRepository {

	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	public CMRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(CMDTO cmdto) {
		System.out.println("Running save in CM"+cmdto);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(cmdto);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

}
