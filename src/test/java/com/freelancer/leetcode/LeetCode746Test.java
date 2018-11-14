package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode746Test {

	@Test
	public void testMinCostClimbingStairs() {
		LeetCode746 leetCode = new LeetCode746();
		Assert.assertEquals(15, leetCode.minCostClimbingStairs(new int[] { 10, 15, 20 }));
		
		Assert.assertEquals(6, leetCode.minCostClimbingStairs(new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }));
	}

}
