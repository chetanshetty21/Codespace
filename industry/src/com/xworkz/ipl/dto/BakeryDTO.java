package com.xworkz.ipl.dto;

import com.xworkz.ipl.dto.AbstractAudiDTO;

public class BakeryDTO extends AbstractAudiDTO {
	private String name;
	private String owner;
	private double contact;
	private String location;
	private String famousFor;
	public BakeryDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", owner=" + owner + ", contact=" + contact + ", location=" + location
				+ ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}
	public BakeryDTO(String name, String owner, double contact, String location, String famousFor) {
		super();
		this.name = name;
		this.owner = owner;
		this.contact = contact;
		this.location = location;
		this.famousFor = famousFor;
	}

}
