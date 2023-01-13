package com.xworkz.inversion.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	private Skill skill;

	public Experience() {
		System.out.println("register experience");
	}
	
	public void checkSkill() {
		System.out.println(this.hashCode()+"hash code of skill");
	}

}
