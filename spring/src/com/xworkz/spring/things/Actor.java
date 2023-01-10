package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	@Value("chetan")
	private String name;
	@Value("24")
	private int age;
	@Value("kannada")
	private String lang;

	public Actor() {
		System.out.println("running default method");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getLang() {
		return lang;
	}

}
