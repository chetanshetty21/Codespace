package com.xworks.dependency.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworks.dependency")
public class BunkConfiguration {
	public BunkConfiguration() {
		System.out.println("creating BunkConfiguration");
	}

}
