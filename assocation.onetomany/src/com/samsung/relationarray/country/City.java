package com.samsung.relationarray.country;

public class City {
	public Name nameIs;
	public double areaInSqKm;
	public boolean capital;

	public City(Name nameIs) {
		super();
		this.nameIs = nameIs;

	}

	public void setAreaInSqKm(double areaInSqKm) {
		this.areaInSqKm = areaInSqKm;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	public void showOff() {
		
		if (this.nameIs!=null) {
			System.out.println("name is"+this.nameIs);
			this.nameIs.showOff();
			
		}
		else {
			System.out.println("the name is null");
		}
		System.out.println(this.areaInSqKm);
		System.out.println(this.capital);
	}
}
