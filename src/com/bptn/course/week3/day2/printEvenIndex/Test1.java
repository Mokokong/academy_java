package com.bptn.course.week3.day2.printEvenIndex;


import java.util.*;

public class Test1 {
    
    public static void printEvenIndex(ArrayList<Integer> list) {
        for (int i = 0; i< list.size();i++) {
            if (i % 2 == 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 1, 7, -2, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenIndex(values);
    }
}
