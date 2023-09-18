package com.bptn.course.week4.day5.bigcoding45;

//import the required classes
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;


public class TwoSum {
	// Method that returns the indices of two elements in the nums array that add up
	// to the target value
	public int[] twoSum(int[] nums, int target) {
		// Initialize a HashMap to store the value of each element in the nums array and its index
		Map<Integer, Integer> map = new HashMap<>();
		

		
		List<Integer> numS = Arrays.stream(nums) 
							.boxed()               
							.collect(Collectors.toList()); 

		// Loop through each element in the nums array
		for (int num: nums) {
			// Calculate the complement, which is the difference between the target and the
			// current element
			int complement = target - num;

			// Check if the complement is found in the HashMap
			if (map.containsKey(complement)) {
				/* If the complement is found, return the index of the complement and the current index because these two indices correspond to two elements that add up to the target*/


				return new int[] {numS.indexOf(complement),numS.indexOf(num)};
			}
			// If the complement is not found, put the current element and its index into the HashMap
			map.put(num,numS.indexOf(num));
		}

		// If no two sum solution is found, throw an IllegalArgumentException
		throw new IllegalArgumentException("No two sum solution");
	}
  // Do not modify the code below:
	// Main method to test the twoSum method
	public static void main(String[] args) {
		// Example array of integers
		int[] nums = { 2, 7, 11, 15 };

		// Example target value
		int target = 9;

		// Create a TwoSum object
		TwoSum solution = new TwoSum();

		// Call the twoSum method to get the indices of the two elements that add up to
		// the target value
		int[] indices = solution.twoSum(nums, target);

		// Print the result
		System.out.println("The indices are: " + indices[0] + " and " + indices[1]);
	}
}
