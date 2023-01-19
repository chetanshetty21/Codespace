package com.xworkz.industry.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.industry.dto.TerriostDTO;

public class TerriostServiceImpl implements TerriostService
{
	

	@Override
	public boolean validateAndSave(TerriostDTO dto) {
		System.out.println("starting validation and save ");
		System.out.println("dto passed "+dto);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerriostDTO>> violation=validator.validate(dto);
		if(!violation.isEmpty())
		{
			System.out.println("error is there");
			violation.forEach(c->System.err.println(c.getMessage()));
			return false;
		}
		System.out.println("no issuse everything is fine");
		return true;
	

}

	
}