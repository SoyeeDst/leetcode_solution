package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class FindKNumberTest {

	@Test
	public void testFindKNumber() {
		FindKNumber a = new FindKNumber();
		Assert.assertEquals(7, a.getKthNumber(new int[] {9,  7,  5, 3, 1}, new int[] {8, 6, 4, 2, 0}, 3));
		
		Assert.assertEquals(5, a.getKthNumber(new int[] {9,  7,  5, 3, 1}, new int[] {8, 6, 4, 2, 0}, 5));
		
		Assert.assertEquals(6, a.getKthNumber(new int[] {9,  7,  5, 3, 1}, new int[] {8, 6, 4, 2, 0}, 4));
		
		Assert.assertEquals(3, a.getKthNumber(new int[] {9,  7,  5}, new int[] {3, 2, 1}, 4));
		
		Assert.assertEquals(4, a.getKthNumber(new int[] {4,  3,  1}, new int[] {10, 9, 7}, 4));
	}
}
