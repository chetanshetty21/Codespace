package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	public CameraMan() {
		System.out.println("registering camera");
	}

	public void checkCamera() {
		System.out.println(this.hashCode() + " hashcode of Camera");
	}

}
