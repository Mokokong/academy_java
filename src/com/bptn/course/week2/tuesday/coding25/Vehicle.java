package com.bptn.course.week2.tuesday.coding25;

public class Vehicle {
	  
	  //Step 1a: Declare String color and String brand
	private String color;
	private String brand;

	  //Step 1b: Define a parameterized constructor with color and brand as parameters
	
	public Vehicle() {
		
		
		this("null","null");
	}
	
	
	
	public Vehicle(String color,String brand) {
		
		this.brand = brand;
		this.color = color;
	}

	  //Step 1c: Create a print() method as described in the above.
	
	public void print() {  
		   System.out.println(this.color + " " + this.brand); 
	}

}