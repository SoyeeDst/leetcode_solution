package com.freelancer.leetcode;

public class LeetCode198 {

	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		Integer max[] = new Integer[nums.length + 2];
		max[0] = max[1] = 0;
		for (int i = 0; i < nums.length; i++) {
			max[i + 2] = Math.max(max[i] + nums[i], max[i + 1]);
		}
		return max[nums.length + 1];
	}
}
