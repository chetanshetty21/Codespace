package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.RailwayStationDTO;
import com.xworkz.ipl.exception.InvalidDataException;

public interface RailwayStationService {
	boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException;

}
