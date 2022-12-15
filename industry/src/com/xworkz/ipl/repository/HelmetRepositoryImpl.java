package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	private HelmetDTO[] elementDTOs = new HelmetDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(HelmetDTO DTO) {
		System.out.println("running save method" + DTO);
		if (this.currentIndex >= this.elementDTOs.length) {
			System.out.println("Storage is saved ");
			return false;
		}
		return false;
	}

}
