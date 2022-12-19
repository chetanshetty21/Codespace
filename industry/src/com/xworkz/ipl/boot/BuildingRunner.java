package com.xworkz.ipl.boot;

import com.xworkz.ipl.constant.BuildingType;
import com.xworkz.ipl.dto.BuildingDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.BuildingRepository;
import com.xworkz.ipl.repository.BuildingRepositoryImpl;
import com.xworkz.ipl.service.BuildingService;
import com.xworkz.ipl.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		System.out.println("running  Building");
		BuildingDTO dto = new BuildingDTO(40, "chetan", 10, false, true, BuildingType.RESIDWNTIAL);

		BuildingRepository repository = new BuildingRepositoryImpl();
		BuildingService service = new BuildingServiceImpl(repository);

		try {
			System.out.println("after validation");
			service.validateAndSave(dto);

		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}

	}

}
