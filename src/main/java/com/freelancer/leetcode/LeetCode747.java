package com.freelancer.leetcode;

public class LeetCode747 {

	public int dominantIndex(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return 0;
		}

		Integer m = null;
		Integer m2 = null;
		Integer o = -1;

		for (int i = 0; i < nums.length; i++) {
			if (m == null || nums[i] > m) {
				if (m != null) {
					m2 = m;
				}
				m = nums[i];
				o = i;
			} else if (nums[i] < m) {
				if (m2 == null || nums[i] > m2) {
					m2 = nums[i];
				}
			}
		}

		if (m2 == null) {
			return -1;
		}

		return m >= 2 * m2 ? o : -1;
	}

}
