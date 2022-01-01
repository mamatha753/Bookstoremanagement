package com.bookstoremanagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookstoremanagement.customerdto.CustomerDto;
import com.bookstoremanagement.customermapper.CustomerMapper;
import com.bookstoremanagement.entities.Customer;
import com.bookstoremanagement.exceptions.CustomerIdNotFound;
import com.bookstoremanagement.repository.CustomerRepository;
import com.bookstoremanagement.service.CustomerServiceImpl;

//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
public class CustomerServiceImplTestCases {
		@InjectMocks
		CustomerServiceImpl csi;
		
		@Mock
		 Customer customer; 
		@Mock
		 Customer customer1;
		@Mock
		 CustomerRepository cur;
		

		@BeforeEach
		 public void startup() {
			 
			 MockitoAnnotations.initMocks(this);
			 
			 customer.setCustomerId(101);
			 customer.setFullName("Mamatha");
			 
			 customer1.setCustomerId(102);
			 customer1.setFullName("Mamatha1");
			 
			 
		 }
		@Test
	    void testCustomerById() {
	        when(cur.findById(101)).thenReturn(Optional.of(customer));
	        assertEquals(customer,csi.getCustomerById(101));
	        Mockito.verify(cur,times(1)).findById(101);
	    }
		
		@Test
	    void testCustomerIdNotFound() {
	        when(cur.findById(101)).thenReturn(Optional.ofNullable(null));
	        assertThrows(CustomerIdNotFound.class, ()->csi.getCustomerById(101));
		}
		@Test
		public void testcreateCustomer() { //add customer
			Mockito.when(cur.save(any(Customer.class))).thenReturn(customer);
			CustomerDto customerdto1=CustomerMapper.toCustomerDto(customer);
			Customer customerdto2=csi.createCustomer(customerdto1);
			assertEquals(customerdto1.getCustomerId(),customerdto2.getCustomerId());
			Mockito.verify(cur,times(1)).save(any(Customer.class));
			}
		

	
		@Test
		public void testListCustomer() {			//get all customer
			Mockito.when(cur.findAll()).thenReturn(Arrays.asList(customer));
			assertEquals(Arrays.asList(customer),csi.listCustomers());
			Mockito.verify(cur).findAll();
		}
//		@Test
//		 public void testdeleteCustomer() {
//				when(cur.deleteById(1)).thenReturn(Optional.of(customer));
//				assertEquals(customer,csi.deleteCustomer(1));
//				 Mockito.verify(cur,times(1)).deleteById(1);
//		}
		
//		}	
}
		
	

