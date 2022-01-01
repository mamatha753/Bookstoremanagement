package com.bookstoremanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstoremanagement.customerdto.CustomerDto;
import com.bookstoremanagement.customermapper.CustomerMapper;
import com.bookstoremanagement.entities.Customer;
import com.bookstoremanagement.exceptions.CustomerIdNotFound;
import com.bookstoremanagement.repository.CustomerRepository;
@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{
@Autowired
CustomerRepository cur;
	@Override
	public Customer createCustomer(CustomerDto c) {

		// TODO Auto-generated method stub
		Customer customerobj = CustomerMapper.toStatement(c);
		 return cur.save(customerobj);
			
	}

	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return cur.findAll();
	}

	@Override
	public String deleteCustomer(int id) {
		// TODO Auto-generated method stub
		cur.deleteById(id);
		 return "Deleted Succesfully";
	}
	@Override
	public Customer updateCustomer(CustomerDto c) {
		// TODO Auto-generated method stub
		Customer customerobj1 = CustomerMapper.toStatement(c);
		return cur.save(customerobj1);
	}

//	@Override
//	public List<Customer> viewCustomer(Customer c) {
		// TODO Auto-generated method stub
//		return cur.findAll();
//	}
	
	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Optional<Customer> cat = cur.findById(id);
		if(cat.isPresent()) {
			return cat.get();
		}
		throw new CustomerIdNotFound("Id not found");
	}
}
