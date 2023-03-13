package com.xworkz.poison.repository;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.poison.entity.PoisonEntity;

@Repository
public class PoisonRepoImpl implements PoisonRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public PoisonRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PoisonEntity PoisonEntity) {
		System.out.println("save(PoisonEntity PoisonEntity)" + PoisonEntity);

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(PoisonEntity);
		entityTransaction.commit();
		entityManager.close();

		return false;
	}

	@Override
	public PoisonEntity find(int id) {
		System.out.println("find(int id) in repoImpl" + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		PoisonEntity fromDb = manager.find(PoisonEntity.class, id);
		if(fromDb!=null) {
		System.out.println(fromDb);
		}else {
			System.out.println("Data not found - find repoImpl");
		}
		manager.close();
		return fromDb;
	}

	@Override
	public List<PoisonEntity> findByCompany(String company) {
		System.out.println("findByCompany in repo : " + company);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByCompany");
			query.setParameter("bycompany", company);
			List<PoisonEntity> list = query.getResultList();
			list.forEach(p -> System.out.println(p));
			System.out.println("Total list : " + list.size());
			return list;
		} catch (PersistenceException e) {
			System.out.println("PersistenceException");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return Collections.emptyList();
	}
	
	@Override
	public List<PoisonEntity> findByName(String name) {
		System.out.println("findByName in repo : " + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("byname", name);
			List<PoisonEntity> list = query.getResultList();
			list.forEach(p -> System.out.println(p));
			System.out.println("Total list : " + list.size());
			return list;
		} catch (PersistenceException e) {
			System.out.println("PersistenceException");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return Collections.emptyList();
	}

	@Override
	public boolean update(PoisonEntity entity) {
		System.out.println("update(PoisonEntity entity) in repoimpl");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public PoisonEntity deleteRow(int id) {
		System.out.println("deleteRow in repo..");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			PoisonEntity deleteEntity = manager.find(PoisonEntity.class, id);
			System.out.println(deleteEntity);
			if (deleteEntity != null) {
				transaction.begin();
				manager.remove(deleteEntity);
				transaction.commit();
				return deleteEntity;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<PoisonEntity> list() {
		System.out.println("list on repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("list");
			List list = query.getResultList();
			list.forEach(p -> System.out.println(p));
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return PoisonRepo.super.list();
	}

	@Override
	public List<PoisonEntity> searchByNameAndCompany(String company, String name) {
		System.out.println("searchByNameAndCompany in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("searchByNameAndCompany");
			query.setParameter("bycompany", company);
			query.setParameter("byname", name);
			List list = query.getResultList();
			list.forEach(p -> System.out.println(p));
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return PoisonRepo.super.searchByNameAndCompany(company, name);
	}
}
