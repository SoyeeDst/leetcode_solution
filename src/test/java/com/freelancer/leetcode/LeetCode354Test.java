package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode354Test {
	
	@Test
    public void getMaxEnvelopes() {
		LeetCode354 leetCode = new LeetCode354();
		
		Assert.assertEquals(3,leetCode.maxEnvelopes(new int[][]{{5,4}, {6,4}, {6,7}, {2,3}}));
	}

}
