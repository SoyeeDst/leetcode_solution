package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode397Test {

	@Test
	public void testIntegerReplacement() {
		LeetCode397 leetCode = new LeetCode397();
		
		Assert.assertEquals(3, leetCode.integerReplacement(8));
		Assert.assertEquals(4, leetCode.integerReplacement(7));
	}
	
}
