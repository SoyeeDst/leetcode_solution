package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode179Test {

	@Test
	public void testlargestNumber() {
		int[] nums = new int[] { 3, 30, 34, 5, 9 };
		LeetCode179 leetCode179 = new LeetCode179();
		Assert.assertEquals("9534330", leetCode179.largestNumber(nums));
	}

	@Test
	public void testlargestNumber2() {
		int[] nums = new int[] { 33, 330, 34, 5, 9 };
		LeetCode179 leetCode179 = new LeetCode179();
		Assert.assertEquals("953433330", leetCode179.largestNumber(nums));
	}

	@Test
	public void testlargestNumber3() {
		int[] nums = new int[] { 33, 335, 34, 5, 9 };
		LeetCode179 leetCode179 = new LeetCode179();
		Assert.assertEquals("953433533", leetCode179.largestNumber(nums));
	}

	@Test
	public void testlargestNumber4() {
		int[] nums = new int[] { 121, 12 };
		LeetCode179 leetCode179 = new LeetCode179();
		Assert.assertEquals("12121", leetCode179.largestNumber(nums));
	}
	
	@Test
	public void testlargestNumber5() {
		int[] nums = new int[] { 3, 33, 35, 12 };
		LeetCode179 leetCode179 = new LeetCode179();
		Assert.assertEquals("3533312", leetCode179.largestNumber(nums));
	}
	
	@Test
	public void testlargestNumber6() {
		int[] nums = new int[] { 128,12,320,32 };
		LeetCode179 leetCode179 = new LeetCode179();
		Assert.assertEquals("3232012812", leetCode179.largestNumber(nums));
	}

}