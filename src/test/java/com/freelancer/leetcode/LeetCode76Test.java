package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/7.
 */
public class LeetCode76Test {

    @Test
    public void testMinWindow() {
        LeetCode76 leetCode76 = new LeetCode76();
        Assert.assertEquals("BANC", leetCode76.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void testMinWindow2() {
        LeetCode76 leetCode76 = new LeetCode76();
        Assert.assertEquals("ABBC", leetCode76.minWindow("ABBCODEBANNC", "ABC"));
    }

    @Test
    public void testMinWindow3() {
        LeetCode76 leetCode76 = new LeetCode76();
        Assert.assertEquals("BADC", leetCode76.minWindow("AOOBADCODEBANNC", "ABC"));
    }

    @Test
    public void testMinWindow4() {
        LeetCode76 leetCode76 = new LeetCode76();
        Assert.assertEquals("BADC", leetCode76.minWindow("AOOBADCODEBANNC", "ABC"));
    }

    @Test
    public void testMinWindow5() {
        LeetCode76 leetCode76 = new LeetCode76();
        Assert.assertEquals("BBCA", leetCode76.minWindow("AOBBCADCODEBANNC", "ABBC"));
    }
}
