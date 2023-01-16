package com.xworks.dependency.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworks.dependency.connection.Fuel;
@Component
public class Diesel implements Fuel{
	
	public Diesel() {
		System.out.println("creating diesel ");
	}
	@Override

	public void consume() {
		System.out.println("runnng consume fuel from diesel");
		Fuel.super.consume();
	}
//	public int dieselPrice() {
//		System.out.println("price of dieselPrice");
//		return 89;
//	}
}
