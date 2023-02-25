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

@Entity
@Table(name = "festival_table")
@Data
@NoArgsConstructor
@NamedQuery(name = "findByIdAndName", query = "select fest from FestivalEntity fest where fest.id = :byid and fest.name = :byname")
@NamedQuery(name = "findByNameAndRegionAndMainGod", query = "select fest from FestivalEntity fest where fest.name = :byname and fest.region = :byregion and fest.mainGod = :bymainGod")
@NamedQuery(name = "findByMainGod", query = "select fest from FestivalEntity fest where fest.mainGod = :bymainGod")
@NamedQuery(name = "findTotalDaysByName", query = "select fest.totalDays from FestivalEntity fest where fest.name = :byname")
@NamedQuery(name = "findRegionAndMainGodByNameAndId", query = "select fest.region, fest.mainGod from FestivalEntity fest where fest.id = :byid and fest.name = :byname")
@NamedQuery(name = "findMainGodAndTotalDaysByName", query = "select fest.mainGod, fest.totalDays from FestivalEntity fest where fest.name = :byname")
@NamedQuery(name = "findTotal", query = "select sum(fest.totalDays) from FestivalEntity fest")
@NamedQuery(name = "findMaxTotalDays", query = "select max(fest.totalDays) from FestivalEntity fest")
public class FestivalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_region")
	private String region;
	@Column(name = "f_total_days")
	private int totalDays;
	@Column(name = "f_sweet")
	private String sweet;
	@Column(name = "f_main_god")
	private String mainGod;
	
	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}
	
	
}
