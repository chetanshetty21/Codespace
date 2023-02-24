package com.xworkz.query.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.query.entity.QueryEntity;

public class InsertRunner {
	public static void main(String[] args) {
		System.out.println("running main method for inserting data to data base");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.query");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		QueryEntity entity = new QueryEntity(1, "Bandipur National Park", "Karnataka", 874, " dry deciduous forests");
		QueryEntity entity1 = new QueryEntity(2, "Bhitarkanika Mangroves", "Odisha", 0, "mangrove wetland");
		QueryEntity entity2 = new QueryEntity(3, "Bhagwan Mahaveer Sanctuary and Mollem National Park", "goa", 650,
				"West Coast tropical evergreen forests");
		QueryEntity entity3 = new QueryEntity(4, "Jakanari reserve forest", "combatore", 520, " reserve forest ");
		QueryEntity entity4 = new QueryEntity(5, "jim Corbett National Park", "uttarakhand", 450,
				"Dense moist deciduous forest");
		QueryEntity entity5 = new QueryEntity(6, "Kanha National Park", "Madhya Pradesh", 651, "evergreen Sal forests");
		QueryEntity entity6 = new QueryEntity(7, "Keibul Lamjao National Park", "Manipur", 40, "moist semi–evergreen");
		QueryEntity entity7 = new QueryEntity(8, "Kukrail Reserve Forest", " Uttar Pradesh", 208, "plantation forest");
		QueryEntity entity8 = new QueryEntity(9, "Namdapha National Park", "Arunachal Pradesh", 1985,
				"tropical rain forest");
		QueryEntity entity9 = new QueryEntity(10, "Nanmangalam forest", " Tamil Nadu", 24, "scrubland");
		QueryEntity entity10 = new QueryEntity(11, "Sundarbans", "West Bengal", 3260, "mangrove forest");
		QueryEntity entity11 = new QueryEntity(12, "Sundarban", "West Bengal", 900, "mangrove ");
		transaction.begin();
		manager.persist(entity);
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
		transaction.commit();

	}
}
