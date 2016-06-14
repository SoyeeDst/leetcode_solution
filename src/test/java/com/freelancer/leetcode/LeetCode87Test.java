package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/14.
 */
public class LeetCode87Test {

    @Test
    public void testIsScramble() {
        LeetCode87 leetCode87 = new LeetCode87();
        Assert.assertTrue(leetCode87.isScramble("great", "rgeat"));
    }

    @Test
    public void testIsScramble2() {
        LeetCode87 leetCode87 = new LeetCode87();
        Assert.assertTrue(leetCode87.isScramble("great", "rgtae"));
    }

    @Test
    public void testIsScramble3() {
        LeetCode87 leetCode87 = new LeetCode87();
        Assert.assertTrue(leetCode87.isScramble("ab", "ba"));
    }
}
