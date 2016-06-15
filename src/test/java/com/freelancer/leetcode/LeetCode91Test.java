package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/15.
 */
public class LeetCode91Test {

    @Test
    public void testCnrOfEncodings() {
        LeetCode91 leetCode91 = new LeetCode91();
        Assert.assertEquals(0, leetCode91.numDecodings(""));
        Assert.assertEquals(2, leetCode91.numDecodings("12"));
        Assert.assertEquals(1, leetCode91.numDecodings("3333333"));
        Assert.assertEquals(3, leetCode91.numDecodings("123"));
        Assert.assertEquals(3, leetCode91.numDecodings("1234"));
    }

    @Test
    public void testCnrOfEncodings2() {
        LeetCode91 leetCode91 = new LeetCode91();
        Assert.assertEquals(0, leetCode91.numDecodings("0"));
        Assert.assertEquals(1, leetCode91.numDecodings("10"));
        Assert.assertEquals(1, leetCode91.numDecodings("101"));
        Assert.assertEquals(0, leetCode91.numDecodings("1001"));
    }
}
