package com.xworkz.saree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import lombok.Data;

@Data
@Entity
@Table(name = "saree_table")
public class SareeEntity {
	@Id
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_material")
	private String material;
	@Column(name = "s_modeOFpayemnt")
	private String modeOFpayemnt;
	@Column(name = "s_size")
	private String size;
	@Column(name = "s_color")
	private String color;
	
}
