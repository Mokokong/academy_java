package com.bptn.course.week1;

public class BatteryTest {
    public static void main(String[] args) {
        int battery = 50;

        // it prints “Plug in your phone!” if the battery is below 50, “Unplug your phone!” if it is 100, and “All okay!” otherwise.       
        if (battery ==100) {
       	 System.out.println("Plug in your phone!");
			
		} else if (battery < 50) {
			
			 System.out.println("Unplug your phone!");

		}else {
			 System.out.println("All okay!");
		}
        
       
        
        
    }
}