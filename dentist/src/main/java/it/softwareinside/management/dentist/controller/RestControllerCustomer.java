package it.softwareinside.management.dentist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.softwareinside.management.dentist.model.Customer;
import it.softwareinside.management.dentist.service.CustomerService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/customer")
public class RestControllerCustomer {

	@Autowired
	private CustomerService customerService;
	
	/**
	 * uri to get all customer
	 * @return
	 */
	@GetMapping("/getAll")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomers();
	}
	
	/**
	 * uri to get one appointment by ID
	 * @return
	 */
	@GetMapping(value = "/getOneCustomer/{cf}")
	public Customer getOneCustomer(@PathVariable String cf) {
		return customerService.getOneCustomer(cf);
	}
}
