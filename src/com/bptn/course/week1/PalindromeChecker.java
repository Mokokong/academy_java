package com.bptn.course.week1;


import java.util.Scanner;

public class PalindromeChecker {

   public static void main(String[] args) {
       System.out.println("Enter the string to check for palindrome: ");
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       String reverseInput = "";

       
       // clean up input: remove spaces and capitalizations
       
       String cleanInput = input.replaceAll("\\s", "");
       cleanInput = cleanInput.toLowerCase();
       
       // reverse cleaned input and store for comparison
       
      for (int i = 0; i < cleanInput.length(); i++) {
    	  
    	  int index = cleanInput.length()-i-1;
    	  
    	  reverseInput += cleanInput.charAt(index);
		
      }
      
      
      //System.out.println(reverseInput);

      //Check if reversed string is equal to cleaned input
       if (cleanInput.equals(reverseInput)) {

    	   System.out.println("Input string is palindrome");
       } else {

    	   System.out.println("Input string is not palindrome");
       }
       
	   //close scanner
      
       scanner.close();
  } 
}
