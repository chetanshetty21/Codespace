package com.xworks.dependency.beans;

import org.springframework.stereotype.Component;

import com.xworks.dependency.connection.Fuel;

@Component
public class Petrol implements Fuel {
	public Petrol() {
		System.out.println("creating petrol");

	}
	@Override
	public void consume() {
		System.out.println("runnng consume fuel from petrol");
		Fuel.super.consume();
	}

//	public int petrolPrice() {
//		System.out.println("price of petrol");
//		return 101;
//	}
}
