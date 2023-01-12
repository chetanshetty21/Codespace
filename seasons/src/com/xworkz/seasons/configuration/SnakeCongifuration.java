package com.xworkz.seasons.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class SnakeCongifuration {
	public SnakeCongifuration() {
		System.out.println("registering SnakeCongifuration");
	}
@Bean
	public String snakeName() {
		System.out.println("registering snakeName");
		return "python";
	}
@Bean
	public double snakeLength() {
		System.out.println("registering snakeLength");
		return 6.6;
	}

@Bean
	public String snakeType() {
		System.out.println("registering snakeType");
		return "Reptiles";

	
	}
@Bean
	public boolean snakePoisionous() {
		System.out.println("registering snakePoisionous");
		return true;
	
	}
@Bean
public String snakeColor() {
	System.out.println("registering snakePoisionous");
	return "grey";

}

}
