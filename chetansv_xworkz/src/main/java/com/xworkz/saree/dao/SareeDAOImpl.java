package com.xworkz.saree.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.saree.entity.SareeEntity;

@Repository
public class SareeDAOImpl implements SareeDAO {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(SareeEntity entity) {
		System.out.println("running save in dao");
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
		System.out.println("find by id in dao" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		SareeEntity fromDb = entityManager.find(SareeEntity.class, id);
		entityManager.close();
		return fromDb;

	}
}
