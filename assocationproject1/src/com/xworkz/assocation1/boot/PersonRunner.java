package com.xworkz.assocation1.boot;

import com.xworkz.assocation1.things.assocation311022.Email;
import com.xworkz.assocation1.things.assocation311022.Job;
import com.xworkz.assocation1.things.assocation311022.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person person1 = new Person("Chetan");
		Job job = new Job(12854612, " Designer", 8);
		Email email1 = new Email("Chetansv.xworkz.com", "1275484", 789225217d);
		
		Email email2 = new Email("shashanksv.xworkz.com", "753158646", 789225217d);
		Email[] emails= {email1,email2};
	
		person1.setEmail(emails);
		person1.setJob(job);
		
		person1.setShow();

		//job .setCompany();


		
}
}
