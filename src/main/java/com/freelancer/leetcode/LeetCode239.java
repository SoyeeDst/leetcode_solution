package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soyee on 2017/1/8.
 */
public class LeetCode239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }

        int length = nums.length;
        Integer[][] res = new Integer[length][length];
        int idx = 0;
        // populate the matrix
        while (idx <= length - k) {
            populateMatrix(nums, res, idx, idx + k - 1);
            idx++;
        }

        int[] numList = new int[length - k + 1];
        for (int resIdx = 0; resIdx <= length - k; resIdx++) {
            numList[resIdx] = res[resIdx][resIdx + k - 1];
        }
        return numList;
    }

    private static void populateMatrix(int[] nums, Integer[][] res, int startOff, int endOff) {
        res[endOff][endOff] = nums[endOff];
        int idx = endOff - 1;
        while (idx >= startOff) {
            if (res[idx][endOff] == null) {
                res[idx][endOff] = Math.max(nums[idx], res[idx + 1][endOff]);
            }
            idx--;
        }
    }
}
