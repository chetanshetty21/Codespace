package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data
public class ValentineDTO {

	
	@Size(min = 3, max = 20, message = "cm name should be more than 3 and less than 20")
	private String name;
	@Size(min = 3, max = 20, message = "cm name should be more than 3 and less than 20")
	private String valentineName;
	@NotBlank(message = "places should be selectd")
	private String places;
	@NotBlank(message = "gift should be selectd")
	private String gift;
	

}
