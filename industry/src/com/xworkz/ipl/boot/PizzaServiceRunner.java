package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;
import com.xworkz.ipl.service.PizzaService;
import com.xworkz.ipl.service.PizzaServiceImpl;

public class PizzaServiceRunner {

	public static void main(String[] args) {
		PizzaService pizzaService = new PizzaServiceImpl();
		PizzaDTO dto = new PizzaDTO();
		dto = new PizzaDTO("Veggie Supreme", "pizza hut", PizzaSize.LARGE, true, 560, "salty", "VEG", "chetan",
				LocalDateTime.now(), null, null);
		boolean saved = pizzaService.validateAndSave(dto);
		System.out.println(saved);
	}

}
