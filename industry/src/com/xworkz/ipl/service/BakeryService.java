package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BakeryDTO;
import com.xworkz.ipl.exception.InvalidDataException;

public interface BakeryService {
	boolean validateAndSave(BakeryDTO dto) throws InvalidDataException;

}
