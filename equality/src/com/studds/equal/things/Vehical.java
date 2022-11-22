package com.studds.equal.things;

public class Vehical {
	private String brand;
	private String name;
	private double price;
	private String color;
	private int quainty;
	private boolean qulaity;
	private String modelNumber;
	private String mgfDtae;
	private String qrCode;
	private double customerCareNumber;

	public Vehical() {

	}

	public Vehical(String brand, String name, double price, String color, int quainty, boolean qulaity,
			String modelNumber, String mgfDtae, String qrCode, double customerCareNumber) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
		this.quainty = quainty;
		this.qulaity = qulaity;
		this.modelNumber = modelNumber;
		this.mgfDtae = mgfDtae;
		this.qrCode = qrCode;
		this.customerCareNumber = customerCareNumber;
	}

	@Override
	public String toString() {
		return "Vehical [brand=" + brand + ", name=" + name + ", price=" + price + ", color=" + color + ", quainty="
				+ quainty + ", qulaity=" + qulaity + ", modelNumber=" + modelNumber + ", mgfDtae=" + mgfDtae
				+ ", qrCode=" + qrCode + ", customerCareNumber=" + customerCareNumber + "]";
	}

	@Override
	public boolean equals(Object others) {
		System.out.println("this both are diffrent");

		if (others instanceof Vehical) {
			Vehical casting = (Vehical) others;
			if (this.brand.equals(casting.brand) && this.color.equals(casting.color)) {
				System.out.println("brand name is same");
				return true;

			}
		} else {
			System.out.println("the are diffenent");
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuainty() {
		return quainty;
	}

	public void setQuainty(int quainty) {
		this.quainty = quainty;
	}

	public boolean isQulaity() {
		return qulaity;
	}

	public void setQulaity(boolean qulaity) {
		this.qulaity = qulaity;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getMgfDtae() {
		return mgfDtae;
	}

	public void setMgfDtae(String mgfDtae) {
		this.mgfDtae = mgfDtae;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public double getCustomerCareNumber() {
		return customerCareNumber;
	}

	public void setCustomerCareNumber(double customerCareNumber) {
		this.customerCareNumber = customerCareNumber;
	}
}
