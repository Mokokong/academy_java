package com.bptn.course.week1;

public class VariableOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ;
		int b;
		
		a = 28;
		b = 10;
		
		int sum = a+b;
		int diff = a-b;
		int prod = a*b;
		double quo = (double)a/b;
		
		System.out.println("Int a :" + a);
		System.out.println("Int b :" + b);
		System.out.println("Sum   :" + sum);
		System.out.println("Diff  :" + diff);
		System.out.println("Prod  :" + prod);
		System.out.println("Quo   :" + quo);
		
		a = 36;
		b = 8;
		
		System.out.println("Updated Int a :" + a);
		System.out.println("Updated Int b :" + b);
		
		char test1 = 'a';
		String test2 = "Choose";
		
		System.out.println("Char test1   :" + test1);
		System.out.println("String test2 :" + test2);
	}

}
