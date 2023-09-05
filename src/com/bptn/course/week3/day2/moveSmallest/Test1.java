package com.bptn.course.week3.day2.moveSmallest;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
    public static void moveSmallest(ArrayList<Integer> list) {
        int smallestIndex = 0;
        for (int i=0;i < list.size();i++) {
            if (list.get(i)<list.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        //move smallest to front

        Integer value = list.get(smallestIndex);
        list.remove(smallestIndex);
        list.add(0,value);
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result:\t\t " + values);
    }
}
