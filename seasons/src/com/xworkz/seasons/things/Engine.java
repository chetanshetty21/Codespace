package com.xworkz.seasons.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Engine {

	private String name;
	private String type;

	@Autowired
	@Qualifier("engineNumber")
	private float number;
	@Autowired
	@Qualifier("engineVersion")
	private double version;
	private String company;
	private int strokes;

	public Engine(@Qualifier("engineName")String  name, @Qualifier("engineType")String type, float number, double version, @Qualifier("engineCompany")String company, int strokes) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public float getNumber() {
		return number;
	}

	public double getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

	public int getStrokes() {
		return strokes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

}
