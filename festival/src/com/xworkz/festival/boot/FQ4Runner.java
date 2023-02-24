package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FQ4Runner {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
	EntityManager manager = factory.createEntityManager();
	Query query = manager.createNamedQuery("findTotalDaysByName");
	query .setParameter("nameby","Rakshabandhan");
	long entity=(long) query.getSingleResult();
	System.out.println(entity);
	manager.close();
}
}
