package it.softwareInside.com.Vacanze1.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.com.Vacanze1.model.Coach;
import it.softwareInside.com.Vacanze1.model.League;
import it.softwareInside.com.Vacanze1.model.Team;
import it.softwareInside.com.Vacanze1.service.Service;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping("/api")
public class RestController {

	@Autowired
	private Service service;

	@GetMapping("/team")
	public List<Team> getTeam() {
		return service.getTeam();
	}
	
	@PostMapping("/insert")
	public void insertTeam(@RequestBody() Team team) {
		service.insertTeam(team);
	}
	
	@PostMapping("/insert/league")
	public void insertLeague(@RequestBody League league) {
		service.insertLeague(league);
	}

	@PostMapping("/coach")
	public void inseriscoCoach(@RequestBody Coach coach) {
		service.insertCoach(coach);
	}

	@GetMapping("/find")
	public List<Coach> getCoach() {
		return service.findCoach();
	}
	
	//DELETE
	@DeleteMapping("/delete")
	public void deleteCoach(@RequestParam(name="id") int id) {
		service.deleteCoach(id);
	}
	
	//PUT
	@PutMapping("/put")
	public void updateCoach(@RequestParam(name="id") int id,
			                @RequestParam(name="nome") String nome) {
		
		service.updateCoach(id,nome);	
	}
	
	

	

}
