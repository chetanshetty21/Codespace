package com.xworkz.valentine.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentine.dto.ValentineDTO;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO valentinedto);

	default ValentineDTO findById(int id) {

		return null;
	}

}
