package com.freelancer.leetcode;

import org.junit.Assert;

/**
 * Created by Soyee on 2016/9/11.
 */
public class LeetCode165Test {

    @org.junit.Test
    public void testCompareVersion() {
        LeetCode165 leetCode165 = new LeetCode165();
        Assert.assertEquals(-1, leetCode165.compareVersion("1.0", "2"));
        Assert.assertEquals(-1, leetCode165.compareVersion("0.5", "2"));
        Assert.assertEquals(-1, leetCode165.compareVersion("1.2", "12"));
        Assert.assertEquals(1, leetCode165.compareVersion("5.0", "0.5"));
        Assert.assertEquals(0, leetCode165.compareVersion("1.0", "1"));
        Assert.assertEquals(0, leetCode165.compareVersion("1", "1.0"));
        Assert.assertEquals(0, leetCode165.compareVersion("1", "1.0.0"));
        Assert.assertEquals(0, leetCode165.compareVersion("1.0.0", "1"));
    }

}
