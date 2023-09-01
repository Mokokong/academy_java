package com.bptn.course.week2.thursday.coding29.exceptionpropagation;

public class Main {
	
	public static void method1(){
		
		int[] arr = {1,2,3,4};
		
		arr[4] = 20;
		
	}
	
	public static void method2() {
		
		
		
		
		try {
			method1();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
		}
	}
	
	
	public static void main(String args[]) {
        Main exceptionSolutionObject = new Main();
        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
    }
	
	

}
