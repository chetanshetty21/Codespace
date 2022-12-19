package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.PlaceDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.PlaceRepository;

public class PlaceSeviceImpl implements PlaceService {
	private PlaceRepository repository;

	public PlaceSeviceImpl(PlaceRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidDataException {
		System.out.println("running validateandsave" + dto);
		String placeName = dto.getPlaceName();
		String placeType = dto.getPlaceType();
		double entryPrice = dto.getEntryPrice();
		double openTime = dto.getOpenTime();
		double closeTime = dto.getCloseTime();
		boolean validPlaceName = false;
		boolean validPlaceType = false;
		boolean validEntryPrice = false;
		boolean validOpenTime = false;
		boolean validCloseTime = false;

		if (placeName != null && placeName.length() >= 4 && placeName.length() <= 20) {
			System.out.println("placeName is valid");
			validPlaceName = true;

		} else {
			System.err.println("placeName is not valid");
		}

		if (placeType != null && placeType.length() >= 4 && placeType.length() <= 20) {
			System.out.println("placeType is valid");
			validPlaceType = true;

		} else {
			System.err.println("placeType is not valid");
		}
		if (entryPrice >= 100 && entryPrice <= 10000) {
			System.out.println("entryPrice is valid");
			validEntryPrice = true;

		} else {
			System.err.println("entryPrice is not valid");
		}

		if (closeTime >= 100 && closeTime <= 10000) {
			System.out.println("closeTime   is valid");
			validCloseTime = true;

		} else {
			System.err.println("closeTime   is not valid");
		}
		if (validCloseTime && validOpenTime && validEntryPrice && validPlaceType && validPlaceName) {
			System.out.println("data is valid ");

		} else {
			throw new InvalidDataException();
		}

		return false;
	}

}
