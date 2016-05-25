package com.freelancer.leetcode;

import java.util.BitSet;
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

        if (min <= 0 || min >= 2) {
            return 1;
        }

        BitSet bitSet = new BitSet();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                bitSet.set(nums[index]);
            }
        }
        return bitSet.nextClearBit(1);
    }
}
