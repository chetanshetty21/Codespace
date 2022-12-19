package com.xworkz.ipl.repository;

import com.xworkz.ipl.constant.BakeryDTO;
import com.xworkz.ipl.dto.TheaterDTO;
import com.xworkz.ipl.execption.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository{

	private BakeryDTO[] elementDTOs = new BakeryDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(BakeryDTO DTO) {
		System.out.println("running save method" + DTO);
		if (this.currentIndex >= this.elementDTOs.length) {
			throw new StorageFullException("Storage is full");

		}
		return true;
	}

	

}

