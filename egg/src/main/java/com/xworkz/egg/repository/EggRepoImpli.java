package com.xworkz.egg.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.egg.DTO.EggDTO;

@Repository
public class EggRepoImpli implements EggRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public EggRepoImpli() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto) {
		System.out.println("Running save in serviceImpli");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		return false;
	}

}