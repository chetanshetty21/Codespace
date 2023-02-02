package com.xworkz.interview.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.interview")
public class InterviewConfiguration {

	public InterviewConfiguration() {
		System.out.println("creating" + this.getClass().getSimpleName());

	}
}
