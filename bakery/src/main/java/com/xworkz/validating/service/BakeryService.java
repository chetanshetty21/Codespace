package com.xworkz.validating.service;

import com.xworkz.validating.dto.BakeryDTO;

public interface BakeryService {
	boolean validateAndSave(BakeryDTO dto);
}
