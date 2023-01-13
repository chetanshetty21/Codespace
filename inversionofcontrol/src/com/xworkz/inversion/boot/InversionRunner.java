package com.xworkz.inversion.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.inversion.bean.Movie;
import com.xworkz.inversion.configuration.InvestionConfiguration;

public class InversionRunner {
	public static void main(String[] args) {
ApplicationContext container =new AnnotationConfigApplicationContext(InvestionConfiguration.class);
System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	Movie movie=container.getBean(Movie.class);
	System.out.println(movie);
	movie.checkDirector();
	movie.checkProducer();
	}
}
