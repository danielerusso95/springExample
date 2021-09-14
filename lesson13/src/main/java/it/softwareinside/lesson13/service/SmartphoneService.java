package it.softwareinside.lesson13.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import it.softwareinside.lesson13.model.Smartphone;
import it.softwareinside.lesson13.repository.ArtistRepository;

@Service
public class SmartphoneService {
	
	@Autowired
	private ArtistRepository smartphoneRepository;
	 
	/**
	 * Save a smartphone in database
	 * @param smartphone
	 */
	public void addSmartphone(Smartphone smartphone) {
		smartphoneRepository.save(smartphone);
	}
	
	/**
	 * Delete a smartphone in database per indice
	 * @param smartphone
	 */
	public void deleteSmartphone(int index) {
		smartphoneRepository.deleteById(index);
	}
	
	/**
	 * Delete a smartphone in database per smartphone
	 * @param smartphone
	 */
	public void deleteSmartphone(Smartphone smartphone) {
		smartphoneRepository.delete(smartphone);
	}
	
	
	/**
	 * init a series of random smartphones
	 */
	public void init_phones() {
		for (int i = 0; i < 10; i++) {
			smartphoneRepository.save(new Smartphone(getARandomBrand(),getARandomModel(),getARandomPrice()));
		}
	}
	
	
	/**
	 * helper methods to generate smartphones
	 * @return
	 */
	private String getARandomBrand() {
		List<String> brands = Arrays.asList("apple","samsung","xiaomi","huawei","onePlus");
		Collections.shuffle(brands);
		return brands.get(0);
	}
	private String getARandomModel() {
		List<String> models = Arrays.asList("s12","11 pro max","redmi note","p10","8T");
		Collections.shuffle(models);
		return models.get(0);
	}
	private double getARandomPrice() {
		return new Random().nextInt(600)+100;
	}
	
	
	public ArrayList<Smartphone> getAllPhones(){
		return (ArrayList<Smartphone>) smartphoneRepository.findAll();
	}
	
	
}
