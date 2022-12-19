package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.RailwayStationDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.RailwayStationRepository;
import com.xworkz.ipl.repository.TheaterRepository;

public class RailwayStationServiceImpl implements RailwayStationService {
	private RailwayStationRepository repository;

	public RailwayStationServiceImpl(RailwayStationRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException {
		System.out.println("running validateandsave" + dto);
		String name = dto.getName();
		double noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		double platformTicketPrice = dto.getNoOfPlatforms();
		boolean vaildName = false;
		boolean validNoOfPlatforms = false;
		boolean validArea = false;
		boolean validNoOfPlatformTicketPrice = false;
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid");
			vaildName = true;

		} else {
			System.err.println("name is not valid");
		}
		if (noOfPlatforms >= 100 && noOfPlatforms <= 10000) {
			System.out.println("noOfPlatforms  is valid");
			validNoOfPlatforms = true;

		} else {
			System.err.println(" noOfPlatforms  is not valid");
		}

		if (area != null && area.length() >= 4 && area.length() <= 20) {
			System.out.println("area is valid");
			validArea = true;

		} else {
			System.err.println("area is not valid");
		}
		if (platformTicketPrice >= 100 && platformTicketPrice <= 10000) {
			System.out.println("platformTicketPrice  is valid");
			validNoOfPlatformTicketPrice = true;

		} else {
			System.err.println("platformTicketPrice  is not valid");
		}
		if (vaildName && validNoOfPlatforms && validArea && validNoOfPlatformTicketPrice) {
			System.out.println("data is valid ");

		} else {
			throw new InvalidDataException();
		}
		return false;
	}

}
