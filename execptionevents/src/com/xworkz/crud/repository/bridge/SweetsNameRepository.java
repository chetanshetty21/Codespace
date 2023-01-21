package com.xworkz.crud.repository.bridge;

public interface SweetsNameRepository {
	boolean create(String pan);

	default int totalSweets() {
		return 10;
	}
}
