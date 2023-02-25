package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindIdByNameAndState {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
//		ForestEntity entity1 =  manager.find(ForestEntity.class, 100);
		
		Query query = manager.createNamedQuery("findIdByNameAndState");
		Object object = query.getSingleResult();
		Integer entity = (Integer)object;
		System.out.println("Id is : "+entity);
//		System.out.println(entity1);
		manager.close();
	}
}
