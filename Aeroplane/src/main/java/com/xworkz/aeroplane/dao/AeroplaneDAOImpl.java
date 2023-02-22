package com.xworkz.aeroplane.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEnitiy;

@Repository
public class AeroplaneDAOImpl implements AeroplaneDAO {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneDAOImpl() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEnitiy entity) {

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
	public AeroplaneEnitiy findById(int id) {
		System.out.println("find by id in dao" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEnitiy fromDb = entityManager.find(AeroplaneEnitiy.class, id);
		entityManager.close();
		return fromDb;

	}

}
