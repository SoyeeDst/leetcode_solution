package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode396Test {

	@Test
	public void testPerfectRectangles() {
		LeetCode396 leetCode396 = new LeetCode396();

		Assert.assertFalse(leetCode396
				.isRectangleCover(new int[][] { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 1, 3, 2, 4 }, { 3, 2, 4, 4 } }));

		Assert.assertFalse(leetCode396
				.isRectangleCover(new int[][] { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 1, 3, 2, 4 }, { 2, 2, 4, 4 } }));

		Assert.assertFalse(leetCode396
				.isRectangleCover(new int[][] { { 1, 1, 2, 3 }, { 1, 3, 2, 4 }, { 3, 1, 4, 2 }, { 3, 2, 4, 4 } }));

		Assert.assertTrue(leetCode396.isRectangleCover(
				new int[][] { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 3, 2, 4, 4 }, { 1, 3, 2, 4 }, { 2, 3, 3, 4 } }));
	}

	@Test
	public void testPerfectRectanglesWA() {
		LeetCode396 leetCode396 = new LeetCode396();

		Assert.assertFalse(
				leetCode396.isRectangleCover(new int[][] { { 0, 0, 1, 1 }, { 0, 1, 3, 2 }, { 1, 0, 2, 2 } }));
		
		// Assert.assertTrue(leetCode396.isRectangleCover(new int[][] {{0,0,4,1},{7,0,8,2},{6,2,8,3},{5,1,6,3},{4,0,5,1},{6,0,7,2},{4,2,5,3},{2,1,4,3},{0,1,2,2},{0,2,2,3},{4,1,5,2},{5,0,6,1}}));
	}

}
