package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class HardwareShopConfiguration {
	@Bean
	public int HardwareShopIdNO() {
		System.out.println("registering HardwareShopIdNO");
		return 022;
	}

	@Bean
	public String HardwareShopName() {
		System.out.println("registering HardwareShopName");
		return "chetan";
	}

	@Bean
	public double HardwareShopGstNo() {
		System.out.println("registering HardwareShopGstNo");
		return 52485465;
	}

	@Bean
	public String HardwareShopOwnerName() {
		System.out.println("registering HardwareShopOwnerName");
		return "chetan";
	}

	@Bean
	public String HardwareShopAdress() {
		System.out.println("registering HardwareShopAdress");
		return "mhalakshmi layout";
	}
}
