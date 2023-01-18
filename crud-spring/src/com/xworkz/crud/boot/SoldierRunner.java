package com.xworkz.crud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crud.dto.SoldierDTO;
import com.xworkz.crud.service.SoldierService;
import com.xworkz.crud.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		// ApplicationContext container = new AnnotationConfigApplicationContext()
		SoldierDTO dto = new SoldierDTO("Akshara", 10000000, "HR Representive", "XworkzODC", "RajajiNagar");
		SoldierServiceImpl service = new SoldierServiceImpl();
		service.validateAndSave(dto);
		
	}
}
