package com.bptn.course.week1.bigcoding1;

import java.util.Scanner;

public class PluralForm {
  public static void main(String[] args) {
	  
    Scanner inp = new Scanner(System.in);
    System.out.print("# in:");
    int amt = inp.nextInt();
    inp.nextLine(); //this line is necessary
    System.out.print("word:");
    String word = inp.nextLine();
    //leave the above unedited, write your code below:
    
    
    inp.close();
    // get last 2 chars of word
    String last2 = word.substring(word.length()-2);
    String temp = word;
//  System.out.println(last2);
//  System.out.println(last2.charAt(1));
//    
//    if (amt == 1) {
//    	
//    
//    	
//		
//	} else {
//		
//
//	   
//	}// end of ifelse
    
		    switch (last2.charAt(1)) {
			case 'y':
				
				switch (last2) {
					case "ay":
					case "oy":
					case "ey":
					case "uy":
						
						word +="s";
						
						break;
						
					default:
						word = word.substring(0,word.length()-1)+ "ies";
						break;
					}// endof switch(inner)1
				  
				break;
		
			default:
				
				switch (last2) {
					case "fe" :
						
						word = word.substring(0,word.length()-2)+ "ves";
						
						break;
						
					case "sh":
					case "ch":
						
						word += "es";
						break;
			
					case "us":
						
						word = word.substring(0,word.length()-2)+ "i";
						break;
						
					default:
						word += "s";
						break;
					}// endof switch(inner)2
			    
				break;
			
		}//end of outer switch
		

		if (amt==1) {
			
			// output plural
		    System.out.println(amt + " " + temp);
	    
			
		} else {
			
			// output plural
		    System.out.println(amt + " " + word);
	    

		}   
		    
		    
		
  }//endof main
}// endof class