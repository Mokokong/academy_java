package com.bptn.course.week1.bigcoding1;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		

		int target = 23;
		Scanner sc =new Scanner(System.in);
		int guess;
		
		
		while(true) 
		{
			
			
			System.out.println("\nEnter your guess: ");
			guess = sc.nextInt();
			
			
			if (guess >= 1 && guess<=100 ) {
				
				// check if matches guess
				
				if (guess<target) {
					
					System.out.println("Too low! Try again");
					
				} else if(guess>target)  {
					
					System.out.println("Too high! Try again");

				}
				else {
					// exit conditions met
					System.out.println("Congratulations! You guess the number correctly!");
					sc.close();
					break;
				}
				
				
				
				
			}else 
			{
				
				// out of bounds msg
				
				System.out.println("Please enter a number between 1 and 100");

			}//end of if-else
		}//end of while
		
		
	}// end of main

}
