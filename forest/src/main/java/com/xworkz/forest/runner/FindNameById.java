package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class FindNameById {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		
		
		Query query = manager.createNamedQuery("findNameById");
		Object object = query.getSingleResult();
		String entity = (String)object;
		System.out.println("Name is : "+entity);

		System.out.println("====================================");
		ForestEntity entity1 =  manager.find(ForestEntity.class, 5);
		System.out.println(entity1.getName());
		System.out.println(entity1);
		manager.close();
	}
}
