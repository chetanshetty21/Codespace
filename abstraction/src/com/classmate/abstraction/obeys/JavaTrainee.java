package com.classmate.abstraction.obeys;

import com.classmate.abstraction.rules.XworkzRule;
import com.classmate.abstraction.things.Person;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, int age, double pHNo, String gender, double height) {
		super(name, age, pHNo, gender, height);
		
	}

	@Override
	public boolean uploadedTask() {

		return false;
	}

	@Override
	public boolean completedProgram() {

		return false;

	}

	public void training() {
		System.out.println("training started");
	}

	public void executePograme() {
		System.out.println("executePograme started");
	}

}
