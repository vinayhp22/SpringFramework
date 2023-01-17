package com.xworkz.crud.boot;

import com.xworkz.crud.dto.TerroristDTO;
import com.xworkz.crud.service.TerroristService;
import com.xworkz.crud.service.TerroristServiceimpl;

public class TerroristRunner {
	public static void main(String[] args) {
		
		TerroristDTO dto = new TerroristDTO("Md San Khan", -1, "Pakistan", true, false, "Sucide Bomber", "lashkar-e-taiba");
		TerroristDTO dto1 = new TerroristDTO(null, 20, "Pakistan", true, false, "Sucide Bomber", "lashkar-e-taiba");
		TerroristDTO dto2 = new TerroristDTO(null, 20, null, true, false, "Sucide Bomber", "lashkar-e-taiba");
		TerroristDTO dto3 = new TerroristDTO(null, 20, "Pakistan", false, false, "Sucide Bomber", "lashkar-e-taiba");
		TerroristService service = new TerroristServiceimpl();
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
	}
}
