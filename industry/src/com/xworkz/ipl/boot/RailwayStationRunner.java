package com.xworkz.ipl.boot;

import com.xworkz.ipl.dto.RailwayStationDTO;
`import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.RailwayStationRepository;
import com.xworkz.ipl.repository.RailwayStationRepositoryImpl;
import com.xworkz.ipl.service.RailwayStationService;
import com.xworkz.ipl.service.RailwayStationServiceImpl;


public class RailwayStationRunner {

	
		public static void main(String[] args) {
			System.out.println("running theater ");
			RailwayStationDTO dto = new RailwayStationDTO("city railwayStation", 5, "coorparation", 500);

			RailwayStationRepository repository = new RailwayStationRepositoryImpl();
			RailwayStationService service = new  RailwayStationServiceImpl(repository );

			try {
				System.out.println("after validation");
				service.validateAndSave(dto);

			} catch (InvalidDataException e) {
				System.out.println(e.getMessage());
			}

		}

	}


