package com.bptn.course.week4.day3.codingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Main {

    public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // sort array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
    	

    	ArrayList<Integer> arrayLeft = new ArrayList<>();
    	ArrayList<Integer> arrayRight = new ArrayList<>();
    	ArrayList<Integer> arraysorted = new ArrayList<>();
    	
    	// split  arr[] at middle
//    	for (int i = 0; i < arr.length; i++) {
//			
//    		if (i<m+1) {
//    			arrayLeft.add(arr[i]);
//				
//			}
//    		else
//    		{
//    			arrayRight.add(arr[i]);
//    		}
//			
//		}
    	
    	for (int i = l; i < m+1; i++) {
    		arrayLeft.add(arr[i]);
		}
    	
    	
    	for (int i = m+1; i < r; i++) {
    		arrayRight.add(arr[i]);
		}
    	
    	System.out.println("Passed info:\n");
    	
    	System.out.println(Arrays.toString(arr));
    	System.out.println("l :"+l +" m :" + m + " r :" + r );
    	
    	System.out.println("Left array:\n");
    	
    	System.out.println(arrayLeft);
    	
    	System.out.println("Right array:\n");
    	
    	System.out.println(arrayRight);
    	
    	// begin merge
    	// both arrays have elements
//    	while(!arrayLeft.isEmpty() && !arrayRight.isEmpty()) {
//    		
//    		if (arrayLeft.get(0)>arrayRight.get(0)) {
//    			
//    			// add [0] of right array to end of sorted array while removing it from right array
//    			arraysorted.add(arrayRight.remove(0));
//				
//			} else {
//				// add [0] of left array to end of sorted array while removing it from right array
//				arraysorted.add(arrayLeft.remove(0));
//
//			}
//    	}//end of while
    	
    	
    	// at this point either arrayLeft or arrayRight is empty
    	
//    	while (!arrayLeft.isEmpty()) {
//    		
//    		arraysorted.add(arrayLeft.remove(0));
//		}
//        
//    	
//    	
//    	while (!arrayRight.isEmpty()) {
//    		
//    		arraysorted.add(arrayRight.remove(0));
//		}
//    	
//    	
//    	System.out.println("Sorted array:\n");
//    	
//    	System.out.println(arraysorted);
        
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    static void mergeSort(int arr[], int l, int r) {
       // Add code here
    	if (l<r) {
    		
    		int mid = l + (r-l)/2;
    		mergeSort(arr, l, mid);
    		mergeSort(arr, mid+1, r);
    		
    		
    		merge(arr, l, mid, r);
    	}
    }
}
