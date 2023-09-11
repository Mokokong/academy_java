package com.bptn.course.week3.day5.bigcoding34extended;

public class Main {

    public static void main(String[] args) {
        
        // Create two SumCalculator threads to calculate the sum of two different ranges
        SumCalculator sumCalculator1 = new SumCalculator(1, 10000);
        SumCalculator sumCalculator2 = new SumCalculator(51, 100);
        
        
        //extended
        
        SumCalculator sumCalculator3 = new SumCalculator(1, 2500);
        SumCalculator sumCalculator4 = new SumCalculator(2501, 5000);
        SumCalculator sumCalculator5 = new SumCalculator(5001, 7500);
        SumCalculator sumCalculator6 = new SumCalculator(7501, 10000);

        
        //extended 2
        SumCalculator sumCalculator7 = new SumCalculator(1, 5000);
        SumCalculator sumCalculator8 = new SumCalculator(5001, 10000);
        // Start both threads
      
//      sumCalculator2.start();
        
       sumCalculator1.start();
       
       sumCalculator7.start();
       sumCalculator8.start();
//
       sumCalculator3.start();
       sumCalculator4.start();
       sumCalculator5.start();
       sumCalculator6.start();
        try {
            // Wait for both threads to finish using join() method of each thread.
        	sumCalculator1.join();
//        	sumCalculator2.join();
        	
        	
        	sumCalculator3.join();
        	sumCalculator4.join();
        	sumCalculator5.join();
        	sumCalculator6.join();

        	sumCalculator7.join();
        	sumCalculator8.join();

        	
        } catch (InterruptedException e) {
            // Print the stack trace if an interruption occurs
            e.printStackTrace();
        }
        
        // Calculate the total sum by adding the sum of both ranges
        int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
        
        
        //1 thread
        // Print the total sum
        System.out.println("Total sum[1]: " + totalSum);
        
        //print total time
        System.out.println("Elapsed Time in nano seconds: "+ sumCalculator1.getExecutionTime());
        
       // 2 threads
//        
        int splitSum = sumCalculator7.getSum()
						+sumCalculator8.getSum();
        System.out.println("Total sum[2]: " + splitSum);

        long totalExecTime = sumCalculator7.getExecutionTime() 
					+ sumCalculator8.getExecutionTime();

        System.out.println("Elapsed Time in nano seconds: " + totalExecTime);
        
//        //4 threads
        int splitSum1 = sumCalculator3.getSum()
						+sumCalculator4.getSum()
						+sumCalculator5.getSum()
						+sumCalculator6.getSum();
        System.out.println("Total sum[4]: " + splitSum1);
        
		long totalExecTime1 = sumCalculator3.getExecutionTime() 
							+ sumCalculator4.getExecutionTime()
							+ sumCalculator5.getExecutionTime() 
							+ sumCalculator6.getExecutionTime();

		System.out.println("Elapsed Time in nano seconds: " + totalExecTime1);
    }
}
