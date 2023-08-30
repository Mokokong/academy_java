package com.bptn.course.week2.wednesday.coding26;

public class Vehicle {

    //declare instance variables- colour and brand
	String colour;
	String brand;


    public Vehicle() {
        this("Black", "Tesla");
    }

    // add parameterized constructor 
    public Vehicle (String color, String brand) {
    	
    	this.colour= color;
    	this.brand = brand;
    }
    
    public void print() {
    	System.out.println(this.colour + " " + this.brand);
    	
    }
    
    
    
    //Do not modify this code as we have parameters that pass the test case
    public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
//        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
//        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);
        car.print();
        bike.print();
    }

}
