package com.xworkz.validating.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BakeryWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses");

		Class[] ref= {SpringConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
       String[] str= {"/"};
		return str;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}
}
