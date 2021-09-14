package it.softwareInside.TerzaAcademy18.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.TerzaAcademy18.model.Plane;
import it.softwareInside.TerzaAcademy18.model.Dipendente;
import it.softwareInside.TerzaAcademy18.service.AziendaService;



@CrossOrigin
@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	AziendaService aziendaService;



	@GetMapping("/getAzienda")
	public Plane getAzienda(@RequestParam(name="iva") String iva){
		return aziendaService.getAziendaByPiva(iva);
	}
	
	@GetMapping("/getAllAgency")
	public Iterable<Plane> getAzienda(){
		return aziendaService.AllRepository();
	}



	@GetMapping("/getAllEmployee")
	public List<Dipendente> getAllDip(@RequestParam(name="iva") String iva){

		return aziendaService.getAllDipendentiByAzienda(iva);
	}


	@GetMapping("/crea")
	public void crea(@RequestParam(name="iva") String iva , 
			@RequestParam(name="tipologia") String tipologia,
			@RequestParam(name="ragioneSociale") String ragioneSociale){

		aziendaService.createAzienda(iva, ragioneSociale, tipologia);

	}

	@GetMapping("/add")
	public void addDipendente(@RequestParam(name="iva") String iva , 
			@RequestParam(name="cf") String cf,
			@RequestParam(name="nome") String nome,
			@RequestParam(name="ruolo") String ruolo){

		Dipendente dipendente = new Dipendente(cf, nome, ruolo);
		aziendaService.assumiDipendente(iva, dipendente);

	}
	@GetMapping("/fill")
	public void fill(){
		aziendaService.fillRepository();
	}






}
