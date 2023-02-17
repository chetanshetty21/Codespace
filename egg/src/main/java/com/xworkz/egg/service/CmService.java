package com.xworkz.egg.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.egg.DTO.CMDTO;

public interface CmService {
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}