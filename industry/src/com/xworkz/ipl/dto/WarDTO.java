package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class WarDTO extends AbstractAudiDTO {
	private String warName;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String countryStartedBy;
	private String countryStartedWith;
	private String warWonBy;
	private double noOfDeaths;

	public WarDTO() {

	}

	public WarDTO(String warName, LocalDateTime startDate, LocalDateTime endDate, String countryStartedBy,
			String countryStartedWith, String warWonBy, double noOfDeaths) {
		super();
		this.warName = warName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.countryStartedBy = countryStartedBy;
		this.countryStartedWith = countryStartedWith;
		this.warWonBy = warWonBy;
		this.noOfDeaths = noOfDeaths;

	}

	@Override
	public String toString() {
		return "WarDTO [warName=" + warName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", countryStartedBy=" + countryStartedBy + ", countryStartedWith=" + countryStartedWith
				+ ", warWonBy=" + warWonBy + ", noOfDeaths=" + noOfDeaths ;
	}

	public String getWarName() {
		return warName;
	}

	public void setWarName(String warName) {
		this.warName = warName;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getCountryStartedBy() {
		return countryStartedBy;
	}

	public void setCountryStartedBy(String countryStartedBy) {
		this.countryStartedBy = countryStartedBy;
	}

	public String getCountryStartedWith() {
		return countryStartedWith;
	}

	public void setCountryStartedWith(String countryStartedWith) {
		this.countryStartedWith = countryStartedWith;
	}
	

	public String getWarWonBy() {
		return warWonBy;
	}

	public void setWarWonBy(String warWonBy) {
		this.warWonBy = warWonBy;
	}

	public double getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(double noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

	

}
