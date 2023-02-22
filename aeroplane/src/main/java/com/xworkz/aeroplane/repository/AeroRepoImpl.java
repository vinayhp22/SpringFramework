package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroEntity;

@Repository
public class AeroRepoImpl implements AeroRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public AeroRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(AeroEntity aeroEntity) {
		System.out.println("save(AeroEntity aeroEntity)"+ aeroEntity);
		
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aeroEntity);
		entityTransaction.commit();
		entityManager.close();
		
		return false;
	}
	
	@Override
	public AeroEntity find(int id) {
		System.out.println("find(int id) in repoImpl"+id);
		EntityManager manager =this.entityManagerFactory.createEntityManager();
		AeroEntity fromDb = manager.find(AeroEntity.class, id);
		manager.close();
		return fromDb;
	}

}
