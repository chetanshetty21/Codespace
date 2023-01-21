package com.xworkz.crud.repository.things;

import com.xworkz.crud.repository.bridge.EmailRepository;
import com.xworkz.crud.repository.events.EmailSizeExceededexception;


public class EmailRepositoryImpl implements EmailRepository {
	private String[] emails = new String[10];
	private int emailIndex = 0;

	
	@Override
	public boolean create(String email) {
		System.out.println("running create gmail repo...");
		 
		if(this.emailIndex < this.emails.length) 
		{
			throw new EmailSizeExceededexception();
		}
		this.emails[emailIndex] = email;
		this.emailIndex++;
		return false;
	}
	@Override
	
	public int totalEmails() {
		// TODO Auto-generated method stub
		return EmailRepository.super.totalEmails();
	}

}
