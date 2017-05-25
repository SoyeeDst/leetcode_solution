package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode205Test {
	
	@Test
    public void testIsomorphic() {
        LeetCode205 leetCode205 = new LeetCode205();
        Assert.assertTrue(leetCode205.isIsomorphic("egg", "add"));
        Assert.assertFalse(leetCode205.isIsomorphic("foo", "bar"));
        Assert.assertTrue(leetCode205.isIsomorphic("paper", "title"));
        Assert.assertFalse(leetCode205.isIsomorphic("ab", "aa"));
    }

}
