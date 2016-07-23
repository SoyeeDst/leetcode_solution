package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/19.
 */
public class LeetCode136 {

    public int singleNumber(int[] nums) {
        int r = nums[0];
        for (int i = 1; i < nums.length; i++) {
             r = r ^ nums[i];
        }
        return r;
    }
}
