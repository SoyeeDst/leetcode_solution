package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/9/7.
 */
public class LeetCode152 {

    public int maxProduct(int[] nums) {
       if (nums == null && nums.length == 0) {
           return 0;
       }
       if (nums.length == 1) {
           return nums[0];
       }
       int max = nums[0];
       // n ^ 2
       for (int idx = 1; idx < nums.length; idx++) {
           if (nums[idx] == 1) {
               if (max < 1) {
                   max = 1;
               }
               continue;
           }
           int maxTemp = nums[idx];
           int product = maxTemp;
           int idx2 = idx - 1;
           while (idx2 >= 0) {
               product = product * nums[idx2];
               if (product >= maxTemp) {
                   maxTemp = product;
               }
               idx2--;
           }
           if (maxTemp > max) {
               max = maxTemp;
           }
       }
       return max;
    }
}
