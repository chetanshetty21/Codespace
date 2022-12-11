package com.xworkz.crud.repository.bridge;

public interface EmailRepository {
	boolean create(String email);
	default int totalEmails() {
		return 10;
	}

}
