package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Customer;
import com.repository.CustomerRepository;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST })
public class AppController {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private HttpSession httpSession;

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public boolean validate() {
		return (httpSession.getAttribute("customerId") == null) ? false : true;
	}

	@PostMapping("/signup")
	public Customer signUp(@RequestBody Customer customer) {
		try {
			customer = customerRepository.save(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		if (customer.getCustomerId() != 0) {
			return customer;
		}
		return null;
	}

	@PostMapping("/signin")
	public Customer signIn(@RequestBody Customer customer) {
		Customer dbCustomer = customerRepository.findByUsernameAndPassword(customer.getCustomerUserName(), customer.getCustomerPassword());

		if (dbCustomer != null && dbCustomer.getCustomerUserName().equals(customer.getCustomerUserName())
				&& dbCustomer.getCustomerPassword().equals(customer.getCustomerPassword())) {
			httpSession.setAttribute("customerId", dbCustomer.getCustomerId());
			return dbCustomer;
		}
		return null;
	}

}
