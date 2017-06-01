package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode198Test {

	@Test
    public void testRobbery() {
        LeetCode198 leetCode198 = new LeetCode198();
        Assert.assertEquals(5, leetCode198.rob(new int[] {5}));
        
        Assert.assertEquals(6, leetCode198.rob(new int[] {5, 6}));
        
        Assert.assertEquals(12, leetCode198.rob(new int[] {5, 6, 7}));
        
        Assert.assertEquals(12, leetCode198.rob(new int[] {5, 6, 7, 3}));
        
        Assert.assertEquals(15, leetCode198.rob(new int[] {5, 6, 7, 8, 3}));
    }
}
