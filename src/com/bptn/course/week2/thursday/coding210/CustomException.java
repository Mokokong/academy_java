package com.bptn.course.week2.thursday.coding210;

import java.util.Scanner;

public class CustomException {
	
	private static boolean validateFileExtension(String filename) throws FileExtensionException {
		if (filename.endsWith(".txt")) {
			
			return true;
		}
		
		else {
			
			throw new FileExtensionException("File doesn't have .txt extension");
		}
	}

    public static void main(String[] args) {
        // Write your code below.
    	
    	
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("Enter the file name with correct extension i.e. .txt ");
    	
    	String filename = sc.nextLine();
    	
    	
    	try {
    		
    		if (validateFileExtension(filename)) {
    			
    			System.out.println("Correct file name with extension .txt");
    		}
			
		} catch (FileExtensionException e) {
			System.out.println("Error: " + e.getMessage());
		}
    	
    	finally {
			sc.close();
		}
    	
    	
    }
}
