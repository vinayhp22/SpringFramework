package com.infosys.autowired.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Autowired
	@Qualifier("countryName")
	private String name;
	@Autowired
	private int callingCode;
	@Autowired
	private byte states;
	@Autowired
	private short unionTerritories;
	@Autowired
	private long population;
	@Autowired
	private float timeZone;
	@Autowired
	private double gdpInTrillion;
	@Autowired
	private char isoCode;
	@Autowired
	private boolean demogracy;

	public Country() {
		System.out.println("Country created...");
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", callingCode=" + callingCode + ", states=" + states + ", unionTerritories="
				+ unionTerritories + ", population=" + population + ", timeZone=" + timeZone + ", gdpInTrillion="
				+ gdpInTrillion + ", isoCode=" + isoCode + ", demogracy=" + demogracy + "]";
	}

}
