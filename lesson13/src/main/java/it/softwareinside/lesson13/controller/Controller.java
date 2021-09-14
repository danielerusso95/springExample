package it.softwareinside.lesson13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.lesson13.model.Smartphone;
import it.softwareinside.lesson13.service.SmartphoneService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private SmartphoneService smartphoneService;
	
	@GetMapping(value = "/")
	public ModelAndView getIndex() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		return model;
	}
	
	@GetMapping(value="/genera")
	public String generaInitPhones() {
		smartphoneService.init_phones(); // mi crea 10 telefoni nel database	
		return "redirect:/";
	}
	
	@GetMapping(value = "/add/smartphone")
	public ModelAndView addSmartphone() {
		ModelAndView model = new ModelAndView();
		model.setViewName("addSmartphone");
		model.addObject("smartphone",new Smartphone());
		return model;
	}
	
	@GetMapping(value="/smartphones")
	public ModelAndView getAllPhones() {
		ModelAndView model = new ModelAndView();
		model.setViewName("smartphones");
		model.addObject("phones", smartphoneService.getAllPhones());
		return model;
	}
	@PostMapping(value = "/add/smartphone")
	public ModelAndView postSmartphone(@ModelAttribute Smartphone smartphone) {
		ModelAndView model = new ModelAndView();
		model.setViewName("smartphone");
		smartphoneService.addSmartphone(smartphone);
		model.addObject("smartphone", smartphone);
		return model;
	}
}
