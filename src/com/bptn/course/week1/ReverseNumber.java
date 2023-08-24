package com.bptn.course.week1;


import java.util.Scanner;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
	    
			Scanner sc = new Scanner(System.in);
			
			int inputNum;
			int remainder, revNumber = 0;
			
			System.out.println("Enter a number:");
			
			inputNum = sc.nextInt();
			
			while (inputNum >0) {

				remainder = inputNum%10;
				revNumber =(revNumber*10) + remainder;
				inputNum /=10;
				
			}
			
			System.out.println(revNumber);
			
			
			
			
			sc.close();

		
	    }
	
}
