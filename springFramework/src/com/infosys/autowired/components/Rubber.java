package com.infosys.autowired.components;

import java.awt.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.infosys.autowired.constants.PencilType;
import com.infosys.autowired.constants.RubberSize;
import com.infosys.autowired.constants.RubberType;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	private RubberType type;
	@Autowired
	private double price;
	@Autowired
	private Color color;
	@Autowired
	private boolean sharp;
	@Autowired
	private boolean stolen;
	@Autowired
	private RubberSize size;

	public Rubber() {
		System.out.println("Rubber Created");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
}
