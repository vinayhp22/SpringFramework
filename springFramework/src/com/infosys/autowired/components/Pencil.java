package com.infosys.autowired.components;

import java.awt.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.infosys.autowired.constants.PencilType;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private PencilType type;
	@Autowired
	@Qualifier("pencilPrice")
	private double price;
	@Autowired
	@Qualifier("pencilColor")
	private Color color;
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("pencilStolen")
	private boolean stolen;

	public Pencil() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
