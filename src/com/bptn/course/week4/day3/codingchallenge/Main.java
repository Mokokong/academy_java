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
    
    	int arrayLeftLen = m-l+1;
    	int arrayRightLen = r-m;
    	
    	//  subarrays 
    	int[] arrayLeft = new int[arrayLeftLen];
    	int[] arrayRight = new int[arrayRightLen];
    	
    	// fill out subarrays
    	
    	for (int i = 0; i < arrayLeftLen; i++) {
			arrayLeft[i] = arr[l+i];
			
		}

    	for (int i = 0; i < arrayRightLen; ++i) {
			arrayRight[i] = arr[m+1+i];
			
		}
    	
    	
    	// merge sub arrays
    	int i=0; //arrayLeft index
    	int j=0; //arrayRight index
    	int k=l; // mergeArray index starts @ l

    	// while both subs still have elements
    	while(i < arrayLeftLen && j < arrayRightLen ) {
    		
    		if (arrayLeft[i]<= arrayRight[j]) {
    			
    			arr[k] =arrayLeft[i];
    			i++;
				
			} else {
				
				arr[k] =arrayRight[j];
    			j++;

			}
    		k++;
    	}
    	
    	// while arrayLeft still has elements
    	while (i<arrayLeftLen) {
    		arr[k]= arrayLeft[i];
    		i++;
    		k++;
			
		}
    	
    	// while arrayRight still has elements
    	while (j<arrayRightLen) {
    		arr[k]= arrayRight[j];
    		j++;
    		k++;
			
		}
    	
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
