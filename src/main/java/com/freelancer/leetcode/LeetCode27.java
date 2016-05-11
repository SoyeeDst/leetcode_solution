package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode27 {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        // If nums length is greater or equals with 2
        int index = 0;
        int differentPosition = 0;
        for (index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[differentPosition++] = nums[index];
            }
        }
        return differentPosition;
    }

}
