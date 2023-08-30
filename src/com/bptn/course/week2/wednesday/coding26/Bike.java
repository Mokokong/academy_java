package com.bptn.course.week2.wednesday.coding26;

public class Bike extends Vehicle {

	   //Declare an instance variable- String bikeHandle
	   String bikeHandle;
	   

	   //add parameterized constructor- use super keyword to call parent constructor
		Bike (String color, String brand, String bikeHandle){
				   
				   super(color,brand);
				   this.bikeHandle = bikeHandle;
				   
				   
		}
		
		public void print() { 
			   
			   super.print(); 
		}
	
}