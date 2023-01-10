package com.xworkz.maven1.thing;

import org.springframework.stereotype.Component;

@Component
public class Spring {
	public Spring() {
		System.out.println("spring class running");
	}
	@Override
	public String toString() {
		return "spring";
	}

}
