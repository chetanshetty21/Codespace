package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;

	private int duration;

	private String startingMonth;

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("summer seasons")
	public void setName(String name) {
		this.name = name;
	}

	@Value("3")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Value("feb")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
