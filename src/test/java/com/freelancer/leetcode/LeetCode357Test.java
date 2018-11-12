package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode357Test {

	@Test
	public void testUniqiueDigitsCount() {
		LeetCode357 leetCode = new LeetCode357();
		Assert.assertEquals(1, leetCode.countNumbersWithUniqueDigits(0));
		Assert.assertEquals(10, leetCode.countNumbersWithUniqueDigits(1));
		Assert.assertEquals(91, leetCode.countNumbersWithUniqueDigits(2));
		Assert.assertEquals(739, leetCode.countNumbersWithUniqueDigits(3));
		Assert.assertEquals(5275, leetCode.countNumbersWithUniqueDigits(4));
		Assert.assertEquals(32491, leetCode.countNumbersWithUniqueDigits(5));
		Assert.assertEquals(168571, leetCode.countNumbersWithUniqueDigits(6));
		Assert.assertEquals(712891, leetCode.countNumbersWithUniqueDigits(7));
		Assert.assertEquals(2345851, leetCode.countNumbersWithUniqueDigits(8));
		Assert.assertEquals(5611771, leetCode.countNumbersWithUniqueDigits(9));
		Assert.assertEquals(0, leetCode.countNumbersWithUniqueDigits(10));
		Assert.assertEquals(0, leetCode.countNumbersWithUniqueDigits(11));
		Assert.assertEquals(0, leetCode.countNumbersWithUniqueDigits(12));
	}
	
}
