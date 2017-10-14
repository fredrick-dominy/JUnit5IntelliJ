package com.javatests;

import java.util.Arrays;

public class SumWOHighLow {
    public static int sum(int[] nums){
        int subtotal = 0;
        if(nums == null || nums.length < 3 ) {
            return 0;
        }

        Arrays.sort(nums);
        for (int num : nums) {
            subtotal += num;
        }
        System.out.println("subtotal = " + subtotal);
        return subtotal - nums[0] - nums[nums.length - 1];
    }
}
