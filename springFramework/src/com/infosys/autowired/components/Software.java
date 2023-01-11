package com.infosys.autowired.components;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	private String name;
	@Autowired
	private double version;
	@Autowired
	private String developer;
	@Autowired
	private Date date;
	@Autowired
	private boolean free;

	public Software() {
		System.out.println("Software created....");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

}
