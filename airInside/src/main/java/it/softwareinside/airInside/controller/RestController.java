package it.softwareinside.airInside.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.softwareinside.airInside.model.People;
import it.softwareinside.airInside.model.Plane;
import it.softwareinside.airInside.service.PlaneService;


@CrossOrigin
@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private PlaneService planeService;
	
	@GetMapping("/getPlane")
	public Plane getAzienda(@RequestParam(name="code") String code){
		return planeService.getPlaneById(code);
	}
	
	@GetMapping("/getAllPlanes")
	public Iterable<Plane> getPlanes(){
		return planeService.AllRepository();
	}

	@GetMapping("/getAllEmployee")
	public List<People> getAllDip(@RequestParam(name="code") String code){
		return planeService.getAllPeople(code);
	}

	@GetMapping("/fill")
	public void fill(){
		planeService.fillRepository();
	}
	
}
