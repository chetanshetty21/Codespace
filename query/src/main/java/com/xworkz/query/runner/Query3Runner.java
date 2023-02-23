package com.xworkz.query.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.query.entity.QueryEntity;

public class Query3Runner {

	public static void main(String[] args) {
		

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.query");
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByNameAndStateAndArea");
			Object obj = query.getSingleResult();
			QueryEntity entity = (QueryEntity) obj;
			System.out.println(entity);
			manager.close();
 
	}

}
