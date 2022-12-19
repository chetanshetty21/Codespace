package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.BuildingType;
import com.xworkz.ipl.dto.BuildingDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	private BuildingRepository repository;

	public BuildingServiceImpl(BuildingRepository repository) {
		this.repository = repository;

	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidDataException {
		System.out.println("running validateandsave" + dto);
		String name = dto.getName();
		int no = dto.getNo();
		double floors = dto.getFloors();
		boolean parking = dto.isParking();
		boolean lift = dto.isLift();
		BuildingType type = dto.getType();
		boolean validName = false;
		boolean valiFloors = false;
		boolean validParking = false;
		boolean validLift = false;
		boolean validNo = false;
		boolean validType = false;
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid");
			validName = true;

		} else {
			System.err.println("name is not valid");
		}
		if (no >= 100 && no <= 10000) {
			System.out.println("no is valid");
			validNo = true;

		} else {
			System.err.println("no is not valid");
		}
		if (floors >= 100 && floors <= 10000) {
			System.out.println("floors  is valid");
			valiFloors = true;

		} else {
			System.err.println("floors  is not valid");
		}
		if (type != null) {
			System.out.println("no is valid");
			validType = true;

		} else {
			System.err.println("no is not valid");
		}

		if (validName && valiFloors && validParking && validLift && validNo && validType) {
			System.out.println("data is valid ");

		} else {
			throw new InvalidDataException();
		}
		return false;

	}

}
