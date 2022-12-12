package com.xworkz.ipl.dto;

public class IplDTO extends AbstractAudiDTO {

	private String teamName;
	private String captainName;
	private boolean ownerAlive;
	private double purse;
	private int noOfWins;
	private int noOfDefeats;

	public IplDTO() {

	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainName=" + captainName + ", ownerAlive=" + ownerAlive
				+ ", purse=" + purse + ", noOfWins=" + noOfWins + ", noOfDefeats=" + noOfDefeats + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getNoOfWins() {
		return noOfWins;
	}

	public void setNoOfWins(int noOfWins) {
		this.noOfWins = noOfWins;
	}

	public int getNoOfDefeats() {
		return noOfDefeats;
	}

	public void setNoOfDefeats(int noOfDefeats) {
		this.noOfDefeats = noOfDefeats;
	}
}
