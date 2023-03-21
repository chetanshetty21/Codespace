package com.xworkz.saree.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

import com.xworkz.saree.configuration.WebConfiguration;
import com.xworkz.saree.entity.SareeEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class SareeDAOImpl implements SareeDAO {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(SareeEntity entity) {
		log.info("running save in dao");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(entity);
		et.commit();
		em.close();

		return false;
	}

	@Override
	public SareeEntity findById(int id) {
		log.info("find by id in dao" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		SareeEntity fromDb = entityManager.find(SareeEntity.class, id);
		entityManager.close();
		return fromDb;

	}

	@Override
	public List<SareeEntity> findByName(String name) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nameby", name);
			log.info("Query  :" + query);
			List<SareeEntity> list = query.getResultList();
			log.info("total list found in repo" + list.size());
			return list;
		} finally {
			manager.close();
			log.info("released the connection...");
		}
	}

	@Override
	public boolean update(SareeEntity entity) {
		log.info("created" + getClass().getSimpleName());
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
	public SareeEntity deleteById(int id) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		SareeEntity courtEntity = manager.find(SareeEntity.class, id);
		if (courtEntity != null) {
			transaction.begin();
			manager.remove(courtEntity);
			transaction.commit();
			manager.close();
			return courtEntity;
		} else {
			return SareeDAO.super.deleteById(id);
		}

	}

	@Override
	public List<SareeEntity> findByAll() {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByAll");
			System.out.println("Query:" + query);
			List<SareeEntity> list = query.getResultList();
			System.out.println("total list found in repo" + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("released the connection...");
		}
	}

	@Override
	public List<SareeEntity> findByTwoProperties(String name, String color) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByTwoProperties");
			System.out.println("Query:" + query);
			query.setParameter("nameby", name);
			query.setParameter("colorby", color);
			List<SareeEntity> list = query.getResultList();
			System.out.println("total list found in repo" + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("released the connection...");
		}
	}

}
