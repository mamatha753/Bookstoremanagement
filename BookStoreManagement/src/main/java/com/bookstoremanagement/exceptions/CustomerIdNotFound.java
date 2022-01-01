package com.bookstoremanagement.exceptions;

public class CustomerIdNotFound extends  RuntimeException {
	public CustomerIdNotFound(String msg) {
		super(msg);
	}
}
