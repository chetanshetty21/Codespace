package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.BuildingDTO;
import com.xworkz.ipl.execption.StorageFullException;

public class BuildingRepositoryImpl implements BuildingRepository {
	private BuildingDTO[] elementDTOs = new BuildingDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(BuildingDTO dto) {
		System.out.println("running save method" + dto);
		if (this.currentIndex >= this.elementDTOs.length) {
			throw new StorageFullException("Storage is full");

		}
		return true;
	}

}
