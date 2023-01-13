package com.xworkz.inversion.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.inversion")
public class InvestionConfiguration {
	public InvestionConfiguration() {
		System.out.println("created InvestionConfiguration");
	}
}
