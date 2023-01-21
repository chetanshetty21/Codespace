package com.xworkz.industry.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.industry.configration.SpringConfiguration;
import com.xworkz.industry.dto.FirstAidDTO;
import com.xworkz.industry.dto.MissileDTO;
import com.xworkz.industry.dto.ResortDTO;
import com.xworkz.industry.service.FirstAidService;
import com.xworkz.industry.service.MissileService;
import com.xworkz.industry.service.ResortService;

public class SpringRunner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = spring.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println(saved);
		
		ResortService service1 = spring.getBean(ResortService.class);
		boolean saved1 = service1.validateAndSave(new ResortDTO());
		System.out.println(saved1);
		
		MissileService service2 = spring.getBean(MissileService.class);                                                                                                                                                                                                                                                                                                                       saved2 = service2.validateAndSave(new MissileDTO());
		System.out.println(saved2);
	
	
	
	}
}
