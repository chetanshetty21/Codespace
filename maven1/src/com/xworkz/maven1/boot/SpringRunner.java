package com.xworkz.maven1.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.maven1.conguaration.SpringConfiguaration;
import com.xworkz.maven1.thing.Spring;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		
		String ref=applicationContext.getBeanDefinitionNames(SpringConfiguaration.class);
		
//		Spring spring = applicationContext.getBean(Spring.class);
//		System.out.println(spring.toString());

	}

}
