package it.softwareinside.lesson13exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import it.softwareinside.lesson13exercise.model.Artist;
import it.softwareinside.lesson13exercise.service.ArtistService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private ArtistService artistService;
	
	@GetMapping(value = "/")
	public ModelAndView getIndex() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		return model;
	}
	
	@GetMapping(value="/generate/artist")
	public String generateArtist() {
		artistService.init_artists(); 	
		return "redirect:/";
	}
	
	@GetMapping(value = "/add/artist")
	public ModelAndView addArtist() {
		ModelAndView model = new ModelAndView();
		model.setViewName("addArtist");
		model.addObject("artist",new Artist());
		return model;
	}
	
	@GetMapping(value="/artists")
	public ModelAndView getAllArtists() {
		ModelAndView model = new ModelAndView();
		model.setViewName("artists");
		model.addObject("artists", artistService.getAllArtists());
		return model;
	}
	@PostMapping(value = "/add/artist")
	public ModelAndView postSmartphone(@ModelAttribute Artist artist) {
		ModelAndView model = new ModelAndView();
		model.setViewName("artist");
		artistService.addArtist(artist);
		model.addObject("artist", artist);
		return model;
	}
}

