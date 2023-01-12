package com.xworkz.seasons.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration

public class NewsPaperCongifuration {
	public NewsPaperCongifuration() {
		System.out.println("registering SnakeCongifuration");
	}
	@Bean
	public int NewsPaperId() {
		System.out.println("registering NewsPaperId");
		return 06;
	}
	@Bean
	public String NewsPaperLang() {
		System.out.println("registering NewsPaperLang");
		return "kannada";
	}
	@Bean
	public String newspaperName() {
		System.out.println("registering newspaperName");
		return "vijiyavani";
	}
	@Bean
	public String newspaperOwnerNmae() {
		System.out.println("registering newspaperOwnerNmae");
		return "vijiy";
	}
	@Bean
	public int NewsPaperPrice() {
		System.out.println("registering NewsPaperPrice");
		return 2;
	}
	
}
