package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;

	public Battery() {
		System.out.println("registering Battery");
	}

	public void CheckRef() {
		System.out.println(this.hashCode() + "hascode of teh ref");
	}

}
