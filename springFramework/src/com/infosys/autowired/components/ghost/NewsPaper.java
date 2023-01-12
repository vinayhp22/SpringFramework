package com.infosys.autowired.components.ghost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	@Autowired
	@Qualifier("npId")
	private long id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("npLanguage")
	private String language;
	private double price;

	public NewsPaper(@Qualifier("npName") String name, @Qualifier("npOwnerName") String ownerName) {
		System.out.println("NewsPaper Created...");
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

	@Qualifier("npPrice")
	public void setName(String name) {
		this.name = name;
	}

}
