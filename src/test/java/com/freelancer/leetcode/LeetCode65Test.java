package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode65Test {

    @Test
    public void testNumber() {
        LeetCode65 leetCode65 = new LeetCode65();
        Assert.assertTrue(leetCode65.isNumber("0"));
        Assert.assertTrue(leetCode65.isNumber(" 0.1 "));
        Assert.assertFalse(leetCode65.isNumber("abc"));
        Assert.assertFalse(leetCode65.isNumber("1 a"));
        Assert.assertTrue(leetCode65.isNumber("2e10"));
        Assert.assertFalse(leetCode65.isNumber("."));
        Assert.assertFalse(leetCode65.isNumber("2.5e10.5"));
        Assert.assertFalse(leetCode65.isNumber("-2.5e10.5"));
        Assert.assertFalse(leetCode65.isNumber("-25.e10.5"));
        Assert.assertFalse(leetCode65.isNumber("-2.5e105."));
        Assert.assertFalse(leetCode65.isNumber("-2.-5e105"));
        Assert.assertFalse(leetCode65.isNumber("2-.5e105"));
        Assert.assertTrue(leetCode65.isNumber("01"));
        Assert.assertTrue(leetCode65.isNumber("01."));
        Assert.assertTrue(leetCode65.isNumber("+.8"));
        Assert.assertFalse(leetCode65.isNumber("3.5e+3.5e+3.5"));
        Assert.assertFalse(leetCode65.isNumber("4e3."));
        Assert.assertFalse(leetCode65.isNumber("e"));
    }
}
