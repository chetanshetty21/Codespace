package com.xworkz.seasons.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages= "com.xworkz.seasons",excludeFilters = {@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value = {GhostCongifuration.class,NewsPaperCongifuration.class,SnakeCongifuration.class})})
public class EngineCongifuration {
	
	public EngineCongifuration() {
		System.out.println("registering EngineCongifuration ");
	}
	@Bean
	public String engineName() {
		System.out.println("registering  engineName ");
		return "diesel engine";
	}
	@Bean
	public float engineNumber() {
		System.out.println("registering  engineNumber");
		return 2.5f;
	}
	@Bean
	public String engineType() {
		System.out.println("registering  engineType ");
		return "External combustion engine";
	}
	@Bean
	public double engineVersion() {
		System.out.println("registering engineVersion ");
		return 3.2 ;
	}
	@Bean
	public String engineCompany() {
		System.out.println("registering  engineCompany ");
		return "BMW" ;
	}
	@Bean
	public int engineStrokes() {
		System.out.println("registering engineStrokes ");
		return 4 ;
	}

}
