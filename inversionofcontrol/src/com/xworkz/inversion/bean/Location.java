package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	private Area area;

	public Location() {
		System.out.println("registering location");
	}

	public void checkArea() {
		System.out.println(this.hashCode() + "hashcode of area");
	}
}
