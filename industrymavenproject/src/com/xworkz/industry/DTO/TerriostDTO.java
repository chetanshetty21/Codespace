package com.xworkz.industry.DTO;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public @Data class TerriostDTO extends AbstractAuditDTO {
	@NonNull
	@NotNull(message="terrorist name is cannot be null")
	@Size(min=3,max=10,message="enter the correct value")
	private String name;
	@NonNull
	@NotNull
	@Min(value=1)
	@Max(value=10)
	private int age;
	@NonNull
	@NotNull(message="terrorist name is cannot be null")
	@Size(min=3,max=10,message="enter the correct value")
	private String country;
	@NonNull
	private boolean alive;
	@NonNull
	private boolean prison;
	@NonNull
	@NotNull(message="terrorist name is cannot be null")
	@Size(min=3,max=10,message="enter the correct value")
	private String Specialization;

}
