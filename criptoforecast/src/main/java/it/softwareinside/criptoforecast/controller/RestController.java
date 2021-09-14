package it.softwareinside.criptoforecast.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import it.softwareinside.criptoforecast.service.CriptoService;

@CrossOrigin
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private CriptoService criptoService;


	@GetMapping("/test")
	public void test() {
		criptoService.getData();
	}
	@GetMapping("/testforecast")
	public double[] testforecast() {
		return criptoService.forecast();
	}
	@GetMapping("/initialValue")
	public ArrayList<Double> initialValue() {
		return criptoService.getData().getCripto();
	}
}
