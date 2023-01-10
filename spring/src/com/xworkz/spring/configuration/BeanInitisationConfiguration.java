package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

@ComponentScan("com.xworkz.spring")
@Configuration
public class BeanInitisationConfiguration {

	public BeanInitisationConfiguration() {
		System.out.println("running BeanInitisationConfiguration()");
	}

	@Bean
	public Actor act() {
		Actor actor = new Actor();
		return actor;
	}

	@Bean
	public Rocket launch() {
		Rocket rocket = new Rocket("PSLV", "INDIA", "121 crore");
		return rocket;
	}

	@Bean
	public Season shower() {
		Season season = new Season();
		season.setDuration(4);
		season.setName("winter");
		season.setStartingMonth("nov");
		return season;
	}

}
