package it.softwareinside.lesson13exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareinside.lesson13exercise.model.Artist;
import it.softwareinside.lesson13exercise.service.ArtistService;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private ArtistService smartphoneService;
	
	@GetMapping("/api/all")
	public List<Artist> getAllSmartphones(){
	
		return smartphoneService.getAllArtists();
	}
	
	@GetMapping("/api/delete")
	public void delete(@RequestParam (name="id")Integer id) {
		smartphoneService.deleteArtist(id);
	}
	@GetMapping("/api/delete/all")
	public void deleteAll() {
		smartphoneService.deleteAll();
	}
	
	
}