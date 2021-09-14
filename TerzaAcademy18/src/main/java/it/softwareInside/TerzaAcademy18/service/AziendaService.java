package it.softwareInside.TerzaAcademy18.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.TerzaAcademy18.model.Plane;
import it.softwareInside.TerzaAcademy18.model.Dipendente;
import it.softwareInside.TerzaAcademy18.repository.AziendaRepository;

@Service
public class AziendaService {

	@Autowired
	private AziendaRepository aziendaRepository ;
	
	//@Autowired
	//private DipendenteRepository dipendenteRepository;
	
	
	public Plane getAziendaByPiva(String iva) {
		return aziendaRepository.findById(iva).get();
	}
	
	
	public void createAzienda(String iva, String ragioneSociale , String tipologia) {
		
		Plane azienda = new Plane(iva, ragioneSociale, tipologia);
		aziendaRepository.save(azienda);
	}
	
	public void assumiDipendente(String iva , Dipendente dipendente) {
		
		Plane azienda = aziendaRepository.findById(iva).get();
		azienda.getDipendenti().add(dipendente);
		aziendaRepository.save(azienda);
	}
	
	public void fireDipendente(String iva , Dipendente dipendente) {
		
		Plane azienda = aziendaRepository.findById(iva).get();
		azienda.getDipendenti().remove(dipendente);
		aziendaRepository.save(azienda);

	}
	
	public void fillRepository() {
		
		Plane azienda = new Plane("11111111111", "srl", "IT");
		Plane azienda1 = new Plane("22222222222", "spa", "ET");
		Plane azienda2 = new Plane("33333333333", "srl", "IT");
		Plane azienda3 = new Plane("44444444444", "spa", "ET");
		azienda.getDipendenti().add(new Dipendente("RSSDNL95M30M289K","daniele","dev"));
		azienda1.getDipendenti().add(new Dipendente("RSSDNL95M30M289K","daniele","dev"));
		azienda2.getDipendenti().add(new Dipendente("RSSDNL95M30M289K","daniele","dev"));
		azienda3.getDipendenti().add(new Dipendente("RSSDNL95M30M289K","daniele","dev"));
		aziendaRepository.save(azienda);
		aziendaRepository.save(azienda1);
		aziendaRepository.save(azienda2);
		aziendaRepository.save(azienda3);
		
	}
	public Iterable<Plane> AllRepository() {
		
		return aziendaRepository.findAll();
		
	}
	
	
	
	
	/**
	 * 
	 * 
	 * @param iva
	 * @return
	 */
	public List<Dipendente> getAllDipendentiByAzienda(String iva){
		
		Plane azienda = aziendaRepository.findById(iva).get();

		return azienda.getDipendenti();
	}
	
	
	
	
}
