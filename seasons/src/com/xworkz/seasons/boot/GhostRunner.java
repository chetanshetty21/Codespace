package com.xworkz.seasons.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.seasons.configuration.EngineCongifuration;
import com.xworkz.seasons.configuration.GhostCongifuration;

public class GhostRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(GhostCongifuration.class);

		String[] bean = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());
		//Engine ref1 = container.getBean("engineName" Engine.class);
		//System.out.println(ref1.getCompany());
		
	}
}
