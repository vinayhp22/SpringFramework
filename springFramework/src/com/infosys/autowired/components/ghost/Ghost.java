package com.infosys.autowired.components.ghost;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	private String name;
	private String gender;
	private long number;
	private LocalDate dob;
	private LocalDate dod;
	private String favFlower;
	private String favFood;
	private double height;
	private double weight;
	private String dressColor;
	@Autowired
	@Qualifier("gLengthOfNails")
	private double lengthOfNails;
	@Autowired
	@Qualifier("gRevenge")
	private boolean revenge;
	@Autowired
	@Qualifier("gLanguage")
	private String language;
	@Autowired
	@Qualifier("gHairColor")
	private String hairColor;
	@Autowired
	@Qualifier("gLoverName")
	private String loverName;
	@Autowired
	@Qualifier("gFavJuice")
	private String favJuice;
	@Autowired
	@Qualifier("gJuiceBrand")
	private String juiceBrand;
	@Autowired
	@Qualifier("gComingDate")
	private LocalDate comingDate;
	@Autowired
	@Qualifier("gFighter")
	private boolean fighter;
	@Autowired
	@Qualifier("gMakesFear")
	private boolean makesFear;

	public Ghost(@Qualifier("gName") String name, @Qualifier("gGender") String gender,
			@Qualifier("gNumber") long number, @Qualifier("gDob") LocalDate dob, @Qualifier("gDod") LocalDate dod,
			@Qualifier("gFavFlower") String favFlower, @Qualifier("gFavFood") String favFood,
			@Qualifier("gHeight") double height, @Qualifier("gWeight") double weight,
			@Qualifier("gDressColor") String dressColor) {
		super();
		this.name = name;
		this.gender = gender;
		this.number = number;
		this.dob = dob;
		this.dod = dod;
		this.favFlower = favFlower;
		this.favFood = favFood;
		this.height = height;
		this.weight = weight;
		this.dressColor = dressColor;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", number=" + number + ", dob=" + dob + ", dod=" + dod
				+ ", favFlower=" + favFlower + ", favFood=" + favFood + ", height=" + height + ", weight=" + weight
				+ ", dressColor=" + dressColor + ", lengthOfNails=" + lengthOfNails + ", revenge=" + revenge
				+ ", language=" + language + ", hairColor=" + hairColor + ", loverName=" + loverName + ", favJuice="
				+ favJuice + ", juiceBrand=" + juiceBrand + ", comingDate=" + comingDate + ", fighter=" + fighter
				+ ", makesFear=" + makesFear + "]";
	}

}
