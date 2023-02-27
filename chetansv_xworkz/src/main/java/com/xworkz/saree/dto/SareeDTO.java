package com.xworkz.saree.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SareeDTO {

	@Size(min = 3, max = 20, message = "Saree name should be more than 3 and less than 20")
	private String name;
	@Size(min = 3, max = 20, message = "Saree material should be more than 3 and less than 20")
	private String material;
	@Size(min = 3, max = 20, message = "modeOFpayemnt  should be more than 3 and less than 20")
	private String modeOFpayemnt;
	@NotBlank(message = "size should be selectd")
	private String size;
	@NotBlank(message = "color should be selectd")
	private String color;
	private int id;
	
}
