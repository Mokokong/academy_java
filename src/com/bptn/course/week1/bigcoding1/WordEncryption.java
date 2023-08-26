package com.bptn.course.week1.bigcoding1;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String word;
		String encryptedWord ="";
		int ascii;
		
		System.out.println("Enter String:");
		
		word = sc.nextLine();
		sc.close();
		for (int i = 0; i < word.length(); i++) {
			
			if (Character.isLetter(word.charAt(i))) 
			{
				
				ascii = (int)word.charAt(i);
//				System.out.println(ascii);
				ascii++;
//				System.out.println(ascii);
			
				// check if char is z or Z for loop around
		
				switch (ascii) {
				case 123:
					ascii = 97;
					break;

				case 91:
					ascii = 65;
				default:
					
					break;
				}
				
//				System.out.println((char)ascii);
				encryptedWord += (char)ascii;
				
			}else {
				
				encryptedWord += word.charAt(i);
			}// end of else
			
			
		}// end of for

		System.out.println(encryptedWord);
	}// end of main

}//end of class
