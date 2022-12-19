package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.PlaceDTO;
import com.xworkz.ipl.exception.InvalidDataException;

public interface PlaceService {
	boolean validateAndSave(PlaceDTO dto) throws InvalidDataException;

}
