package com.freelancer.leetcode;

import org.junit.Assert;

/**
 * Created by Soyee on 2016/9/12.
 */
public class LeetCode166Test {

    @org.junit.Test
    public void testFractionToDecimal() {
        LeetCode166 leetCode166 = new LeetCode166();
        Assert.assertEquals("0.5", leetCode166.fractionToDecimal(1, 2));
        Assert.assertEquals("2", leetCode166.fractionToDecimal(2, 1));
        Assert.assertEquals("0.(6)", leetCode166.fractionToDecimal(2, 3));
        Assert.assertEquals("2.000(6)", leetCode166.fractionToDecimal(6002, 3000));
        Assert.assertEquals("0.000(6)", leetCode166.fractionToDecimal(2, 3000));
    }

    @org.junit.Test
    public void testFractionToDecimalWA() {
        LeetCode166 leetCode166 = new LeetCode166();
        Assert.assertEquals("0.1(6)", leetCode166.fractionToDecimal(1, 6));
    }

    @org.junit.Test
    public void testFractionToDecimalWA2() {
        LeetCode166 leetCode166 = new LeetCode166();
        Assert.assertEquals("-6.25", leetCode166.fractionToDecimal(-50, 8));
        Assert.assertEquals("-0.5", leetCode166.fractionToDecimal(-1, 2));
        Assert.assertEquals("-2", leetCode166.fractionToDecimal(2, -1));
        Assert.assertEquals("-0.(6)", leetCode166.fractionToDecimal(2, -3));
        Assert.assertEquals("-2.000(6)", leetCode166.fractionToDecimal(6002, -3000));
        Assert.assertEquals("-0.000(6)", leetCode166.fractionToDecimal(2, -3000));
        Assert.assertEquals("-0.58(3)", leetCode166.fractionToDecimal(7, -12));
        Assert.assertEquals("0.0000000004656612873077392578125", leetCode166.fractionToDecimal(-1, -2147483648));
    }
}
