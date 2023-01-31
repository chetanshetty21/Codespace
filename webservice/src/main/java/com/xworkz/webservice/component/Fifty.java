package com.xworkz.webservice.component;

import org.springframework.stereotype.Component;

@Component
public class Fifty {
	public Fifty() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}
	

}
