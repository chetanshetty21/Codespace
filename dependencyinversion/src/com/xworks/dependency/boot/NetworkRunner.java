package com.xworks.dependency.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworks.dependency.beans.Chrome;
import com.xworks.dependency.beans.FireBox;
import com.xworks.dependency.configuration.NetworkConfiguration;

public class NetworkRunner {

	public static void main(String[] args) {
		ApplicationContext net = new AnnotationConfigApplicationContext(NetworkConfiguration.class);
		System.out.println(Arrays.toString(net.getBeanDefinitionNames()));
		Chrome chrome = net.getBean(Chrome.class);
		chrome.Browse();
		FireBox fireBox = net.getBean(FireBox.class);
		fireBox.Browse();

	}

}
