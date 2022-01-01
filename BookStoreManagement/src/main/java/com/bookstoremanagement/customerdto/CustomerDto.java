package com.bookstoremanagement.customerdto;

import java.time.LocalDate;

import com.bookstoremanagement.entities.Address;
import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerDto {
	private int customerId;
	private String email;
	private String fullName;
	private String password;
	private Address address;
	private String mobileNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate registerOn;
	
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
	public void setRegisterOn(LocalDate registerOn) {
		this.registerOn = registerOn;
	}
	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", email=" + email + ", fullName=" + fullName + ", password="
				+ password + ", address=" + address + ", mobileNumber=" + mobileNumber + ", registerOn=" + registerOn
				+ "]";
	}
	public CustomerDto(int customerId, String email, String fullName, String password, Address address,
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
	public CustomerDto() {
		// TODO Auto-generated constructor stub
	}
}
