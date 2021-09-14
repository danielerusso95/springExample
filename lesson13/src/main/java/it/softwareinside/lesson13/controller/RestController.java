package it.softwareinside.lesson13.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareinside.lesson13.model.Smartphone;
import it.softwareinside.lesson13.service.SmartphoneService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private SmartphoneService smartphoneService;
	
	@GetMapping("/api/all")
	public List<Smartphone> getAllSmartphones(){
	
		return smartphoneService.getAllPhones();
	}
	
	
	@GetMapping("/api/delete")
	public void delete(@RequestParam (name="id")Integer id) {
		smartphoneService.deleteSmartphone(id);
	}
	
	
}