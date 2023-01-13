package com.xworkz.seasons.boot;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.seasons.configuration.EngineCongifuration;
import com.xworkz.seasons.things.Engine;

public class EngineRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(EngineCongifuration.class);

		String[] bean = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		Engine ref1 = container.getBean( "Engine",Engine.class);
		System.out.println(ref1.getCompany());
		
	}

}
