package com.xworkz.poison.runner;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.poison.entity.PoisonEntity;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Runner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByCompany");
		Query setParameter = query.setParameter("bycompany", "UPL LTD");
		List<PoisonEntity> list = query.getResultList();
		list.forEach(p->System.out.println(p));
		
		System.out.println("==========================");
		
		EntityTransaction transaction = manager.getTransaction();
		PoisonEntity deleteEntity = manager.find(PoisonEntity.class, 8);
		if(deleteEntity!=null) {
		System.out.println(deleteEntity);
		transaction.begin();
		manager.remove(deleteEntity);
		transaction.commit();
		}
		
		System.out.println("=========================");
		Query query2 = manager.createNamedQuery("list");
		List<PoisonEntity> list2 = query2.getResultList();
		list2.forEach(p->System.out.println(p));
	}
}