package com.freelancer.leetcode;

public class LeetCode189 {

	public void rotate(int[] nums, int k) {
		int nm[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nm[(i + k) % nums.length] = nums[i];
		}

		System.arraycopy(nm, 0, nums, 0, nums.length);
	}

}
