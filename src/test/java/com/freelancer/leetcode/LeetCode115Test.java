package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/22.
 */
public class LeetCode115Test {

    @Test
    public void testCnrOfDistinct() {
        LeetCode115 leetCode115 = new LeetCode115();
        Assert.assertEquals(3, leetCode115.numDistinct("rabbbit", "rabbit"));
    }

    @Test
    public void testCnrOfDistinct2() {
        LeetCode115 leetCode115 = new LeetCode115();
        Assert.assertEquals(11, leetCode115.numDistinct("abbabbb", "abbb"));
    }

    @Test
    public void testCnrOfDistinct3() {
        LeetCode115 leetCode115 = new LeetCode115();
        Assert.assertEquals(3, leetCode115.numDistinct("ccc", "c"));
    }

    @Test
    public void testCnrOfDistinct4() {
        LeetCode115 leetCode115 = new LeetCode115();
        Assert.assertEquals(5, leetCode115.numDistinct("aacaacca", "ca"));
    }

    @Test
    public void testCnrOfDistinct5() {
        LeetCode115 leetCode115 = new LeetCode115();
        Assert.assertEquals(249, leetCode115.numDistinct("aaabbaaaabbbaaaaba", "abba"));
    }
}
