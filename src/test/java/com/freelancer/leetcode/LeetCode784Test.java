package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode784Test {
	
	@Test
	public void testLetterCasePermutation() {
		LeetCode784 leetcode = new LeetCode784();
		Assert.assertEquals(4, leetcode.letterCasePermutation("a1b2").size());
		
		Assert.assertEquals(8, leetcode.letterCasePermutation("a1b21c").size());
		
		Assert.assertEquals(2, leetcode.letterCasePermutation("3z4").size());
		
		Assert.assertEquals(1, leetcode.letterCasePermutation("12345").size());
		
		Assert.assertEquals(1, leetcode.letterCasePermutation("").size());
		
		Assert.assertEquals(2, leetcode.letterCasePermutation("C").size());
	}

}
