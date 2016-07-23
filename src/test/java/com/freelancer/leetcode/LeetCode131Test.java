package com.freelancer.leetcode;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/7/15.
 */
public class LeetCode131Test {

    @Test
    public void testPartition0() {
        LeetCode131 leetCode131 = new LeetCode131();
        List<List<String>> plList = leetCode131.partition("a");
        Assert.assertEquals(1, plList.size());
        plList = leetCode131.partition("");
        Assert.assertEquals(0, plList.size());
    }

    @Test
    public void testPartition() {
        LeetCode131 leetCode131 = new LeetCode131();
        List<List<String>> plList = leetCode131.partition("aab");
        Assert.assertEquals(2, plList.size());
    }

    @Test
    public void testPartition2() {
        LeetCode131 leetCode131 = new LeetCode131();
        List<List<String>> plList = leetCode131.partition("abcdefghi");
        Assert.assertEquals(1, plList.size());
    }

    @Test
    public void testPartition3() {
        LeetCode131 leetCode131 = new LeetCode131();
        List<List<String>> plList = leetCode131.partition("aaaaaa");
        Assert.assertEquals(32, plList.size());
    }
}
