package com.xworkz.industry.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.industry.DAO.SoldierDAO;
import com.xworkz.industry.DTO.SoldierDTO;

public class SoldierServiceImpl implements SoldierService{

	private SoldierDAO soldierDAO;

	public SoldierServiceImpl() {
		System.out.println("Running the SoldierServiceImpl");
	}

	public void setSoldierRepo(SoldierDAO soldierDAO) {
		this.soldierDAO = soldierDAO;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("datas of dto=" + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("errors are in the dto");
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			System.out.println("no errors are in the dto");
			boolean fight = soldierDAO.fights(dto);
			System.out.println("after validating the dto in DAO is  " + fight);
			return fight;

		}
	}
}
