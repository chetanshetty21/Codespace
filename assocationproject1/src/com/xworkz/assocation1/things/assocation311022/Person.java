package com.xworkz.assocation1.things.assocation311022;

public class Person {
	public String name;
	public Email[] email;
	public Job job;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setEmail(Email[] email) {
		this.email = email;

	}

	public void setJob(Job job) {

		this.job = job;

	}

	public void setShow() {
		System.out.println(this.email);
		if (email != null) {
			for (int i = 0; i < email.length; i++) {
				Email email2 = email[i];
				email2.showOff();

			}

		} else {
			System.out.println("ngt to show");
		}
	}
}
