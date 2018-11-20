package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode807Test {

	@Test
	public void testMaxIncreaseKeepingSkyline() {
		LeetCode807 leetcode = new LeetCode807();
		Assert.assertEquals(35, leetcode.maxIncreaseKeepingSkyline(
				new int[][] { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } }));
	}

}
