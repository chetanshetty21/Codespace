package com.xworks.dependency.boot;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworks.dependency.beans.Shell;
import com.xworks.dependency.configuration.BunkConfiguration;
import com.xworks.dependency.connection.PetrolBunk;

public class BunkRunner {

	public static void main(String[] args) {
		ApplicationContext box=new AnnotationConfigApplicationContext(BunkConfiguration.class);
		System.out.println(Arrays.toString(box.getBeanDefinitionNames()));
		PetrolBunk bunk=box.getBean(PetrolBunk.class);
		bunk.purchase();
		
	}

}
