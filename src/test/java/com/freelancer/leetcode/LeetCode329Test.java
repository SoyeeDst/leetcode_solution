package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode329Test {

	@Test
	public void testLongestIncreasingPath() {
		LeetCode329 leetcode = new LeetCode329();

		Assert.assertEquals(4, leetcode.longestIncreasingPath(new int[][] { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } }));
	}
	
	@Test
	public void testLongestIncreasingPath2() {
		
		LeetCode329 leetcode = new LeetCode329();

		Assert.assertEquals(4, leetcode.longestIncreasingPath(new int[][] { { 3, 4, 5 }, { 3, 2, 6 }, { 2, 2, 1 } }));
		
	}
}
