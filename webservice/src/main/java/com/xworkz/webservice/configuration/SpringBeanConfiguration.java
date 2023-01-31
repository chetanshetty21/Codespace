package com.xworkz.webservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.webservice")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("creating" + this.getClass().getSimpleName());

}
}