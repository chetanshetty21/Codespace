package com.studds.equal.things;

public class God {
	private String name;
	private String originalName;
	private int totalDieties;
	private char godCode;
	private String location;
	private int totalTemples;
	private String priestName;
	private double entryFees;
	private boolean powerFull;
	private String godPoojaName;

	public God() {
		System.out.println("default constructor of the God");
	}

	public God(String name, String originalName, int totalDieties, char godCode, String location, int totalTemples,
			String priestName, double entryFees, boolean powerFull, String godPoojaName) {
		super();
		this.name = name;
		this.originalName = originalName;
		this.totalDieties = totalDieties;
		this.godCode = godCode;
		this.location = location;
		this.totalTemples = totalTemples;
		this.priestName = priestName;
		this.entryFees = entryFees;
		this.powerFull = powerFull;
		this.godPoojaName = godPoojaName;
	}

	@Override
	public String toString() {
		return "God [name=" + name + ", originalName=" + originalName + ", totalDieties=" + totalDieties + ", godCode="
				+ godCode + ", location=" + location + ", totalTemples=" + totalTemples + ", priestName=" + priestName
				+ ", entryFees=" + entryFees + ", powerFull=" + powerFull + ", godPoojaName=" + godPoojaName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof God) {
			System.out.println("this both are diffrent");
			God god3 = (God) obj;
			if (this.location.equals(god3.location) && this.name.equals(god3.name)
					&& this.originalName.equals(god3.originalName)) {
				System.out.println("location ,original and name  are same");
				return true;

			} else {
				System.err.println("location ,original and name  are not same ");

			}
			
		}
		return false;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public int getTotalDieties() {
		return totalDieties;
	}

	public void setTotalDieties(int totalDieties) {
		this.totalDieties = totalDieties;
	}

	public char getGodCode() {
		return godCode;
	}

	public void setGodCode(char godCode) {
		this.godCode = godCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotalTemples() {
		return totalTemples;
	}

	public void setTotalTemples(int totalTemples) {
		this.totalTemples = totalTemples;
	}

	public String getPriestName() {
		return priestName;
	}

	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isPowerFull() {
		return powerFull;
	}

	public void setPowerFull(boolean powerFull) {
		this.powerFull = powerFull;
	}

	public String getGodPoojaName() {
		return godPoojaName;
	}

	public void setGodPoojaName(String godPoojaName) {
		this.godPoojaName = godPoojaName;
	}

}
