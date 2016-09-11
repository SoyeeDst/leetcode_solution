package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/9/8.
 */
public class LeetCode154 {

    public int findMin(int[] nums) {
       if (nums == null || nums.length == 0) {
           return 0;
       }
       if (nums.length == 1) {
           return nums[0];
       }
       SlopeInfo firstSlopeInfo = nextSlope(nums);
       if (firstSlopeInfo.slopeEnd < nums.length - 1) {
           return Math.min(firstSlopeInfo.min, nums[firstSlopeInfo.slopeEnd + 1]);
       }
       return firstSlopeInfo.min;
    }

    // O(n)
    public SlopeInfo nextSlope(int[] nums) {
        SlopeInfo slopeInfo = new SlopeInfo(nums[0], nums.length);
        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] >= nums[idx - 1]) {
               continue;
            }
            slopeInfo.slopeEnd = idx - 1;
            return slopeInfo;
        }
        return slopeInfo;
    }

    private static class SlopeInfo {
        int slopeEnd;
        int min;

        public SlopeInfo(int min, int slopeEnd) {
            this.min = min;
            this.slopeEnd = slopeEnd;
        }
    }
}
