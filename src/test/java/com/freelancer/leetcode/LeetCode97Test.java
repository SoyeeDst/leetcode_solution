package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/16.
 */
public class LeetCode97Test {

    @Test
    public void testInterleave() {
        LeetCode97 leetCode97 = new LeetCode97();
        Assert.assertTrue(leetCode97.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        Assert.assertFalse(leetCode97.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        Assert.assertFalse(leetCode97.isInterleave("aad", "aac", "aadc"));
        //Assert.assertTrue(leetCode97.isInterleave("aa", "ab", "aaba"));
    }
}
