package com.infosys.autowired.configuration;

import java.awt.Color;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.infosys.autowired.constants.PencilType;
import com.infosys.autowired.constants.RubberSize;
import com.infosys.autowired.constants.RubberType;

@Configuration
@ComponentScan("com.infosys.autowired")
public class AutowiredCinfiguration {

	//============ Hardwareshop: ===========
	@Bean
	public int id() {
		System.out.println("Hardwareshop: id created");
		return 25025;
	}
	
	@Bean
	public String boss() {
		System.out.println("Hardwareshop: name created");
		return "Boss Hardwares";
	}
	
	@Bean
	public long gstNo() {
		System.out.println("Hardwareshop: gstNo created");
		return 123654789632145l;
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Hardwareshop: ownerName created");
		return "BigBoss";
	}
	
	@Bean
	public String address() {
		System.out.println("Hardwareshop: address created");
		return "BashyamCircle";
	}
	
	//========== Software ===================
	
	@Bean
	public String name() {
		System.out.println("Software: name created");
		return "Whatsapp";
	}
	
	@Bean
	public double version() {
		System.out.println("Software: version created");
		return 250.3;
	}
	
	@Bean
	public String developer() {
		System.out.println("Software: version created");
		return "Vinoda mam";
	}
	
	@Bean
	public Date date() {
		System.out.println("Software: date created");
		Date date = new Date(2023, 01, 12);
		return date;
	}
	
	@Bean
	public boolean free() {
		System.out.println("Software: free created");
		return true;
	}	
	
	//========== SoftwareEnginner: ===================
	
	@Bean("enginnerName")
	public String name1() {
		System.out.println("SoftwareEnginner: name created");
		return "Lokesh Sir";
	}
	
	@Bean
	public long salary() {
		System.out.println("SoftwareEnginner: salary created");
		return 852963741;
	}
	
	@Bean
	public String companyName() {
		System.out.println("SoftwareEnginner: companyName created");
		return "X-workz";
	}
	
	@Bean
	public int experiance() {
		System.out.println("SoftwareEnginner: experiance created");
		return 10;
	}
	
	//========== Pencil: ===================

	@Bean
	public String pencilName() {
		System.out.println("Pencil: name created");
		return "Nataraja pencils";
	}
	
	@Bean
	public PencilType pencilType() {
		System.out.println("Pencil: type created");
		return PencilType.WOODEN_PENCIL;
	}
	
	@Bean
	public double pencilPrice() {
		System.out.println("Pencil: price created");
		return 4.5;
	}
	
	@Bean
	public Color pencilColor() {
		System.out.println("color: color created");
		return Color.GREEN;
	}
	
	@Bean
	public boolean pencilSharp() {
		System.out.println("Pencil: sharp created");
		return false;
	}
	
	@Bean
	public boolean pencilStolen() {
		System.out.println("Pencil: name created");
		return true;
	}
	
	
	//========== rubber: ===================

	@Bean
	public String rubberName() {
		System.out.println("rubber: name created");
		return "Nataraja rubbers";
	}
	
	@Bean
	public RubberType type() {
		System.out.println("rubber: type created");
		return RubberType.SPECIFIC_DESIGN;
	}
	
	@Bean
	public double price() {
		System.out.println("rubber: price created");
		return 4.5;
	}
	
	@Bean
	public Color color() {
		System.out.println("rubber: color created");
		return Color.white;
	}
	
	@Bean
	public boolean sharp() {
		System.out.println("rubber: sharp created");
		return false;
	}
	
	@Bean
	public boolean stolen() {
		System.out.println("rubber: stolen created");
		return true;
	}
	
	@Bean
	public RubberSize size() {
		System.out.println("rubber: size created");
		return RubberSize.LARGE;
	}
	
	//========== Country: ===================

	@Bean
	public String countryName() {
		return "INDIA";
	}
	
	@Bean
	public int callingCode() {
		return 91;
	}
	
	@Bean
	public byte states() {
		return 29;
	}
	
	@Bean
	public short unionTerritories() {
		return 9;
	}
	
	@Bean
	public long population() {
		return 1375586000;
	}
	@Bean
	public float timeZone() {
		return 05.30f;
	}
	
	@Bean
	public double gdpInTrillion() {
		return 3.469;
	}
	
	@Bean
	public char isoCode() {
		return 'I';
	}
	
	@Bean
	public boolean demogracy() {
		return true;
	}
}
