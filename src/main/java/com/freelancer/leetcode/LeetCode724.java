package com.freelancer.leetcode;

public class LeetCode724 {

	public int pivotIndex(int[] nums) {
		int total = 0;
        int halfTotal = 0;
        for (int item: nums) {
            total += item;
        }
        for (int i = 0; i < nums.length; i++) {
            if (halfTotal * 2 == total - nums[i]) {
                return i;
            }
            halfTotal += nums[i];
        }
        return -1;
	}
}
