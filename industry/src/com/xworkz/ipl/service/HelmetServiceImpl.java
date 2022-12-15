package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.Color;
import com.xworkz.ipl.constant.HelmetType;
import com.xworkz.ipl.dto.HelmetDTO;
import com.xworkz.ipl.repository.HelmetRepository;
import com.xworkz.ipl.repository.HelmetRepositoryImpl;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepository;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		System.out.println("running validateAnd Save method");
		String brand = dto.getBrand();
		HelmetType type = dto.getType();
		Double price = dto.getPrice();
		Color color = dto.getColor();

		boolean validBrand = false;
		boolean validType = false;
		boolean validPrice = false;
		boolean validColor = false;
		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("brand is valid");
			validBrand = true;

		} else {
			System.err.println("brand is not valid");
		}
		if (type != null) {
			System.out.println("type is valid");
			validType = true;

		} else {
			System.err.println("type is not valid");

		}
		if (price != null && price >= 100 && price <= 10000) {
			System.out.println("price is valid");
			validPrice = true;

		} else {
			System.err.println("price is not valid");
		}
		if (color != null) {
			System.out.println("color is valid");
			validColor = true;

		} else {
			System.err.println("color is not valid");
		}
		if (validBrand && validType && validPrice && validColor) {
			System.out.println("helmetdto is valid ");
			boolean saved = this.helmetRepository.save(dto);
			return saved;
		} else {
			System.out.println("helmetdto is invalid");
		}
		return false;
	}

}
