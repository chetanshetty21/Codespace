package com.xworkz.crud.repository.bridge;

public interface PanNumberRepository {
	boolean create(String pan);

	default int panNoIndex() {
		return 10;
	}
}
