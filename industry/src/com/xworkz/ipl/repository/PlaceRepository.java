package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PlaceDTO;
import com.xworkz.ipl.exception.InvalidDataException;

public interface PlaceRepository  {

	boolean save(PlaceDTO dto) throws InvalidDataException;
}
