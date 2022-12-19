package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.TheaterDTO;
import com.xworkz.ipl.execption.StorageFullException;

public class TheaterRepositoryImpl implements TheaterRepository {
	private TheaterDTO[] elementDTOs = new TheaterDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(TheaterDTO DTO) {
		System.out.println("running save method" + DTO);
		if (this.currentIndex >= this.elementDTOs.length) {
			throw new StorageFullException("Storage is full");

		}
		return true;
	}

}
