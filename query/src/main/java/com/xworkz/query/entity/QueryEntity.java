package com.xworkz.query.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "query_table")
@NamedQuery(name = "findByName", query = "select entity from QueryEntity entity where entity.name='Bhitarkanika Mangroves'")
@NamedQuery(name = "findByState", query = "select entity from QueryEntity entity where entity.state='uttarakhand'")
@NamedQuery(name = "findByNameAndStateAndArea", query = "select entity from QueryEntity entity where entity.name='Kanha National Park'and entity.state ='Madhya Pradesh'and entity.area='651.0'")
@NamedQuery(name = "findAreaByName", query = "select entity.area from QueryEntity entity where entity.name='Kanha National Park'")
@NamedQuery(name = "findIdByNameAndState", query = "select entity from QueryEntity entity where entity.id='10'and entity.state =' Tamil Nadu'and entity.name='Nanmangalam forest'")
@NamedQuery(name = "findNameById", query = "select entity.name from QueryEntity entity where entity.id='7'")
@NamedQuery(name = "findStateByNameAndArea", query = "select entity.state from QueryEntity entity where entity.name='Kanha National Park'and entity.area='651.0'")
@NamedQuery(name = "findCount", query = "select count (entity) from QueryEntity entity ")
@NamedQuery(name = "findMax", query = "select max(entity.area) from QueryEntity entity")
public class QueryEntity {
	@Id
	@Column(name = "q_id")
	private int id;
	@Column(name = "q_name")
	private String name;
	@Column(name = "q_state")
	private String state;
	@Column(name = "q_area")
	private long area;
	@Column(name = "q_type")
	private String type;

	public QueryEntity() {
		// TODO Auto-generated constructor stub
	}

	public QueryEntity(int id, String name, String state, long area, String type) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.area = area;
		this.type = type;
	}

}
