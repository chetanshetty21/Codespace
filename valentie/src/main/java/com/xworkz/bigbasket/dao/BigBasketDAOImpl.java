package com.xworkz.bigbasket.dao;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BigBasketDAOImpl implements Big {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	public BigBasketDAOImpl() {
		// TODO Auto-generated constructor stub
	}
}
