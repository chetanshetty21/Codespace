
package com.xworkz.ipl.service;

import com.xworkz.ipl.constant.PizzaSize;
import com.xworkz.ipl.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		System.out.println("checking validateAndSaveName" + dto);
		String name = dto.getName();
		String company = dto.getCompany();
		String flavour = dto.getFlavour();
		PizzaSize size = dto.getSize();
		double price = dto.getPrice();
		String type = dto.getType();
		boolean validName = false;
		boolean validcompany = false;
		boolean validSize = false;
		boolean validPrice = false;
		boolean validFlavour = false;
		boolean validType = false;
		boolean validCheese = false;
		if (name != null && name.length() > 4 && name.length() <= 20) {
			System.out.println("valid pizza name" + name);
			validName = true;
		} else {
			System.err.println("invalid pizza name" + name);

		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Comapny Name is valid");
			validcompany = true;
		} else {
			System.err.println("comapny is invalid");
		}
		if (size != null) {
			System.out.println("size is valid");
			validSize = true;
		} else {
			System.err.println("size is invalid");
		}
		
		if (price >= 50 && price <= 2000) {
			System.out.println("price is valid");
			validCheese = true;
		} else {
			System.err.println("price is not valid");
		}
		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.err.println("flavour is valid");
			validFlavour = true;
		} else {
			System.out.println("flavour is not valid");
		}

		if (type != null && (type.equals("VEG") || type.equals("NON-VEG"))) {
			System.out.println("type is valid");
			validType = true;

		} else {
			System.err.println("type is not valid");
		}
		if (validName && validCheese && validSize && validCheese && validPrice && validFlavour && validType) {
			return true;
		}
		return false;
	}

}
