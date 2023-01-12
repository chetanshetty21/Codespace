package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("SoftwareEngineerName")
	protected String name;
	@Autowired
	@Qualifier("SoftwareEngineerSalary")
	protected double salary;
	@Autowired
	@Qualifier("SoftwareEngineerCompanyname")
	protected String companyName;
	@Autowired
	@Qualifier("SoftwareEngineerExp")
	protected int exp;

	public SoftwareEngineer(String name, double salary, String companyName, int exp) {
		super();
		this.name = name;
		this.salary = salary;
		this.companyName = companyName;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getExp() {
		return exp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
