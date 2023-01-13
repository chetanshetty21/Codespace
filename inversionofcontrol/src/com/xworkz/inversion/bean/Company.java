package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;

	public Company() {
		System.out.println("registering Comapany");
	}

	public void checkLocation() {
		System.out.println(this.hashCode() + "hashcode of location ");
	}
}
