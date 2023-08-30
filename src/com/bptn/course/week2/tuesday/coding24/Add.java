package com.bptn.course.week2.tuesday.coding24;

public class Add {

	   // Create your code here:
	    public int add(int x,int y){

	        return x+y;
	    }


	    public int add(int x,int y, int z){

	        return x+y+z;
	    }


	    public double add(double a,double b){

	        return a + b;
	    }



	   // Do not modify the code below. The code below gives you the idea of how the different methods are called.
	   public static void main(String args[]) {
	       Add obj = new Add();
	       System.out.println(obj.add(12, 21));
	       System.out.println(obj.add(11, 23, 10));
	       System.out.println(obj.add(100.10, 200.5));
	   }
	}
