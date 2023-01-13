package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Area {
	public Area() {
		System.out.println("registering Area");
	}

}
