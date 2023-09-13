package com.bptn.course.week4.day1.codingchallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public void Start(){
        
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;


        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println(result);

    }

    int binarySearch(int arr[], int key){
       // put your code here.

		
		int low = 0;
		int high = arr.length - 1;
		int middle;

		// Keep looping until the high pointer is greater than or equal to the low
		// pointer
		
		while (high >= low) {
			// Calculate the middle index
			
			middle = (low + high) / 2;

			
			
			// If the element at the middle index is equal to the key, return the index
			if (arr[middle] == key) {

				return middle;

			}

			// If the element at the middle index is less than the key, move the low pointer
			// to the middle + 1
			if (arr[middle] < key) {
				low = middle + 1;
			}

			// If the element at the middle index is greater than the key, move the high
			// pointer to the middle - 1

			if (arr[middle] > key) {
				high = middle - 1;
			}
			
			
		}

		// If the key is not found, return -1
		return -1;
    	
    	
    }
    
       public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }
}