package com.bptn.course.week1;


public class ArrayFindSmallest {

	   /** @return index of the last number smaller than target */
	   public static int getIndexOfLastElementSmallerThanTarget(int[ ] values, int target) {
	      for (int index = values.length - 1; index >= 0; index--) {
	         if (values[index] < target)
	             return index;
	      }
	      return -1;
	   }

	   /** Add a method called getIndexOfLastElementGreaterThanTarget
	       @param int array
	       @param int target
	       @return index of the last number greater than target
	   */


	   /** @return index of the last number smaller than target */
	   public static int getIndexOfLastElementGreaterThanTarget(int[ ] values, int target) {
	      for (int index = values.length - 1; index >= 0; index--) {
	         if (values[index] > target)
	             return index;
	      }
	      return -1;
	   }


	   public static void main (String[] args) {
	      int[] theArray = {-30, -5, 8, 23, 46};
	      int[ ] values = {-20, -15, 2, 8, 16, 33};
	      
	      System.out.println("Last index of element smaller than 50: " + getIndexOfLastElementSmallerThanTarget(theArray, 50));
	      System.out.println("Last index of element smaller than 30: " + getIndexOfLastElementSmallerThanTarget(theArray, 30));
	      System.out.println("Last index of element smaller than 10: " + getIndexOfLastElementSmallerThanTarget(theArray, 10));
	      System.out.println("Last index of element smaller than 0: " + getIndexOfLastElementSmallerThanTarget(theArray,0));
	      System.out.println("Last index of element smaller than -20: " + getIndexOfLastElementSmallerThanTarget(theArray,-20));
	      System.out.println("Last index of element smaller than -30: " + getIndexOfLastElementSmallerThanTarget(theArray,-30));

	      
	      
	      // Call the method you create here and print it in the console.
	      // To pass the test case please use target value as 10
	      
	      System.out.println("Last index of element greater than 10: " + getIndexOfLastElementGreaterThanTarget(theArray,10));
	   
	   
	      System.out.println("Last index of element smaller than -13: " + getIndexOfLastElementSmallerThanTarget(values,-13));
	      System.out.println("Last index of element smaller than 7: " + getIndexOfLastElementSmallerThanTarget(values,7));

	   
	   }
	}
