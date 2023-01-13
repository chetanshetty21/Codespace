package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Assistant {
	@Autowired
	private Company company;

	public Assistant() {
		System.out.println("registering Assistant");
	}

	public void checkCompany() {
		System.out.println(this.hashCode() + "hashcode of Company  ");
	}
}
