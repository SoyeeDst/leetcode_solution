package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode60Test {
	
	@Test
	public void testGetPermutation() {
		LeetCode60 leetCode60 = new LeetCode60();
		Assert.assertEquals("123", leetCode60.getPermutation(3, 1));
		Assert.assertEquals("132", leetCode60.getPermutation(3, 2));
		Assert.assertEquals("213", leetCode60.getPermutation(3, 3));
		Assert.assertEquals("231", leetCode60.getPermutation(3, 4));
		Assert.assertEquals("312", leetCode60.getPermutation(3, 5));
		Assert.assertEquals("321", leetCode60.getPermutation(3, 6));
	}
	
	@Test
	public void testGetPermutation2() {
		LeetCode60 leetCode60 = new LeetCode60();
		Assert.assertEquals("1234", leetCode60.getPermutation(4, 1));
		Assert.assertEquals("4132", leetCode60.getPermutation(4, 20));
	}
	
	@Test
	public void testGetPermutation3() {
		LeetCode60 leetCode60 = new LeetCode60();
		Assert.assertEquals("1", leetCode60.getPermutation(1, 1));
	}

}
