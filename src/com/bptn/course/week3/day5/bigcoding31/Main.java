package com.bptn.course.week3.day5.bigcoding31;


public class Main {
//Do not modify this code
	public static void main(String[] args) {
	    Store store = new Store();
	    try {
	        store.purchase("apple",11);
	        System.out.println("Purchase successful!");
	    } catch (OutOfStockException e) {
	        System.out.println(e.getMessage());
	    }
	}
}
