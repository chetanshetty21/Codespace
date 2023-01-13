package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;

	public Camera() {
		System.out.println("registering camera");
	}

	public void checkLens() {

		System.out.println(this.hashCode() + "hashcode of lens ");
	}

	public void checkBattery() {

		System.out.println(this.hashCode() + "hashcode of battery ");
	}
}
