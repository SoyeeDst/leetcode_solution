package com.freelancer.leetcode;

/**
 * Created by Soyee.Deng on 2016/5/11.
 */
public class LeetCode34 {

    public int[] searchRange(int[] nums, int target) {
    int pos[] = new int[] { -1, -1 };
    if (nums == null || nums.length == 0) {
        return pos;
    }

    if (nums.length == 1 && nums[0] != target) {
        return pos;
    }

    if (target < nums[0] || target > nums[nums.length - 1]) {
        return pos;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else {
            // Spread to the around places
            int posBakup = mid;
            while (mid - 1 >= 0 && nums[mid - 1] == target) {
                mid = mid - 1;
            }
            pos[0] = mid;
            mid = posBakup;
            while (mid + 1 <= nums.length - 1 && nums[mid + 1] == target) {
                mid = mid + 1;
            }
            pos[1] = mid;
            return pos;
        }
    }

    return pos;
}
}
