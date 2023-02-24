package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FQ6Runner {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaingodAndTotalDaysByName");
		query .setParameter("nameby","Janmashtami");
		Object results= query.getSingleResult();
		Object[] array=(Object[])results;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		manager.close();	
	}
	}