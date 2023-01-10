package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	private String country;
	private String name;
	private String budget;

	public Rocket(@Value("INDIA") String country, @Value("vikram") String name,
			@Value("13,700   crore") String budget) {
		super();
		this.country = country;
		this.name = name;
		this.budget = budget;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public String getBudget() {
		return budget;
	}

}
