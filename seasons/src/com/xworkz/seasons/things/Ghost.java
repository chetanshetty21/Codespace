package com.xworkz.seasons.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	@Qualifier("ghostName")
	private String name;
	private int idNo;
	private String area;
	private double phNo;
	private String education;
	private LocalDate dateOfBirth;
	private LocalDate dateOfDeath;
	private double aadhar;
	private String voterId;
	@Autowired
	@Qualifier("ghostHeight")
	private double height;
	@Autowired
	@Qualifier("ghostMotherName")
	private double weight;
	@Autowired
	@Qualifier("ghostNoOfFriends")
	private int noOfFriends;
	@Autowired
	@Qualifier("ghostFatherName")
	private String fatherName;
	@Autowired
	@Qualifier("ghostMotherName")
	private String motherName;
	@Autowired
	@Qualifier("ghostBrotherName")
	private String broterName;
	@Autowired
	@Qualifier("ghostSisterName")
	private String sisterName;
	private int noOFHands;
	@Autowired
	@Qualifier("ghostNoOFLegs")
	private int noOFLegs;
	@Autowired
	@Qualifier("ghostNoOFHeads")
	private int noOFHeads;
	private String friendsName;

	public Ghost(String name, @Qualifier("ghostIdNo") int idNo, @Qualifier("ghostArea") String area,
			@Qualifier("ghostPhNo") double phNo, @Qualifier("ghostEducation") String education,
			@Qualifier("ghostDateOfBirth") LocalDate dateOfBirth, @Qualifier("ghostDateOfDeath") LocalDate dateOfDeath,
			@Qualifier("ghostAadhar") double aadhar, @Qualifier("ghostVoterId") String voterId, double height,
			double weight, int noOfFriends, String fatherName, String motherName, String broterName, String sisterName,
			@Qualifier("ghostNoOfHnads") int noOFHands, int noOFLegs, int noOFHeads,
			@Qualifier("ghostFriendsName") String friendsName) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.area = area;
		this.phNo = phNo;
		this.education = education;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.aadhar = aadhar;
		this.voterId = voterId;
		this.height = height;
		this.weight = weight;
		this.noOfFriends = noOfFriends;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.broterName = broterName;
		this.sisterName = sisterName;
		this.noOFHands = noOFHands;
		this.noOFLegs = noOFLegs;
		this.noOFHeads = noOFHeads;
		this.friendsName = friendsName;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", idNo=" + idNo + ", area=" + area + ", phNo=" + phNo + ", education="
				+ education + ", dateOfBirth=" + dateOfBirth + ", dateOfDeath=" + dateOfDeath + ", aadhar=" + aadhar
				+ ", voterId=" + voterId + ", height=" + height + ", weight=" + weight + ", noOfFriends=" + noOfFriends
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", broterName=" + broterName
				+ ", sisterName=" + sisterName + ", noOFHands=" + noOFHands + ", noOFLegs=" + noOFLegs + ", noOFHeads="
				+ noOFHeads + ", friendsName=" + friendsName + "]";
	}

	public String getName() {
		return name;
	}

	public int getIdNo() {
		return idNo;
	}

	public String getArea() {
		return area;
	}

	public double getPhNo() {
		return phNo;
	}

	public String getEducation() {
		return education;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public LocalDate getDateOfDeath() {
		return dateOfDeath;
	}

	public double getAadhar() {
		return aadhar;
	}

	public String getVoterId() {
		return voterId;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public int getNoOfFriends() {
		return noOfFriends;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getBroterName() {
		return broterName;
	}

	public String getSisterName() {
		return sisterName;
	}

	public int getNoOFHands() {
		return noOFHands;
	}

	public int getNoOFLegs() {
		return noOFLegs;
	}

	public int getNoOFHeads() {
		return noOFHeads;
	}

	public String getFriendsName() {
		return friendsName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setPhNo(double phNo) {
		this.phNo = phNo;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfDeath(LocalDate dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public void setAadhar(double aadhar) {
		this.aadhar = aadhar;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setNoOfFriends(int noOfFriends) {
		this.noOfFriends = noOfFriends;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setBroterName(String broterName) {
		this.broterName = broterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public void setNoOFHands(int noOFHands) {
		this.noOFHands = noOFHands;
	}

	public void setNoOFLegs(int noOFLegs) {
		this.noOFLegs = noOFLegs;
	}

	public void setNoOFHeads(int noOFHeads) {
		this.noOFHeads = noOFHeads;
	}

	public void setFriendsName(String friendsName) {
		this.friendsName = friendsName;
	}

}
