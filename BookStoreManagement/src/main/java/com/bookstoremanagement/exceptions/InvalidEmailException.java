package com.bookstoremanagement.exceptions;

public class InvalidEmailException extends  RuntimeException {
	public  InvalidEmailException(String msg) {
		super(msg);

	}
}
