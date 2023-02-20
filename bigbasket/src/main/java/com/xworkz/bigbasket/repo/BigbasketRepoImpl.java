package com.xworkz.bigbasket.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasket.dto.BigbasketDTO;
import com.xworkz.bigbasket.entity.BigbasketEntity;

@Repository
public class BigbasketRepoImpl implements BigbasketRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public BigbasketRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BigbasketEntity entity) {
		System.out.println("save method in BigbasketRepoImpl");
		
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		
		return false;
	}

}
