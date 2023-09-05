package com.bptn.course.week3.day2.forEachLoop;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
        for (Integer element :nums) {
            values.add(element);
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}
