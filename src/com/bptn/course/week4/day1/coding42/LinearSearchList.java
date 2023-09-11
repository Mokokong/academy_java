package com.bptn.course.week4.day1.coding42;

import java.util.ArrayList;
import java.util.List;


public class LinearSearchList {

  // linearSearch() method that takes in a List and an integer target as parameters
  public static boolean linearSearch(List<Integer> list, int target) {
    // Iterate over all elements in the List using for-each loop
    for (int value: list) {
      // Check if the current value is equal to the target
      if (value == target) {
        // If so, return true
        return true;
      }
    }
    // If the target was not found, return false
   return false;
  }

 
  public static void main(String[] args) {
    // Create a ArrayList of integers and populate integer values
    List<Integer> numbers = new ArrayList<>();
   

    // Define the target to search for
   
    numbers.add(3);
    numbers.add(6);
    numbers.add(2);
    numbers.add(9);
    numbers.add(11);

    // Call the linearSearch method with the list and target as arguments
    //Store the result in variable of type boolean
    boolean result = linearSearch(numbers, 6);
    
    // Check the result and print the appropriate message
    if (result) {
    	System.out.println("Target found in the List.");
       
    } else {
    	
    	System.out.println("Target not found in the List.");
       
    }
  }
}
