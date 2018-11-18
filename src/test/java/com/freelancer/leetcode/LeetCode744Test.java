package com.freelancer.leetcode;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode744Test {
	
	@Test
	public void testNextGreatestLetter() {
		LeetCode744 leetCode = new LeetCode744();
		
		Assert.assertEquals('c', leetCode.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'));
		Assert.assertEquals('f', leetCode.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'));
		Assert.assertEquals('f', leetCode.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'));
		Assert.assertEquals('j', leetCode.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'g'));
		Assert.assertEquals('c', leetCode.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'j'));
		Assert.assertEquals('c', leetCode.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'k'));
		
		Assert.assertEquals('a', leetCode.nextGreatestLetter(new char[] {'a', 'b'}, 'z'));
	}

}
