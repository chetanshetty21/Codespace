package com.xworkz.ipl.repository;


import com.xworkz.ipl.dto.RailwayStationDTO;
import com.xworkz.ipl.execption.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {
	private RailwayStationDTO[] elementDTOs = new RailwayStationDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean save(RailwayStationDTO dto) {
		System.out.println("running save method" + dto);
		if (this.currentIndex >= this.elementDTOs.length) {
			throw new StorageFullException("Storage is full");

		}
		
		return true;
	}

}
