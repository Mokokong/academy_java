package com.bptn.course.week2.wednesday.coding26;

public class Car extends Vehicle {

	   //instance variable 
	   String steeringWheel;

	   //add parameterized constructor- use super keyword to call parent constructor
	   Car (String color, String brand, String steeringWheel){
		   
		   super(color,brand);
		   this.steeringWheel = steeringWheel;
		   
		   
	   }
	   
	   public void print() { 
		   
		   super.print(); 
	   }
}