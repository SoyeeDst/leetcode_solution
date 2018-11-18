package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode724Test {

	@Test
	public void testPivotIndex() {
		LeetCode724 leetCode = new LeetCode724();

		Assert.assertEquals(3, leetCode.pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
		Assert.assertEquals(-1, leetCode.pivotIndex(new int[] { 1, 2, 3 }));
		Assert.assertEquals(0, leetCode.pivotIndex(new int[] { -1, -1, -1, 0, 1, 1 }));
		Assert.assertEquals(5, leetCode.pivotIndex(new int[] { -1, -1, 0, 1, 1, 0 }));
	}
}
