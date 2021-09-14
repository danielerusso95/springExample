package it.softwareinside.management.dentist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.management.dentist.model.Customer;
import it.softwareinside.management.dentist.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	/**
	 * return full list of customer
	 * @return
	 */
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	/**
	 * return one customer by ID
	 * @return
	 */
	public Customer getOneCustomer(String cf) {
		return customerRepository.findById(cf).get();
	}
}
