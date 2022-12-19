package com.xworkz.ipl.boot;

import com.xworkz.ipl.dto.PlaceDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.PlaceRepository;
import com.xworkz.ipl.repository.PlaceRepositoryImpl;
import com.xworkz.ipl.service.PlaceService;
import com.xworkz.ipl.service.PlaceSeviceImpl;


public class PlaceRunner {
	public static void main(String[] args) {
		System.out.println("running Place ");
		PlaceDTO dto = new PlaceDTO("GRS","fansatic park",750,10.00,6.00);

		PlaceRepository repository = new PlaceRepositoryImpl();
		PlaceService service = new PlaceSeviceImpl(repository);

		try {
			System.out.println("after validation");
			service.validateAndSave(dto);

		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
