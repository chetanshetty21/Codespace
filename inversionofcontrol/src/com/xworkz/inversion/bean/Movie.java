package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;

	public Movie() {

		System.out.println("registering Movie");

	}

	public void checkDirector() {
		System.out.println(this.hashCode() + "hashcode of Director");

	}

	public void checkProducer() {
		System.out.println(this.hashCode() + "hashcode of Producer");

	}

}
