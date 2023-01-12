package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class YourWish {
	@Autowired
	@Qualifier("yourWishName")
	protected String name;
	@Autowired
	@Qualifier("yourWishAge")
	protected int age;
	@Autowired
	@Qualifier("yourWishPhoneNo")
	protected double phoneNo;
	@Autowired
	@Qualifier("yourWishPercentage")
	protected float percentage;
	@Autowired
	@Qualifier("yourWishNoofPH")
	protected byte noofPH;
	@Autowired
	@Qualifier("yourWishNoOfBike")
	protected short noofBike;
	@Autowired
	@Qualifier("yourWishGender")
	protected char gender;
	@Autowired
	@Qualifier("yourWishGraduated")
	protected boolean graduated;
	@Autowired
	@Qualifier("yourWishNoOfFriends")
	protected long noOfFriends;

	public YourWish(String name, int age, double phoneNo, float percentage, byte noofPH, short noofBike, char gender,
			boolean graduated, long noOfFriends) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.percentage = percentage;
		this.noofPH = noofPH;
		this.noofBike = noofBike;
		this.gender = gender;
		this.graduated = graduated;
		this.noOfFriends = noOfFriends;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getPhoneNo() {
		return phoneNo;
	}

	public float getPercentage() {
		return percentage;
	}

	public byte getNoofPH() {
		return noofPH;
	}

	public short getNoofBike() {
		return noofBike;
	}

	public char getGender() {
		return gender;
	}

	public boolean isGraduated() {
		return graduated;
	}

	public long getNoOfFriends() {
		return noOfFriends;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public void setNoofPH(byte noofPH) {
		this.noofPH = noofPH;
	}

	public void setNoofBike(short noofBike) {
		this.noofBike = noofBike;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}

	public void setNoOfFriends(long noOfFriends) {
		this.noOfFriends = noOfFriends;
	}

}
