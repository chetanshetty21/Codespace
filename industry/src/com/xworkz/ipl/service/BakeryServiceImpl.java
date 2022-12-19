package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BakeryDTO;

import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	private BakeryRepository repository;

	public BakeryServiceImpl(BakeryRepository repository) {
		this.repository = repository;

	}

	
	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidDataException {
		System.out.println("running validateandsave" + dto);
		String name = dto.getName();
		String owner = dto.getOwner();
		String location = dto.getLocation();
		double contact = dto.getContact();
		String famousFor = dto.getCreatedBy();
		boolean validName = false;
		boolean validOwner = false;
		boolean valiLocation = false;
		boolean validContact = false;
		boolean validFamousFor = false;
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid");
			validName = true;

		} else {
			System.err.println("name is not valid");
		}
		if (owner != null && owner.length() >= 4 && owner.length() <= 20) {
			System.out.println("owner is valid");
			validOwner = true;

		} else {
			System.err.println("owner is not valid");
		}
		if (location != null && location.length() >= 4 && location.length() <= 20) {
			System.out.println("location is valid");
			valiLocation = true;

		} else {
			System.err.println("location is not valid");
		}
		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("famousFor is valid");
			validFamousFor = true;

		} else {
			System.err.println("famousFor is not valid");
		}
		if (contact >= 100 && contact <= 10000) {
			System.out.println("seats is valid");
			validContact = true;

		} else {
			System.err.println("seats is not valid");
		}
		if (validFamousFor && validContact && valiLocation && validOwner && validName) {
			System.out.println("data is valid ");

		} else {
			throw new InvalidDataException();
		}
		return false;
	}

}
