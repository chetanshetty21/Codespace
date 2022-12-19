package com.xworkz.ipl.dto;

import com.xworkz.ipl.constant.BuildingType;

public class BuildingDTO extends AbstractAudiDTO{
private int no;
private String name;
private double floors;
private boolean lift ;
private boolean parking;
private BuildingType Type;
 public BuildingDTO() {
	// TODO Auto-generated constructor stub
}
public BuildingDTO(int no, String name, double floors, boolean lift, boolean parking, BuildingType type) {
	super();
	this.no = no;
	this.name = name;
	this.floors = floors;
	this.lift = lift;
	this.parking = parking;
	Type = type;
}
@Override
public String toString() {
	return "BuildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", lift=" + lift + ", parking=" + parking
			+ ", Type=" + Type + ", toString()=" + super.toString() + "]";
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getFloors() {
	return floors;
}
public void setFloors(double floors) {
	this.floors = floors;
}
public boolean isLift() {
	return lift;
}
public void setLift(boolean lift) {
	this.lift = lift;
}
public boolean isParking() {
	return parking;
}
public void setParking(boolean parking) {
	this.parking = parking;
}
public BuildingType getType() {
	return Type;
}
public void setType(BuildingType type) {
	Type = type;
}
 
}
