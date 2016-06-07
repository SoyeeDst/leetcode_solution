package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/7.
 */
public class LeetCode72Test {

    @Test
    public void testSimpleMinDistance() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(0, leetCode72.minDistance("", ""));
        Assert.assertEquals(7, leetCode72.minDistance("", "abcdefg"));
        Assert.assertEquals(7, leetCode72.minDistance("abcdefg", ""));
        Assert.assertEquals(0, leetCode72.minDistance("abcdefg", "abcdefg"));
    }

    @Test
    public void testMinDistance() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(2, leetCode72.minDistance("abcd", "bcde"));
    }

    @Test
    public void testMinDistance2() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(8, leetCode72.minDistance("eeeeeeee", "ffffffff"));
    }

    @Test
    public void testMinDistance3() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(6, leetCode72.minDistance("a", "cccccca"));
        Assert.assertEquals(7, leetCode72.minDistance("a", "cccaccca"));
    }

    @Test
    public void testMinDistance4() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(1, leetCode72.minDistance("a", "ab"));
    }

    @Test
    public void testMinDistance5() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(1, leetCode72.minDistance("a", "ab"));
    }

    @Test
    public void testSuperLong() {
        LeetCode72 leetCode72 = new LeetCode72();
        Assert.assertEquals(27, leetCode72.minDistance("pneumonoultramicroscopicsilicovolcanoconiosis", "ultramicroscopically"));
    }
}
