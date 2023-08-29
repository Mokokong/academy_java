package com.bptn.course.week2.monday.coding21;

class Car {

    private String color;
    private String brand;
    private int price;


    public Car(String color, String brand, int price) {
       
    	this.color = color;
    	this.brand = brand;
    	this.price = price;

    }


    void printCarDetails() {

    	this.print();
   }
    

   
    void print(){
        System.out.println("Car{" +
               "color='" + color + '\'' +
               ", brand='" + brand + '\'' +
               ", price=" + price +
               '}');
    }


}