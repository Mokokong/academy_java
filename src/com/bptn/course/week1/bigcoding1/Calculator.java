package com.bptn.course.week1.bigcoding1;

import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	
	/*Methods 
	 * */
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void optionMsgPrint() {
		
		System.out.println(""
				+ "/................Calculator Menu................/ \n"
				+ "\n"
				+ "Press 1 for addition \n"
				+ "\n"
				+ "Press 2 for subtraction \n"
				+ "\n"
				+ "Press 3 for multiplication \n"
				+ "\n"
				+ "Press 4 for division \n"
				+ "\n"
				+ "Press 5 to square a number \n"
				+ "\n"
				+ "Press 6 to find a square root \n"
				+ "\n"
				+ "Press 7 to find the reciprocal"
				);
	     
	   }

	public static void clearConsole()
	{  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  
	 
	
	
	// Processes 
	// addition
	public static void addition() {
		
		int val1 ;
		int val2 ;

		
		
		 System.out.println("Enter the first number:");
		 
		 val1 = sc.nextInt();
		
		 System.out.println("Enter the second number:");
		 
		 val2 = sc.nextInt();
		 

		 
		 System.out.println( "The sum of the numbers " + val1 + " and "+ val2 + " is = "+ (double)(val1+val2) );
		
	}
	
	// subtraction
	
	public static void subtraction() {
			
			int val1 ;
			int val2 ;
	
			System.out.println("Enter the first number:");
			 
			val1 = sc.nextInt();
			
			System.out.println("Enter the second number:");
			 
			val2 = sc.nextInt();
			
			System.out.println( "The difference of the numbers " + val1 + " and "+ val2 + " is = "+ (double)(val1-val2) );
			
		}
	
	
	// multiplication
	public static void multiplication() {
		
		int val1 ;
		int val2 ;

		System.out.println("Enter the first number:");
		 
		val1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		 
		val2 = sc.nextInt();
		
		
		System.out.println( "The product of the numbers " + (double)val1 + " and "+ (double)val2 + " is = "+ (double)(val1*val2) );
		
	}
	
	// division
		
	public static void division() {
			
			double val1 ;
			double val2 ;
	
			System.out.println("Enter the first number:");
			 
			val1 = sc.nextDouble();
			
			System.out.println("Enter the second number:");
			 
			val2 = sc.nextDouble();
			
            double quo = val1/val2;
            double mod = val1%val2;

			if (val2==0)
			{
				System.out.println( "The divisor cannot be zero ");
			} else 
			{
				System.out.println( "Dividing " + (double)val1 + " by "+ (double)val2 + " the quotient is "+ quo);
				System.out.println( "The remainder is "+ mod);

			}
			
		}
	
	// numbersquared
		
	public static void numbersquared() {
			
			int val1 ;
			
	
			System.out.println("Enter the number to find Square:");
			 
			val1 = sc.nextInt();
			
			
			
			
			System.out.println( "The Square of the number " + (double)val1 +  " is  = "+ (double)(val1*val1) );
			
		}
	
	// squareroot
	
	public static void squareroot() {
		
		double val1 ;
		

		System.out.println("Enter the number to find Square root:");
		 
		val1 = sc.nextDouble();
		
		
		
		
		System.out.println( "The Square root of the number " + val1 +  " is  = "+ (Math.sqrt(val1 )));
		
	}
	
	//reciprocal

	public static void reciprocal() {
		
		int val1 ;
		

		System.out.println("Enter the number to find Reciprocal :");
		 
		val1 = sc.nextInt();
		
		
		
		
		System.out.println( "The Reciprocal of the number " + (double)val1 +  " is  = "+ 1.0/(double)val1);
		
	}
	
	
	//===========================================
	public static void main(String[] args) {
		
		/*
		 * variables
		 * */

		
		int  stayOn =1;
		int choice;
		
	
		
		do 
		{
			
			//Print options menu
			
			optionMsgPrint();
			
			// Get user selection
			
			choice = sc.nextInt();
			
			switch (choice) {
			
			// Execute based on choice
			case 1:
				addition();
				break;
			
			case 2:
				subtraction();
				break;
			
			case 3:	
				multiplication() ;
				break;
			
			case 4 :
				division();
				break;
			
			case 5:
				numbersquared();
				break;
			
			case 6:
				squareroot();
				break;
			
			case 7:
				reciprocal();
				break;
			
			default:
				System.out.println("Invalid choice! Please make a valid choice.");
				break;
			}
			

			//check if user would like to continue
			System.out.println("\nTo continue calculation Press 1, else press any other number to exit");
			
			stayOn = sc.nextInt();
			
			
			
			
		} while (stayOn== 1);
		
		sc.close();
		
	}
	
	

}

