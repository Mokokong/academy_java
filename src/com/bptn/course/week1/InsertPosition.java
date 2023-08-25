package com.bptn.course.week1;

class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        // Write your code here
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		if (nums[i]== target) {
    			
    			return i;
				
			}
		}
    	
    	//   in case target not found  	
    	int missed = 0;
		for (int i = 0; i < nums.length; i++) {
					
		    if (nums[i] > target) {
		    			
		    	return i;
						
			}
		}
    	
		return missed;
    }


    // Do not modify the code below
    public static void main(String args[]){
        int nums[] = {1, 3, 5, 7, 9} , target = 9;
        int nums1[] = {1, 3, 5, 6} , target1 = 3;
        int nums2[] = {1, 3, 5, 6, 7} , target2 = 7;
        
        
        

        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));
        
//        int target3 = 4;
//        System.out.println(searchInsert(nums2, target3));
        

    }
}