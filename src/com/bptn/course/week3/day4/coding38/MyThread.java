package com.bptn.course.week3.day4.coding38;

public class MyThread extends Thread{

    int limitToStop;

    // Create a constructor to initialize the above instance variable
    public MyThread(int limitToStop) {
    	
    	this.limitToStop =limitToStop;
    	
    }

    // Override the run() method here.
    
    @Override
    public void run() {
    	
    	for (int i = 0; i < limitToStop; i++) {
			
    		if (i%2==1) {
    			System.out.println(i);
    			
    			
    			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
    }

}