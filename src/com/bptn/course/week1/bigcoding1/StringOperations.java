package com.bptn.course.week1.bigcoding1;
/*
 * Had to comment out do while for unit tests to run
 * only use sc.nextline() after get non string input to clean buffer
 * 
 * 
 * */



import java.util.Scanner;


public class StringOperations {
	
	/*Methods 
	 * */
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void optionMsgPrint() {
		
		System.out.println(""
				+ "/................String Menu................/ \n"
				+ "\n"
				+ "Press 1 for Palindrome Check \n"
				+ "\n"
				+ "Press 2 for Reverse String \n"
				+ "\n"
				+ "Press 3 for Concatenate two Strings \n"
				+ "\n"
				+ "Press 4 for String Comparison \n"
				+ "\n"
				+ "Press 5 to Calculate the Length of String \n"
				+ "\n"
				+ "Enter the option:"
				
				);
	     
	   }

	 
	
	// Processes 
	
	// Palindrome check
	public static void palindrome() {
		
		
		String iStr;
//		sc.nextLine();
		
		 System.out.println("\nPalindrome Check");
		 
		 System.out.println("Enter a string:");
		
		 iStr = sc.nextLine();
	
		 
		 String reverseInput = "";

	       
	       // clean up input: remove spaces and capitalizations
	       
	       String cleanInput = iStr.replaceAll("\\s", "");
	       cleanInput = cleanInput.toLowerCase();
	       
	       // reverse cleaned input and store for comparison
	       
	      for (int i = 0; i < cleanInput.length(); i++) {
	    	  
	    	  int index = cleanInput.length()-i-1;
	    	  
	    	  reverseInput += cleanInput.charAt(index);
			
	      }
	      
	      
	     

	      //Check if reversed string is equal to cleaned input
	       if (cleanInput.equals(reverseInput)) {

	    	   System.out.println(iStr + " is a palindrome");
	       } else {

	    	   System.out.println(iStr + " is not a palindrome");
	       }
	       
		 
		
	}//end of palindrome
	
	// reverse string 
	
	public static void stringReverse() {
			
		String iStr;

		
		System.out.println("\nReverse String");
		 
		System.out.println("Enter a string:");
		 
		 
		iStr = sc.nextLine();
		 
		
		String reverseInput = "";
	       
		for (int i = 0; i < iStr.length(); i++) {

	    	  reverseInput += iStr.charAt(iStr.length()-i-1);
			
	     }
	      

	     System.out.println(reverseInput);
	       
	}// end of reverseString()
	
	
	// String concatenate
	public static void concatenate() {
		
		String iStr1,iStr2 ;
		
//		// comment this buffer clean out on CR 
//		sc.nextLine();
		
		System.out.println("Enter First string:");
		 
		iStr1 = sc.nextLine();
		
		System.out.println("Enter Second string:");
		 
		iStr2 = sc.nextLine();
		
		System.out.println(iStr1 + iStr2);
		
		
	}// end of concatenate()
	
	
	//String comparison
	
	public static void stringComparison() {
		
		String iStr,iStr2;

		
		System.out.println("\nString Comparison");
		 
		System.out.println("Enter First string:");
		 
		 
		iStr = sc.nextLine();
		 
		System.out.println("Enter Second string:");
		 
		 
		iStr2 = sc.nextLine();
		 
		if (iStr.equals(iStr2)) {
			
			System.out.println("The entered strings are equal");
			
		} else {
			
			System.out.println("The entered strings are not equal");

		}
		
		
	}// end of stringComparison	
		
	public static void strLength() {
			
			String iStr;
	
			 System.out.println("\nLength of a string");
			 
			 System.out.println("Enter a string:");
			 
			 iStr = sc.nextLine();
			 
			 System.out.println( "The length of the entered string is: " + iStr.length() );
		      
			 
			
		}//end of StrLength
	
	//===========================================
	public static void main(String[] args) {
		
		/*
		 * variables
		 * */

		
//		String stayOn ="true";
//		Boolean stayOn =true;
		int choice;
		
	
		
//		do 
//		{
			
			//Print options menu
			
			optionMsgPrint();
			
			// Get user selection
			
			choice = sc.nextInt();
			sc.nextLine();
			
			
			switch (choice) {
			
			// Execute based on choice
			case 1:
				palindrome();
				break;
			
			case 2:
				stringReverse();
				break;
			
			case 3:	
				concatenate();
				break;
			
			case 4 :
				stringComparison();
				break;
			
			case 5:
				strLength();
				break;
			
			
			default:
				System.out.println("Invalid choice! Please make a valid choice.");
				break;
			}
			

			//check if user would like to continue
//			System.out.println("\nTo continue string operations enter \"true\"");
			
			
			
//			stayOn = sc.nextLine();
//			sc.nextLine();
			
//			if (!stayOn.equals("true")) {
//				
//				break;
//				
//			}
			
//			if (!(stayOn.equals("true"))) {
//							
//				break;
//							
//			}
						
			
//		} while (true); // end of do while
		
		sc.close();
		
	}
	
	

}

