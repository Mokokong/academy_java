package com.bptn.course.week2.monday.codingchallenge.Exceptions;

public class MinimumDimensionException extends Exception {

	private String message;
	
	public MinimumDimensionException(String message) {
		super(message);
		this.message=message;
		
	}

	public String getMessage() {
		return message;
	}
	
	
}
