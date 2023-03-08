package com.xworkz.saree.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.saree.dto.SareeDTO;

public interface SareeService {
	Set<ConstraintViolation<SareeDTO>> validateAndSave(SareeDTO sareeDTO);

	default SareeDTO findById(int id) {

		return null;
	}

	default List<SareeDTO> findByName(String name) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<SareeDTO>> validateAndUpdate(SareeDTO sareeDTO);

	default SareeDTO deleteById(int id) {
		return null;
	}
}
