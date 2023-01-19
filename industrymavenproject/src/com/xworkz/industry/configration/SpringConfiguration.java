package com.xworkz.industry.configration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.xworkz.industry")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("created configuration");
	}

	@Bean
	public Validator validator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valide = factory.getValidator();
		return valide;
	}
}
