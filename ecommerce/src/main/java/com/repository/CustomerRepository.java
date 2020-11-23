package com.repository;

import org.springframework.data.repository.CrudRepository;
import com.ecom.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	Customer findByUsernameAndPassword(String username, String password);

}
