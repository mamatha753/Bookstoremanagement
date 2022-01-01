package com.bookstoremanagement.service;

import java.util.List;

import com.bookstoremanagement.customerdto.CustomerDto;
import com.bookstoremanagement.entities.Customer;

public interface ICustomerService {
//	public Customer createCustomer(Customer c);
	public List<Customer> listCustomers();
//	public Customer deleteCustomer(Customer c);
//	public Customer updateCustomer(Customer c);
//	public Customer viewCustomer(Customer c);
//	public List<Customer> listAllCustomersByBook(Book book);
	String deleteCustomer(int id);
	public Customer getCustomerById(int id);
	Customer updateCustomer(CustomerDto c);
	Customer createCustomer(CustomerDto c);
	

	
}
