package com.bptn.course.week4.day1.jUnitBooks;

public class Book {
	
	private String title ;
	private double price;
	
	public Book(String title, double price) {
		
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public String getBookInfo () {
		
		return (this.title + "-"+ this.price);
	}
}// end of class
