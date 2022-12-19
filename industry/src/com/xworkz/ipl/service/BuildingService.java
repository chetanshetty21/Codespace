package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BuildingDTO;
import com.xworkz.ipl.exception.InvalidDataException;

public interface BuildingService {
	boolean validateAndSave(BuildingDTO dto) throws InvalidDataException;

}
