package com.xworkz.maven1.conguaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.maven1")

public class SpringConfiguaration {

	@Bean
	public String getSpring()
	{
		System.out.println("get spring method is running");
		return "String Method";
	}
	
	
}
