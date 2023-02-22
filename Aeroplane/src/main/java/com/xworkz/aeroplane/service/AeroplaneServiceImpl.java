package com.xworkz.aeroplane.service;

import java.util.Set;

import java.util.Collections;



import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dao.AeroplaneDAO;
import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEnitiy;


@Service
public class AeroplaneServiceImpl implements AeroplaneService {
	@Autowired
	private AeroplaneDAO dao;
	public AeroplaneServiceImpl() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@Override
	public AeroplaneDTO findById(int id) {
		if (id > 0) {
			AeroplaneEnitiy entity = this.dao.findById(id);
			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompanyName(entity.getCompanyName());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setType(entity.getType());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AeroplaneService.super.findById(id);
	}
	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO aeroplaneDTO) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> constraintViolations = validator.validate(aeroplaneDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations in dto" + aeroplaneDTO);
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good" + aeroplaneDTO);
			AeroplaneEnitiy entity = new AeroplaneEnitiy();
			entity.setName(aeroplaneDTO.getName());
			entity.setCost(aeroplaneDTO.getCost());
			entity.setCompanyName(aeroplaneDTO.getCompanyName());
			entity.setType(aeroplaneDTO.getType());
			entity.setCountry(aeroplaneDTO.getCountry());

			this.dao.save(entity);
			return Collections.emptySet();
		}

	}
}