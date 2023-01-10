package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.BeanInitisationConfiguration;
import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

public class BeanInitalisationRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BeanInitisationConfiguration.class);

		Actor actor = container.getBean("actor", Actor.class);
		System.out.println(actor);
		System.out.println(actor.getLang());
		System.out.println(actor.getAge());
		System.out.println(actor.getName());
		System.out.println("@#$%@#$%@#$%@#$%");
		Rocket refOfRocket = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		System.out.println("~~~~~~~~");

		Season refOfSeason2 = container.getBean("season", Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartingMonth());
		System.out.println(refOfSeason2.getDuration());
	}

}
