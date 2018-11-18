package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode717Test {
	
	@Test
	public void testIsOneBitCharacter() {
		LeetCode717 leetcode = new LeetCode717();
		
		Assert.assertTrue(leetcode.isOneBitCharacter(new int[] {1, 0, 0}));
		
		Assert.assertFalse(leetcode.isOneBitCharacter(new int[] {1, 1, 1, 0}));
	}

}
