package com.xworkz.crud.repository.boot;

import com.xworkz.crud.repository.bridge.EmailRepository;
import com.xworkz.crud.repository.things.EmailRepositoryImpl;

public class EmailRunner {

	public static void main(String[] args) {
		EmailRepository emailRepositoryImpl = new EmailRepositoryImpl();
		emailRepositoryImpl.create("chetansv21@gmail.com");
		emailRepositoryImpl.create("rachanalr97@gmailcom");
		emailRepositoryImpl.create("shashank16@gmailcom");
		emailRepositoryImpl.create("bhagyalakshmi16@gmailcom");
		emailRepositoryImpl.create("venkateshs05@gmailcom");
		emailRepositoryImpl.create("kiran11@gmail.com");
		emailRepositoryImpl.create("rowdy20@gmail.com");
		emailRepositoryImpl.create("srinivas12@gmailcom");
		emailRepositoryImpl.create("charu09@gmail.com");
		emailRepositoryImpl.create("arjun21@gmail.com");
    	emailRepositoryImpl.create("arjun21@gmail.com");
		
		System.out.println( emailRepositoryImpl.totalEmails());
	}
	}


