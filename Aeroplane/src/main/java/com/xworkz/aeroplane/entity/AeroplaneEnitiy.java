package com.xworkz.aeroplane.entity;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "aeroplane_table")
public class AeroplaneEnitiy {
	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_company_name")
	private String companyName;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_cost")
	private double cost;
	@Column(name = "a_type")
	private String type;
	@Column(name = "a_country")
	private String country;
	
	

}
