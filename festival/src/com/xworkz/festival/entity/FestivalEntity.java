package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "festival_table")
@NamedQuery(name = "findByIdByName", query = "select entity from FestivalEntity entity where entity.id=:idby and entity.name=:nameby")
@NamedQuery(name = "findByNameIdByRegionAndByMainGod", query = "select entity from FestivalEntity entity where entity.name=:nameby and entity.region=:regionby and entity.mainGod=:maingodby")
@NamedQuery(name = "findByMainGod", query = "select entity from FestivalEntity entity where  entity.mainGod=:maingodby")
@NamedQuery(name = "findTotalDaysByName", query = "select entity.totalDays from FestivalEntity entity where  entity.name=:nameby")
@NamedQuery(name = "findRegionAndMainGodByNameAndId", query = "select entity.region,entity.mainGod from FestivalEntity entity where  entity.name=:nameby and entity.id=:idby ")
@NamedQuery(name = "findMaingodAndTotalDaysByName", query = "select entity.mainGod , entity.totalDays from FestivalEntity entity where  entity.name=:nameby")
@NamedQuery(name = "findCount", query = "select count (entity) from FestivalEntity entity ")
@NamedQuery(name = "findMax", query = "select max(entity.totalDays) from FestivalEntity entity")

public class FestivalEntity {
	@Id
	@Column(name = "f_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_region")
	private String region;
	@Column(name = "f_total_days")
	private long totalDays;
	@Column(name = "f_sweet")
	private String sweet;
	@Column(name = "f_maingod")
	private String mainGod;

	public FestivalEntity(String name, String region, long totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

}
