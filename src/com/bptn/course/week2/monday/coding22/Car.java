package com.bptn.course.week2.monday.coding22;

class Car {

    
	private String color;
    private String brand;
    private int price;


    public Car() {
       
    	this("NoColor","NoBrand",0);
    }

    public Car( String color, String brand, int price) {
    
    		this.color = color;
        	this.brand = brand;
        	this.price = price;

    }
	
	void printCarDetails() {
	    this.print();
	}

	private void print() {
		 System.out.println("Car{" +
	               "color='" + color + '\'' +
	               ", brand='" + brand + '\'' +
	               ", price=" + price +
	               '}');

	    
	}
}
