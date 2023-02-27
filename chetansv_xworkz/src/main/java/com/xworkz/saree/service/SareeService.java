package com.xworkz.saree.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.saree.dto.SareeDTO;

public interface SareeService {
	Set<ConstraintViolation<SareeDTO>> validateAndSave(SareeDTO sareeDTO);

	default SareeDTO findById(int id) {

		return null;
	}

}
