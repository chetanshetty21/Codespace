package com.xworkz.crud.repository.bridge;

public interface SweetsNameRepository {
	boolean create(String sweet);
	default int totalSweets() {
		return 10;
	}
}
