package com.bookstoremanagement.customercontrollers;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstoremanagement.customerdto.CustomerDto;
import com.bookstoremanagement.entities.Customer;
import com.bookstoremanagement.responses.ResponseInfo;
import com.bookstoremanagement.service.CustomerServiceImpl;
import com.bookstoremanagement.service.ICustomerService;
@RestController
public class CustomerController {
	@Autowired
	ICustomerService cus;
	@GetMapping("/customers")
	public List<Customer> ListAllCustomer(){
			return cus.listCustomers();
			
		}
	
	
//	@GetMapping("/customers/{id}")
//	public List<Customer> listAllCustomersByBook(@PathVariable("id")Book book){
//		return cus.
//	}
	
	
	@DeleteMapping("/customers/{id}")
	public  String deleteCustomer(@PathVariable("id")int id){
		return cus.deleteCustomer(id);
	}
	
//	@DeleteMapping("/customers/byname/{name}")
//	public  String deleteCustomer(@PathVariable("name")String name){
//		return cus.deleteCustomer(name);
//	}
	
	@PutMapping("/customers")
	public  Customer updateCustomer(@Valid @RequestBody CustomerDto c){
		return cus.updateCustomer(c);
	}
	
//	@GetMapping("/customers")
//	public String viewCustomer(@RequestBody Customer c){
//		return cus.
//	}
	
	@PostMapping("/customers")
	public Customer createCustomer(@Valid @RequestBody CustomerDto c) {
		return cus.createCustomer(c);
		 
	}

	@GetMapping("/Customers")
	public Object getCustomerById(int i) {
		// TODO Auto-generated method stub
		return cus.getCustomerById(i);
	}
}
