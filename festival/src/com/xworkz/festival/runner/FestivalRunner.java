package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalRunner {

	public static void main(String[] args) {
		System.out.println("Running FestivalRunner");
		
		FestivalEntity entity = new FestivalEntity("D-Boss Bdy", "Karunadu", 30, "Cake", "D-Boss");
		FestivalEntity entity1 = new FestivalEntity("ABD Bdy", "Bengaluru", 1, "ABD Cake", "RCB -> ABD");
		FestivalEntity entity2 = new FestivalEntity("RCB vs CSK", "Karunadu", 3, "Cup cake", "RCB");
		FestivalEntity entity3 = new FestivalEntity("OM sir Bdy", "X-workz", 1, "Kaju katli", "Om sir");
		FestivalEntity entity4 = new FestivalEntity("My Bdy", "My Home", 1, "Bdy Cake", "Not Applicable");
		FestivalEntity entity5 = new FestivalEntity("Ugadi", "S-India", 2, "Obbattu", "Devru");
		FestivalEntity entity6 = new FestivalEntity("Sudeep Bdy", "Karunadu", 3, "Boondi", "Sudeep");
		FestivalEntity entity7 = new FestivalEntity("Suresh Raina Bdy", "India", 1, "Gajar ka halwa", "Suresh Raina");
		FestivalEntity entity8 = new FestivalEntity("Virat Bdy", "India", 1, "Ghevar", "Virat");
		FestivalEntity entity9 = new FestivalEntity("Yuvraj Bdy", "India", 1, "Gulab jamun", "Yuvraj");
		FestivalEntity entity10 = new FestivalEntity("Sehwag Bdy", "India", 1, "Jalebi", "Sehwag");
		FestivalEntity entity11 = new FestivalEntity("Sunil Chettri Bdy", "India", 1, "Kalakand", "Sunil Chettri");
		FestivalEntity entity12 = new FestivalEntity("Nan Hudgi Bdy", "nan select madid place", 1, "Kheer", "D-Boss");
		FestivalEntity entity13 = new FestivalEntity("Nan College get together", "college", 1, "Khirmohan", "College");
		FestivalEntity entity14 = new FestivalEntity("x-workz Day", "Xworkz", 1, "Kulfi", "x-workz");
		FestivalEntity entity15 = new FestivalEntity("Hostel Bdy", "Hostel", 1, "Laddu", "Hostel");
		FestivalEntity entity16 = new FestivalEntity("Prashant Bdy", "Prashant Sanga", 1, "Lassi", "Prashant");
		FestivalEntity entity17 = new FestivalEntity("Rudresh Bdy", "Rudresh Sanga", 1, "Motichoor laddu", "Rudresh");
		FestivalEntity entity18 = new FestivalEntity("Vinodha mam Bdy", "Xworkz", 1, "Malpua", "Vinodha mam");
		FestivalEntity entity19 = new FestivalEntity("Akshara Sir Bdy", "Xworkz", 1, "Nankhatai", "Akshara sir");
		FestivalEntity entity20 = new FestivalEntity("Vinay Sir Bdy", "Xworkz", 1, "Petha", "Vinay sir");
		FestivalEntity entity21 = new FestivalEntity("Ajji Bdy", "Nan MAne", 1, "Dharwad Pedha", "Ajji");
		FestivalEntity entity22 = new FestivalEntity("Tathan Bdy", "Nan MAne", 1, "Kakinada Kaaja", "Tathan");
		FestivalEntity entity23 = new FestivalEntity("Future GF Bdy", "Gotilla guru", 7, "Mysore Pak", "Future GF");
		FestivalEntity entity24 = new FestivalEntity("Future Magun Bdy", "Gotilla guru", 1, "Pongal", "Future Magun");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);
		transaction.commit();

		manager.close();
		
	}
	
}
