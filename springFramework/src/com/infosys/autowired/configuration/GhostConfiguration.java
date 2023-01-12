package com.infosys.autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.infosys.autowired.components.ghost")
public class GhostConfiguration {

	// ============== NewsPaper ================

	@Bean
	public long npId() {
		return 852963741;
	}

	@Bean
	public String npName() {
		return "The Hindu";
	}

	@Bean
	public String npOwnerName() {
		return "Subramanya Iyer";
	}

	@Bean
	public String npLanguage() {
		return "English";
	}

	@Bean
	public double npPrice() {
		return 55;
	}

	// ============== Engine ================
	@Bean
	public String engineName() {
		return "1 cylynder";
	}

	@Bean
	public String engineType() {
		return "Bike";
	}

	@Bean
	public int engineNumber() {
		return 85296;
	}

	@Bean
	public float engineVersion() {
		return 75.96f;
	}

	@Bean
	public String engineCompany() {
		return "Bajaj";
	}

	@Bean
	public int engineStrokes() {
		return 4;
	}
	
	// ============== Engine ================

	@Bean
	public String snakeName() {
		return "King Cobra";
	}

	@Bean
	public double snakeLength() {
		return 3.4;
	}

	@Bean
	public String snakeColor() {
		return " black with white stripes & unbroken brownish grey";
	}
	
	@Bean
	public String snakeType() {
		return "venomous elapid snake species";
	}
	
	@Bean
	public boolean snakePoisonous() {
		return true;
	}
	
	// ============== Ghost ================

	@Bean
	public String gName() {
		return "Vinodha mam";
	}

	
	@Bean
	public String gGender() {
		return "Female";
	}
	
	@Bean
	public long gNumber() {
		return 852963741852l;
	}
	
	@Bean
	public LocalDate gDob() {
		return LocalDate.of(1998, 12, 30);
	}
	
	@Bean
	public LocalDate gDod() {
		return LocalDate.of(2023, 5, 8);
	}
	
	@Bean
	public String gFavFlower() {
		return "Mysore Mallige";
	}
	
	@Bean
	public String gFavFood() {
		return "Human Blood";
	}
	
	@Bean
	public double gHeight() {
		return 5.6;
	}
	
	@Bean
	public double gWeight() {
		return 80;
	}
	
	@Bean
	public String gDressColor() {
		return "White";
	}
	
	@Bean
	public double gLengthOfNails() {
		return 5.6;
	}
	
	@Bean
	public boolean gRevenge() {
		return true;
	}
	
	@Bean
	public String gLanguage() {
		return "Special language";
	}
	
	@Bean
	public String gHairColor() {
		return "White";
	}
	
	@Bean
	public String gLoverName() {
		return "gay";
	}
	
	@Bean
	public String gFavJuice() {
		return "Alco";
	}
	
	@Bean
	public String gJuiceBrand() {
		return "OMR";
	}
	
	@Bean
	public LocalDate gComingDate() {
		return LocalDate.of(1999, 5, 6);
	}
	
	@Bean
	public boolean gFighter() {
		return false;
	}
	
	@Bean
	public boolean gMakesFear() {
		return true;
	}
}
