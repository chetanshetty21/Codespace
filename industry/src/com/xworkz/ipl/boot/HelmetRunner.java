package com.xworkz.ipl.boot;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.HelmetType;
import com.xworkz.ipl.dto.HelmetDTO;
import com.xworkz.ipl.repository.HelmetRepository;
import com.xworkz.ipl.repository.HelmetRepositoryImpl;
import com.xworkz.ipl.service.HelmetService;
import com.xworkz.ipl.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO dto = new HelmetDTO("west", HelmetType.FULL, 50d, Color.BLACK);
		HelmetRepository helmetRepository = new HelmetRepositoryImpl();
		HelmetService helmetService = new HelmetServiceImpl(helmetRepository);
		boolean success = helmetService.validateAndSave(dto);
		System.out.println("success =" + success);

	}
}
