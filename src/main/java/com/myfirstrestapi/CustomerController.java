package com.myfirstrestapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	public Customer getCustomer() {
		return new Customer("Mukesh", "Arumugam");
	}
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		List<Customer> customer = new ArrayList<>();
		customer.add(new Customer("Mukesh","Arumugam"));
		customer.add(new Customer("Alan","Antony"));
		customer.add(new Customer("Venkatesh","Ravi"));
		customer.add(new Customer("Jeffry","Dhivyan john"));
		customer.add(new Customer("Selva","Kumar"));
		customer.add(new Customer("Raj","Kumar"));
		return customer;
	}

}
