package com.freelancer.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Soyee on 2016/5/25.
 */
public class LeetCode41 {

    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                if (nums[index] < min) {
                    min = nums[index];
                }
            }
        }

        if (min <= 0) {
            return 1;
        }

        // Skip all some increments values and lift up the minimum values as well.
        int index = 0;
        int minMax = min;
        Set<Integer> ignoredSet = new HashSet<>();
        do {
            if (nums[index] > min) {
                // increment by one
                if (nums[index] - minMax == 1) {
                    minMax = nums[index];
                } else {
                    ignoredSet.add(nums[index]);
                }

            }
            index++;
        } while (index < nums.length);

        if (min >= 2) {
            return 1;
        }
        if (ignoredSet.size() == 0) {
            return minMax + 1;
        }

        while(true) {
            if (!ignoredSet.contains(minMax + 1)) {
                return minMax + 1;
            }
            minMax++;
        }
    }
}
