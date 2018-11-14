package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode747Test {

	@Test
	public void testDominantIndex() {
		LeetCode747 leetcode = new LeetCode747();
		
		Assert.assertEquals(1, leetcode.dominantIndex(new int[] {3, 6, 1, 0}));
		
		Assert.assertEquals(-1, leetcode.dominantIndex(new int[] {1, 2, 3, 4}));
		
		Assert.assertEquals(-1, leetcode.dominantIndex(new int[] {0, 0, 0, 0}));
		
		Assert.assertEquals(0, leetcode.dominantIndex(new int[] {1, 0}));
		
		Assert.assertEquals(-1, leetcode.dominantIndex(new int[] {0, 0, 3, 2}));
	}
	
}
