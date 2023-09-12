package com.bptn.course.week4.day1.coding43;

public class Student 
{

    //Define instance variables name and rollNumber
	private int rollNumber;
	private String name;

    //Create parameterized constructor
	public Student (int rollNumber, String name) {
		
		this.rollNumber = rollNumber;
		this.name = name;
	}

	
     

    // Create getter method for roll number variable which returns rollNumber
    
    // Create getter method for name variable which returns name
	
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}
   
}
