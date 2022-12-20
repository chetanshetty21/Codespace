package com.xworkz.ipl.boot;

import com.xworkz.ipl.dto.BakeryDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.BakeryRepository;
import com.xworkz.ipl.repository.BakeryRepositoryImpl;
import com.xworkz.ipl.service.BakeryService;
import com.xworkz.ipl.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running bakery ");
		BakeryDTO dto = new BakeryDTO("chetan bakery", "chetan", 7892, "mhalakshmi", "veg puff");

		BakeryRepository repository = new BakeryRepositoryImpl();
		BakeryService service = new BakeryServiceImpl(repository);

		try {
			service.validateAndSave(dto);
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
s