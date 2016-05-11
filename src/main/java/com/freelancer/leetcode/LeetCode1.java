package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode1 {
    
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int index1 = 0; index1 <= nums.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 <= nums.length - 1; index2++) {
                if (nums[index1] + nums[index2] == target) {
                    result[0] = index1 + 1;
                    result[1] = index2 + 1;
                }
            }
        }
        return result;
    }
}
