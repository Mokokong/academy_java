package com.bptn.course.week2.wednesday.superTest;


public class Derived extends Base {
   public void methodOne() {
      super.methodOne();
      System.out.print("C");
   }

   public void methodTwo() {
     super.methodTwo();
     System.out.print("D");
   }
   
   
   public static void main(String[] args) {
       Base b = new Derived();
       b.methodOne();
   }

   
}