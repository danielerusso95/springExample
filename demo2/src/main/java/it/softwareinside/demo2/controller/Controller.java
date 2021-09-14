package it.softwareinside.demo2.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.demo2.model.Car;



@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping(value = "/")
	public ModelAndView getIndex() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	@GetMapping(value = "/cars")
	public ModelAndView getCar() {
		ModelAndView model = new ModelAndView();
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<String> foto = new ArrayList<String>();
		foto.add("https://picsum.photos/200");
		foto.add("https://www.artemedialab.it/wp-content/uploads/2019/04/immagini-sfondo-1-700x400.jpg");
		Car car1 = new Car("a3","audi","nera",foto,30000);
		Car car2 = new Car("panda","fiat","grigia",foto,10000);
		Car car3 = new Car("focus","ford","blu",foto,20000);
		Car car4 = new Car("focus","ford","blu",foto,20000);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		model.addObject("cars", cars);
		model.setViewName("cars");
		return model;
	}
	@GetMapping(value = "/carsss")
	public ModelAndView getCarsss() {
		ModelAndView model = new ModelAndView();
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<String> foto = new ArrayList<String>();
		foto.add("https://www.artemedialab.it/wp-content/uploads/2019/04/immagini-sfondo-1-700x400.jpg");
		foto.add("https://www.artemedialab.it/wp-content/uploads/2019/04/immagini-sfondo-1-700x400.jpg");
		Car car1 = new Car("a3","audi","nera",foto,30000);
		Car car2 = new Car("panda","fiat","grigia",foto,10000);
		Car car3 = new Car("focus","ford","blu",foto,20000);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		model.addObject("cars", cars);
		model.setViewName("carsss");
		return model;
	}
	@GetMapping(value = "/contacts")
	public ModelAndView getContacts() {
		ModelAndView model = new ModelAndView();
		model.setViewName("contacts");
		return model;
	}
}
