package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.TheaterDTO;
import com.xworkz.ipl.exception.InvalidDataException;

public interface TheaterService {
	boolean validateAndSave(TheaterDTO dto) throws InvalidDataException;

}
