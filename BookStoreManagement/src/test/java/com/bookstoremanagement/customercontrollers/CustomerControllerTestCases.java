package com.bookstoremanagement.customercontrollers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookstoremanagement.customercontrollers.CustomerController;
import com.bookstoremanagement.customerdto.CustomerDto;
import com.bookstoremanagement.entities.Address;
import com.bookstoremanagement.entities.Customer;
import com.bookstoremanagement.service.ICustomerService;

import org.mockito.junit.jupiter.MockitoExtension;
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
public class CustomerControllerTestCases {
	@InjectMocks
	CustomerController customercontroller;
	@Mock
	 Customer customer; 
	

	
	@Mock
	 ICustomerService cus;
	@Mock
	CustomerDto customerDto;
	@Mock
	Customer customerDto1;
	
	@BeforeEach
	public  void startup() {
		MockitoAnnotations.initMocks(this);
//		cus= mock(ICustomerService.class);
		//Customer customer=new Customer();
		//List<Address> ad=new ArrayList();  
		//List<Customer> cuslist=new ArrayList(); 
		customer=new Customer(1,"mammu@gmail.com","M mamatha","123456",null,"9522331100",LocalDate.of(1998, 12, 12));
		customerDto=new CustomerDto(1,"mammu@gmail.com","M mamatha","123456",null,"9522331100",LocalDate.of(1998, 12, 12));
		
		/*customer.setUserId(1);
		customer.setContactNo("9867564434");
		customer.setEmail("rokey@gmail.com");
		customer.setName("Shrinkhala"); 
		customer.setDob(LocalDate.of(1998,12,10));
		cuslist.add(customer);

		ad.add(new Address(1,"1234","churamanpur","LKO","varanasi","UP",221108,cuslist));
		customer.setAddress(ad);*/
		
		//when(cs.updateCustomer(customer)).thenReturn(customer.getName());
		
		
	}


	@Test
	public void testcreateCustomer() { //add customer
		Customer c2=new Customer(1,"mammu@gmail.com","M mamatha","123456",null,"9522331100",LocalDate.of(1998, 12, 12));
		when(cus.createCustomer(customerDto)).thenReturn(c2);  //
		 Customer createcustomer=cus.createCustomer(customerDto);
		 assertEquals(c2,createcustomer);	
	}



	@Test
	public void testListCustomer() {			//get all customer
		Mockito.when(cus.listCustomers()).thenReturn(Arrays.asList(customer));
		assertEquals(Arrays.asList(customer),customercontroller.ListAllCustomer());
		Mockito.verify(cus).listCustomers();
	}



	@Test
	public void testGetCustomerById() {   //get customer by id

		Mockito.when(cus.getCustomerById(101)).thenReturn(customer);
		assertEquals(customer,customercontroller.getCustomerById(101));
		Mockito.verify(cus).getCustomerById(101);
	}



	@Test
	public void testUpdateCustomer() {		//Update customer
		 Customer c1=new Customer(1,"mammu@gmail.com","M mamatha","123456",null,"9522331100",LocalDate.of(1998, 12, 12));
		 when(cus.updateCustomer(customerDto)).thenReturn(c1);
		 Customer update=cus.updateCustomer(customerDto);
		 assertEquals(c1,update);	 
	}



	@Test
	public void testDeleteCustomer() {			//delete customer by id
		Customer c1=new Customer(1,"mammu@gmail.com","M mamatha","123456",null,"9522331100",LocalDate.of(1998, 12, 12));
		when(cus.deleteCustomer(c1.getCustomerId())).thenReturn("REMOVED");
		String status = cus.deleteCustomer(1);
		assertEquals("REMOVED",status);
		
	}
} 