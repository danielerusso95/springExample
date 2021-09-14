package it.softwareinside.airInside.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.airInside.model.People;
import it.softwareinside.airInside.model.Plane;
import it.softwareinside.airInside.repository.PlaneRepository;


@Service
public class PlaneService {

	@Autowired
	private PlaneRepository planeRepository;
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	private Validator validator = factory.getValidator();

	
	
	
	
	
	//@Autowired
	//private DipendenteRepository dipendenteRepository;
	
	
	public Plane getPlaneById(String code) {
		return planeRepository.findById(code).get();
	}
	
	
	public boolean addPerson(String code , People person) {
		
		Set<ConstraintViolation<People>> violations = validator.validate(person);
		for (ConstraintViolation<People> constraintViolation : violations) {
			System.out.println(constraintViolation.getInvalidValue());
			System.out.println(constraintViolation.getMessage());
		}
		if(violations.size()>0 && planeRepository.findById(code).get().getPeople().contains(person))
			return false;
		else {
			planeRepository.findById(code).get().getPeople().add(person);
			return true;
		}
	}
	
	public void fireDipendente(String code , People person) {
		
		Plane plane = planeRepository.findById(code).get();
		plane.getPeople().remove(person);
		planeRepository.save(plane);

	}
	
	public boolean fillRepository() {
		
		Plane plane = new Plane();
		Plane plane1 = new Plane();
		Plane plane2 = new Plane();
		People person = new People("daniele", 26, "ciao@example.it");
		People person1 = new People("roberto", 30, "ciao@example.it");
		People person2 = new People("marco", 26, "ciao@example.it");
		People person3 = new People("luca", 27, "ciao@example.it");
		People person4 = new People("giulia", 25, "ciao@example.it");
		Set<ConstraintViolation<Plane>> violations = validator.validate(plane);
		Set<ConstraintViolation<Plane>> violations1 = validator.validate(plane1);
		Set<ConstraintViolation<Plane>> violations2 = validator.validate(plane2);
		Set<ConstraintViolation<People>> violations3 = validator.validate(person);
		Set<ConstraintViolation<People>> violations4 = validator.validate(person1);
		Set<ConstraintViolation<People>> violations5 = validator.validate(person2);
		Set<ConstraintViolation<People>> violations6 = validator.validate(person3);
		Set<ConstraintViolation<People>> violations7 = validator.validate(person4);
		
		
		int viols=violations.size()+violations1.size()+violations2.size()+violations3.size()+violations4.size()+violations5.size()+violations6.size()+violations7.size();
		System.out.println(violations1);
		if(viols>0)
			return false;
		else {
			plane.getPeople().add(person4);
			plane.getPeople().add(person);
			plane1.getPeople().add(person2);
			plane2.getPeople().add(person1);
			plane2.getPeople().add(person3);
			planeRepository.save(plane1);
			planeRepository.save(plane2);
			planeRepository.save(plane);
			return true;
		}
		
	}
	public Iterable<Plane> AllRepository() {
		
		return planeRepository.findAll();
		
	}
	
	public List<People> getAllPeople(String code){
		return planeRepository.findById(code).get().getPeople();
	}
	
}
