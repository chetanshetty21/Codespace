package com.classmate.abstraction.boot;

import com.classmate.abstraction.obeys.Chetan;
import com.classmate.abstraction.obeys.JavaTrainee;
import com.classmate.abstraction.things.Person;

public class PersonRunner {

	public static void main(String[] args) {
		// Person person = new Person(); can't create instance as person is abstract
		Person person = new JavaTrainee("Chetan", 24, 475455d, "male", 5.11);
		person.eat();
		person.setName("shashank");
		person.setGender("male");
		person.setAge(24);
		person.setPHNo(751245451);
		person.setHeight(5.11);
		person.sleep();

		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getHeight());
		System.out.println(person.getPHNo());

		Chetan chetan = new Chetan("chetan", 24, 7892225217d, "male", 5.11);

		chetan.completedProgram();
		chetan.gst();
		chetan.paidTax(0);
		chetan.training();
		chetan.uploadedTask();
		chetan.vat();
		

	}

}
