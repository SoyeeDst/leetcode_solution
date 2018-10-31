package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode274Test {

	@Test
    public void testHIndex() {
		LeetCode274 leetcode = new LeetCode274();
		Assert.assertEquals(3, leetcode.hIndex(new int[] {3,0,6,1,5}));
		
		Assert.assertEquals(3, leetcode.hIndex(new int[] {6,5,4,3,2,1}));
		
		Assert.assertEquals(1, leetcode.hIndex(new int[] {1, 0, 0}));
		
		Assert.assertEquals(1, leetcode.hIndex(new int[] {100}));
		
		Assert.assertEquals(0, leetcode.hIndex(new int[] {0}));
	}
}
