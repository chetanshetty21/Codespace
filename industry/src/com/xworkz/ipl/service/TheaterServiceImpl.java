package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.TheaterDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {
	private TheaterRepository repository;

	public TheaterServiceImpl(TheaterRepository repository) {
		this.repository = repository;
	}



	@Override
	public boolean validateAndSave(TheaterDTO dto) throws InvalidDataException{
		System.out.println("running validateandsave" + dto);
		String name = dto.getName();
		String id = dto.getId();
		String brand = dto.getBrand();
		double seats = dto.getSeats();
		boolean validName = false;
		boolean valiId = false;
		boolean validBrand = false;
		boolean validSeats = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid");
			validName = true;

		} else {
			System.err.println("name is not valid");
		}
		if (id != null && id.length() >= 4 && id.length() <= 20) {
			System.out.println("id is valid");
			validBrand = true;

		} else {
			System.err.println("id is not valid");
		}
		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("brand is valid");
			validBrand = true;

		} else {
			System.err.println("brand is not valid");
		}
		if (seats >= 100 && seats <= 10000) {
			System.out.println("seats is valid");
			validSeats = true;

		} else {
			System.err.println("seats is not valid");
		}
		if (validBrand && validName && valiId && validSeats) {
			System.out.println("data is valid ");

		} else {
			throw new InvalidDataException();
		}
		return false;
	}

}
