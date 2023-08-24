package com.bptn.course.week1;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		
		
		
		
		
		
//		Import the scanner library.

//		Declare an integer variable.
		int val1;
		
//		Create a Scanner object to take input from a user.
		Scanner sc = new Scanner(System.in);
		
//		Print a prompt for the user to enter a number.
		System.out.println("Enter a number: ");
		
//		Receive the number from the user using the appropriate scanner method.
		val1 = sc.nextInt();
		
//		Create the conditions to check if the number is positive or negative
//		Print the output
		
		if (val1 >= 0) {
			
			System.out.println("The number is positive");
			
		} else {
			
			System.out.println("The number is negative");

		}


		sc.close();

	}

}
