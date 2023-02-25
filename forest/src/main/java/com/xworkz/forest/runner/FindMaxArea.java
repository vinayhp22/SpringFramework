package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxArea {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
//		ForestEntity entity1 =  manager.find(ForestEntity.class, 100);
		
		Query query = manager.createNamedQuery("findMaxArea");
		Object object = query.getSingleResult();
		String entity = (String)object;
		System.out.println(entity);
//		System.out.println(entity1);
		manager.close();
	}
}
