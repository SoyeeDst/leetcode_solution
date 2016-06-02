package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/2.
 */
public class LeetCode53 {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] maxArrays = new int[nums.length];
        maxArrays[0] = nums[0];
        int max = maxArrays[0];
        int index = 1;
        do {
            maxArrays[index] = Math.max(maxArrays[index - 1] + nums[index], nums[index]);
            if (maxArrays[index] >= max) {
                max = maxArrays[index];
            }
            index++;
        } while (index < nums.length);
        return max;
    }
}
