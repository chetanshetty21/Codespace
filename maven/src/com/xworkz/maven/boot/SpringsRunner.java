package com.xworkz.maven.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.maven.configaration.SpringConfigartion;
import com.xworkz.maven.things.SpringSeasons;

public class SpringsRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfigartion.class);
	SpringSeasons seasons=	 applicationContext.getBean(SpringSeasons.class);
	
	System.out.println(seasons.toString());
	}

}
