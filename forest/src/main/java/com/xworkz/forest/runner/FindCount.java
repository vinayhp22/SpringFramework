package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindCount {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
//		ForestEntity entity1 =  manager.find(ForestEntity.class, 100);
		
		Query query = manager.createNamedQuery("findCount");
		Object object = query.getSingleResult();
		Long entity = (Long)object;
		System.out.println("Count is : "+entity);
//		System.out.println(entity1);
		manager.close();
	}
}
