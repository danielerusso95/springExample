package it.softwareinside.mysqltest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareinside.mysqltest.model.PostalCode;
import it.softwareinside.mysqltest.service.PostalCodeService;

@CrossOrigin
@RequestMapping(value="/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	PostalCodeService postalCodeService;
	
	@GetMapping(value="/getAllPostalCode")
	public List<PostalCode> getAllPostalCode() {
		return postalCodeService.getAllPostalCode();
	}
	@GetMapping("/findByCode")
	public List<PostalCode> findByCode(@RequestParam(name="code") String postal_code){
		return postalCodeService.getElementsByPostalCode(postal_code);
	}
	
	@RequestMapping(value="/deleteAll", method=RequestMethod.GET)
	public void deleteAll() {
		postalCodeService.deleteAll();
	}
	

}
