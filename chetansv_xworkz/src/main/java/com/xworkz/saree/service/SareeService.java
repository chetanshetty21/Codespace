package com.xworkz.saree.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import com.xworkz.saree.dto.SareeDTO;
import com.xworkz.saree.entity.SareeEntity;

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

	default List<SareeDTO> findByAll() {
		return Collections.emptyList();
	}

	default List<SareeDTO> findByTwoProperties(String name,String color) {
		return Collections.emptyList();
	}

}
