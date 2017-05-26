package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode209Test {

	@Test
	public void testMinimumArrayLength() {
		LeetCode209 leetCode209 = new LeetCode209();
		Assert.assertEquals(0, leetCode209.minSubArrayLen(10, new int[] { 1, 2, 3 }));
		Assert.assertEquals(2, leetCode209.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
		Assert.assertEquals(5, leetCode209.minSubArrayLen(15, new int[] { 1, 2, 3, 4, 5 }));
		Assert.assertEquals(8,
				leetCode209.minSubArrayLen(213, new int[] { 12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12 }));
	}

}
