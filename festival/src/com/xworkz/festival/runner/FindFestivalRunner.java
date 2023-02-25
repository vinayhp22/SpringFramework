package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindFestivalRunner {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		System.out.println("\n======================findByIdAndName=========================\n");
		Query findByIdAndName = manager.createNamedQuery("findByIdAndName");
		findByIdAndName.setParameter("byid", 1);
		findByIdAndName.setParameter("byname", "D-Boss Bdy");
		FestivalEntity festivalEntity = (FestivalEntity) findByIdAndName.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(festivalEntity);

		System.out.println("\n========================findByNameAndRegionAndMainGod=======================\n");
		Query findByNameAndRegionAndMainGod = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		findByNameAndRegionAndMainGod.setParameter("byregion", "Karunadu");
		findByNameAndRegionAndMainGod.setParameter("byname", "RCB vs CSK");
		findByNameAndRegionAndMainGod.setParameter("bymainGod", "RCB");
		FestivalEntity festivalEntity1 = (FestivalEntity) findByNameAndRegionAndMainGod.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(festivalEntity1);

		System.out.println("\n=====================findByMainGod==========================\n");
		Query findByMainGod = manager.createNamedQuery("findByMainGod");
		findByMainGod.setParameter("bymainGod", "RCB");
		FestivalEntity festivalEntity2 = (FestivalEntity) findByMainGod.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(festivalEntity2);

		System.out.println("\n=====================findTotalDaysByName==========================\n");
		Query findTotalDaysByName = manager.createNamedQuery("findTotalDaysByName");
		findTotalDaysByName.setParameter("byname", "D-Boss Bdy");
		int totalDays = (int) findTotalDaysByName.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(totalDays);

		System.out.println("\n=====================findRegionAndMainGodByNameAndId==========================\n");
		Query findRegionAndMainGodByNameAndId = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		findRegionAndMainGodByNameAndId.setParameter("byname", "D-Boss Bdy");
		findRegionAndMainGodByNameAndId.setParameter("byid", 1);
		Object[] regionAndMainGod = (Object[]) findRegionAndMainGodByNameAndId.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(regionAndMainGod[0]);
		System.out.println(regionAndMainGod[1]);

		System.out.println("\n=====================findMainGodAndTotalDaysByName==========================\n");
		Query findMainGodAndTotalDaysByName = manager.createNamedQuery("findMainGodAndTotalDaysByName");
		findMainGodAndTotalDaysByName.setParameter("byname", "D-Boss Bdy");
		Object[] mainGodAndTotalDays = (Object[]) findMainGodAndTotalDaysByName.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(mainGodAndTotalDays[0]);
		System.out.println(mainGodAndTotalDays[1]);

		System.out.println("\n=====================findTotal==========================\n");
		Query findTotal = manager.createNamedQuery("findTotal");
		long total = (long) findTotal.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(total);

		System.out.println("\n=====================findMaxTotalDays==========================\n");
		Query findMaxTotalDays = manager.createNamedQuery("findMaxTotalDays");
		int maxTotalDays = (int) findMaxTotalDays.getSingleResult();
		System.out.println("\n===============================================\n");
		System.out.println(maxTotalDays);
	}
}
