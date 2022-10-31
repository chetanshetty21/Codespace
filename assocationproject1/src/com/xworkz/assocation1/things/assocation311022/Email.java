package com.xworkz.assocation1.things.assocation311022;

public class Email {
	public String id;
	public String password;
	public double mobileNo;
	public Company company;
	public Email(String id, String password, double mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
public void setCompany(Company company) {
	this.company=company;
}
public void showOff() {
	
	
	System.out.println("Email id,password,mobilenumber"+id+password+mobileNo);
System.out.println(this.company);
}
}
