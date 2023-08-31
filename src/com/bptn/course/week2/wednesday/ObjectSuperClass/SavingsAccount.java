package com.bptn.course.week2.wednesday.ObjectSuperClass;

public class SavingsAccount extends Account {
	   

    //declare instance variable
	private double interest;

    //add parameterized constructor - use super keyword to call parent constructor
	public SavingsAccount(String name,double balance, double interest) {
		
		super(name,balance);
		this.interest =interest;
	}

    //override the toString method
	
	public String toString() {
    	
    	return super.toString() + "," + interest;
    	
    }

    //override the equals method
	
	public boolean equals(Object other) {
    	
    	SavingsAccount otherObj = (SavingsAccount)other;
    	return super.equals(otherObj)&&
    			this.interest==otherObj.interest;
    }

    
}