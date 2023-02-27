package com.exception;

//child class of exception
public class PositiveNumException extends Exception {
	private String message;

	public PositiveNumException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
