package com.bookstoremanagement.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Customer implements Serializable {
	@Id
//	@Min(value=0,message="Id must be above 0")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
//	@NotEmpty(message = "Please enter a valid e-mail address")
	private String email;
//	@NotEmpty(message = " Name is mandatory")
	private String fullName;
//	@NotEmpty(message = "Please enter a valid password")
	private String password;
	
//	@NotEmpty(message = "MobileNumber is mandatory")
	private String mobileNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate registerOn;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	public  Customer()
	{
	}
	public int getCustomerId() {
		return customerId;
	}
	
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public LocalDate getRegisterOn() {
		return registerOn;
	}
	public void setRegisterOn(LocalDate i) {
		this.registerOn = i;
	}
	public Customer(int customerId, String email, String fullName, String password, Address address,
			String mobileNumber, LocalDate registerOn) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.registerOn = registerOn;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", fullName=" + fullName + ", password="
				+ password + ", address=" + address + ", mobileNumber=" + mobileNumber + ", registerOn=" + registerOn
				+ "]";
	}
	public void setAddress(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		
	}
	
}


