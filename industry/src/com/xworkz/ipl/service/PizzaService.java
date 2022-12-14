package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.PizzaDTO;

public interface PizzaService {
	boolean create(PizzaDTO dto);

	boolean validateAndSave(PizzaDTO dto);

}
