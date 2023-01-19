package com.xworkz.industry.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 6, max = 26, message = "name is size is not withing range of 6 to 26")
	private String name;

	@NotNull
	@NotBlank
	@Size(min = 6, max = 19, message = "specialisation size is not withing range of 6 to 19")
	private String specialisedIn;

	@Min(value = 1996, message = "joined year is not within range of 1996 to 2018")
	@Max(value = 2018, message = "joined year is not within range of 1996 to 2018")
	private int joinedYear;

	@NotNull
	@NotBlank
	@Size(min = 4, max = 15, message = "position size is not withing range of 4 to 15")
	private String position;

	@Min(value = 3, message = " ratingsByTrainer is not within range of 3 to 10")
	@Max(value = 10, message = "ratingsByTrainer is not within range of 3 to 10")
	private double ratingsByTrainer;

}
