package com.xworkz.fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.quarkus.runtime.annotations.CommandLineArguments;

@Configuration
@ComponentScan("com.xworkz.fi")
public class FiConfiguration {
	public FiConfiguration() {
	System.out.println("creating" + this.getClass().getSimpleName());	
	}

}
