package com.boot.spring.exception;

public class BookNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2179853578764313293L;

	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
