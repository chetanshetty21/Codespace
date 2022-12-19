package com.xworkz.ipl.boot;

import com.xworkz.ipl.dto.TheaterDTO;
import com.xworkz.ipl.exception.InvalidDataException;
import com.xworkz.ipl.repository.TheaterRepository;
import com.xworkz.ipl.repository.TheaterRepositoryImpl;
import com.xworkz.ipl.service.TheaterService;
import com.xworkz.ipl.service.TheaterServiceImpl;

public class TheaterRunner {
	public static void main(String[] args) {
		System.out.println("running theater ");
		TheaterDTO dto = new TheaterDTO("kao2cellword", "kamala theater", "inox",500);

		TheaterRepository repository = new TheaterRepositoryImpl();
		TheaterService service = new TheaterServiceImpl(repository);

		try {
			System.out.println("after validation");
			service.validateAndSave(dto);

		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}

	}
}
