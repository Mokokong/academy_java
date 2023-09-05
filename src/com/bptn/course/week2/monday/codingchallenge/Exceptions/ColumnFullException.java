package com.bptn.course.week2.monday.codingchallenge.Exceptions;

public class ColumnFullException extends Exception {

	private String message;

	public ColumnFullException(String message) {
		super(message);
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
	
}


