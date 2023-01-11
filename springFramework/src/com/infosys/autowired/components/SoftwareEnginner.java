package com.infosys.autowired.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEnginner {

	@Autowired
	@Qualifier("enginnerName")
	private String name;
	@Autowired
	private long salary;
	@Autowired
	private String companyName;
	@Autowired
	private int experiance;

	public SoftwareEnginner() {
		System.out.println("SoftwareEngineer created...");
	}

	@Override
	public String toString() {
		return "SoftwareEnginner [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experiance=" + experiance + "]";
	}
}
