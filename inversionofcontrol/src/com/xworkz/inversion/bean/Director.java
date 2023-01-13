package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience experience;
	@Autowired
	private CameraMan cameraMan;

	public Director() {

		System.out.println("registering Director");

	}

	public void checkExperience() {
		System.out.println(this.hashCode() + "hashcode of experience");

	}

	public void checkCameraMan() {
		System.out.println(this.hashCode() + "hashcode of CameraMan");

	}

}
