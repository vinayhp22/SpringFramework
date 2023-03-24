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

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class PoisonRepoImpl implements PoisonRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public PoisonRepoImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PoisonEntity PoisonEntity) {
		log.info("save(PoisonEntity PoisonEntity)" + PoisonEntity);

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
		log.info("find(int id) in repoImpl" + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		PoisonEntity fromDb = manager.find(PoisonEntity.class, id);
		if(fromDb!=null) {
		log.info(""+fromDb);
		}else {
			log.info("Data not found - find repoImpl");
		}
		manager.close();
		return fromDb;
	}

	@Override
	public List<PoisonEntity> findByCompany(String company) {
		log.info("findByCompany in repo : " + company);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByCompany");
			query.setParameter("bycompany", company);
			List<PoisonEntity> list = query.getResultList();
			list.forEach(p -> log.info(""+p));
			log.info("Total list : " + list.size());
			return list;
		} catch (PersistenceException e) {
			log.info("PersistenceException");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			log.info("IllegalArgumentException");
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return Collections.emptyList();
	}
	
	@Override
	public List<PoisonEntity> findByName(String name) {
		log.info("findByName in repo : " + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("byname", name);
			List<PoisonEntity> list = query.getResultList();
			list.forEach(p -> log.info(""+p));
			log.info("Total list : " + list.size());
			return list;
		} catch (PersistenceException e) {
			log.info("PersistenceException");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			log.info("IllegalArgumentException");
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return Collections.emptyList();
	}

	@Override
	public boolean update(PoisonEntity entity) {
		log.info("update(PoisonEntity entity) in repoimpl");
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
		log.info("deleteRow in repo..");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			PoisonEntity deleteEntity = manager.find(PoisonEntity.class, id);
			log.info(""+deleteEntity);
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
		log.info("list on repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("list");
			List<PoisonEntity> list = query.getResultList();
			list.forEach(p -> log.info(""+p));
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
		log.info("searchByNameAndCompany in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("searchByNameAndCompany");
			query.setParameter("bycompany", company);
			query.setParameter("byname", name);
			List<PoisonEntity> list = query.getResultList();
			list.forEach(p -> log.info(""+p));
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return PoisonRepo.super.searchByNameAndCompany(company, name);
	}
}
