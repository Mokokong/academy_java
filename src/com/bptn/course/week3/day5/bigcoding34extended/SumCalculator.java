package com.bptn.course.week3.day5.bigcoding34extended;

class SumCalculator extends Thread {
    
    // The start point of the range 
    private int start;

    // The end point of the range 
    private int end;
    
    // The sum of the numbers in the range
    private int sum;
    
    private long executionTime;

    // Constructor to set the start and end points of the range
    public SumCalculator(int start, int end) {
         //Initialize the instance variables start and end
    	this.start=start;
    	this.end = end;
    	
        // Initialize the sum to 0
        sum = 0;
    }

    // Override the run method to calculate the sum of the numbers in the range
    public void run() {
        // Iterate through the numbers in the range and add them to the sum
    	
    	long start1 = System.nanoTime();
    	for (int i = start; i <= end; i++) {
			sum +=i;
			
		}
    	long end1 = System.nanoTime(); 
    	
    	 executionTime=(end1-start1);
    }

    // Method to get the sum of the numbers in the range
    
    public int getSum() {
        return sum;
    }
    
    public long getExecutionTime() {
    	return executionTime;
    }
}