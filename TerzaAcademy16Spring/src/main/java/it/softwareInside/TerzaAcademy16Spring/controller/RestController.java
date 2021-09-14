package it.softwareInside.TerzaAcademy16Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import it.softwareInside.TerzaAcademy16Spring.model.Casa;
import it.softwareInside.TerzaAcademy16Spring.service.CasaService;

@CrossOrigin
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private CasaService casaService;
	
	@GetMapping("/api/fill")
	public void fill() {
		
		casaService.fill();
	}
	
	@GetMapping("/api/all")
	public List<Casa> getAll(){
		return casaService.getAll();
	}
	
	
}
