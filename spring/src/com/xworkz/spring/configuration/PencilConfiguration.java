package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration

public class PencilConfiguration {
	@Bean
	public String PencilName() {
		System.out.println("registering PencilName");
		return "apsara";
	}

	@Bean
	public String PencilType() {
		System.out.println("registering PencilType");
		return "pen pencil";
	}

	@Bean
	public String PencilPrice() {
		System.out.println("registering PencilPrice");
		return "50";
	}

	@Bean
	public String PencilColor() {
		System.out.println("registering PencilColor");
		return "blue";
	}
	@Bean
	public String PencilSharp() {
		System.out.println("registering PencilSharp");
		return "true";
	}
	@Bean
	public String PencilStolen() {
		System.out.println("registering PencilStolen");
		return "false";
	}

}
