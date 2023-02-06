package com.xworkz.chetan.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.chetan")
public class ServerConfiguration {
	public ServerConfiguration() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}
}
