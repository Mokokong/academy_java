package com.bptn.course.week1;

public class StepsToZero {
    public static int numberOfSteps(int num) {
        int steps = 0;

        // Check num constraints 0 <= num <= 106
        
        if (num > 0 && num <=106) {
		
        	//iterate until num = 0
            
            while (num > 0) {
            	
            	if (num%2 == 0) {
            		
					num /= 2;
				} else {

					num -= 1;
				}
            	
            	steps++;
            	
            }
        	
		}
        
        

        return steps;
    }

    // Do not modify the code below. You can use that for sanity check. 
    public static void main(String[] args) {
        int num = 123;
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
    }
}