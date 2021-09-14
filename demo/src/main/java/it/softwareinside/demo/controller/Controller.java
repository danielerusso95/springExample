package it.softwareinside.demo.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.model.Persona;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping(value = "/")
	public ModelAndView getIndex() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	@GetMapping(value = "/info")
	public ModelAndView getInfo() {
		ModelAndView model = new ModelAndView();
		model.setViewName("myInfo");
		return model;
	}
	@GetMapping(value = "/contatti")
	public ModelAndView getContact() {
		ModelAndView model = new ModelAndView();
		model.setViewName("contatti");
		return model;
	}

	@GetMapping(value = "/genera")
	public ModelAndView getGenera() {
		ModelAndView model = new ModelAndView();
		model.setViewName("genera");
		Random rand = new Random();
		model.addObject("example", rand.nextInt(100)+1);
		return model;
	}
	
	@GetMapping(value = "/generaNome")
	public ModelAndView getGeneraNome() {
		ModelAndView model = new ModelAndView();
		model.setViewName("generaNome");
		String[] names = {"daniele","roberto","marco","giulia","luca","aryel","alina","emanuele"};
		Random rand = new Random();
		model.addObject("example", names[rand.nextInt(names.length)]);
		return model;
	}
	@GetMapping(value = "/persona")
	public ModelAndView getPersona() {
		ModelAndView model = new ModelAndView();
		model.setViewName("persona");
		Persona persona = new Persona("Daniele","Russo",26);
		model.addObject("persona", persona);
		return model;
	}
}
