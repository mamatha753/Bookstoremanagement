package com.bookstoremanagement.customermapper;

import com.bookstoremanagement.customerdto.CustomerDto;
import com.bookstoremanagement.entities.Customer;

public class CustomerMapper {
	public static Customer toStatement(CustomerDto customerDto) 
	{
		Customer customer = new Customer();
		customer.setCustomerId(customerDto.getCustomerId());
		customer.setFullName(customerDto.getFullName());
		customer.setEmail(customerDto.getEmail());
		customer.setMobileNumber(customerDto.getMobileNumber());
		customer.setPassword(customerDto.getPassword());
		customer.setRegisterOn(customerDto.getRegisterOn());
		customer.setAddress(customerDto.getAddress());
		return customer;
		
		
	}
	public static CustomerDto toCustomerDto(Customer customer) 
	{
		CustomerDto customerdto = new CustomerDto();
		customerdto.setCustomerId(customer.getCustomerId());
		customerdto.setFullName(customer.getFullName());
		customerdto.setAddress(customer.getAddress());
		customerdto.setEmail(customer.getEmail());
		customerdto.setMobileNumber(customer.getMobileNumber());
		customerdto.setPassword(customer.getPassword());
		customerdto.setRegisterOn(customer.getRegisterOn());
		return customerdto;
	}
}
