package it.softwareInside.TerzaAcademy16Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.TerzaAcademy16Spring.model.Casa;
import it.softwareInside.TerzaAcademy16Spring.model.Indirizzo;
import it.softwareInside.TerzaAcademy16Spring.repository.CasaRepository;

@Service
public class CasaService {

	@Autowired
	private CasaRepository casaRepository;
	
	
	public void fill() {
		Casa casa = new Casa(200, "attivo", new Indirizzo("GARIABALDI", 17));
		casaRepository.save(casa);
	}
	
	public List<Casa> getAll(){
		
		return casaRepository.findAll();
	}
	
	
}
