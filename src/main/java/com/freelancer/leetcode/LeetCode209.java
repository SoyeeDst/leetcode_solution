package com.freelancer.leetcode;

import java.util.Arrays;

public class LeetCode209 {

	public int minSubArrayLen(int s, int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums);
		int len = nums.length;
		int count = 0;
		int tempsum = 0;
		int idx = len - 1;

		// Greedy checking against the latest sum every time
		do {
			count++;
			tempsum = tempsum + nums[idx];
			idx--;
		} while (tempsum < s && idx >= 0);

		if (tempsum >= s) {
			return count;
		}

		return 0;
	}

}
