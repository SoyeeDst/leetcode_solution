package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int length = nums.length;
        int maxNum = 1;
        // Iterate and squeeze the array accordingly
        int uniqueNumerIndex = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                maxNum = maxNum + 1;
                uniqueNumerIndex = uniqueNumerIndex + 1;
                nums[uniqueNumerIndex] = nums[i];
            }
        }
        return maxNum;
    }
}
