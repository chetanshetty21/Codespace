package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PlaceDTO;
import com.xworkz.ipl.execption.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {
	private PlaceDTO[] elementDTOs = new PlaceDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(PlaceDTO dto) {
		// TODO Auto-generated method stub@Override

		System.out.println("running save method" + dto);
		if (this.currentIndex >= this.elementDTOs.length) {
			throw new StorageFullException("Storage is full");

		}
		return true;

	}

}
