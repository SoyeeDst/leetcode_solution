package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode31 {

    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return;
        }
        for (int index = length - 1; index > 0; index--) {
            if (nums[index] <= nums[index - 1]) {
                continue;
            } else {
                // Find descending order
                int newLeader = electOneLeader(nums, index, nums[index - 1]);
                int temp = nums[index - 1];
                nums[index - 1] = nums[newLeader];
                nums[newLeader] = temp;

                // re-adjust the following numbers
                // reverse the sub-array
                reverseArray(nums, index, nums.length - 1);
                return;
            }
        }
        // We didn't obtain any descended subsection towards this array
        reverseArray(nums, 0, nums.length - 1);
    }

    private void reverseArray(int[] nums, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private int electOneLeader(int[] nums, int startIndex, int referenceValue) {
        int length = nums.length;
        int leastGreater = nums[startIndex];
        int leastOffset = startIndex;
        for (int index = startIndex; index <= length - 1; index++) {
            if (nums[index] > referenceValue && nums[index] <= leastGreater) {
                leastGreater = nums[index];
                leastOffset = index;
            }
        }
        return leastOffset;
    }


}
