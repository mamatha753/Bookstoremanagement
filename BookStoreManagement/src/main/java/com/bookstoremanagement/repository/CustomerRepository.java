package com.bookstoremanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstoremanagement.entities.Customer;
@Repository("cur")
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
//	public Customer createCustomer(Customer c);
//	public List<Customer> listCustomers();
//	public Customer deleteCustomer(int i);
//	public Customer updateCustomer(Customer c);
//	public Customer viewCustomer(Customer c);
//	public Customer getCustomerById(int id);
	
}
