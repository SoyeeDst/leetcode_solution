package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode766Test {

	@Test
	public void testIsToeplitzMatrix() {
       LeetCode766 leetcode = new LeetCode766();
       Assert.assertTrue(leetcode.isToeplitzMatrix(new int[][] {{1,2,3,4}, {5,1,2,3}, {9,5,1,2}}));
       
       Assert.assertFalse(leetcode.isToeplitzMatrix(new int[][] {{1, 2}, {2, 2}}));
	}

}
