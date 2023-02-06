package com.xworkz.chetan.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EducationDTO {
	private String name;
	private String schoolName;
	private String collageName;
	private String degreeCollageName;
	private int tenthMarks;
	private int puMarks;
	private int bEMarks;
	private LocalDateTime schoolPassedOut;
	private LocalDateTime collagePassedOut;
	private LocalDateTime degreePassedOut;
}
