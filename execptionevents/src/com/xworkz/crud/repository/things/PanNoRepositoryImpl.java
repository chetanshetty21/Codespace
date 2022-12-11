package com.xworkz.crud.repository.things;

import com.xworkz.crud.repository.bridge.PanNumberRepository;
import com.xworkz.crud.repository.events.PanSizeExceededexception;

public class PanNoRepositoryImpl implements PanNumberRepository {
	private String[] panNo = new String[10];
	private int panNoIndex = 0;

	@Override
	public boolean create(String PanNo) {
		System.out.println("running create sweets repo...");
		if (this.panNoIndex > this.panNo.length) {
			throw new PanSizeExceededexception();
		}
		this.panNo[panNoIndex] = PanNo;
		this.panNoIndex++;
		return false;
	}

	
}
