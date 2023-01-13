package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Producer {
	@Autowired
	private Assistant assistant;

	public Producer() {
		System.out.println("registering Producer");
	}

	public void checkAssistant() {
		System.out.println(this.hashCode() + "hashcode of Assistant  ");
	}
}
