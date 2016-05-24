package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/5/20.
 */
public class LeetCode38Test {

    @Test
    public void testCountAndSay() {
        LeetCode38 leetCode38 = new LeetCode38();
        Assert.assertEquals("11", leetCode38.countAndSay(2));
        Assert.assertEquals("21", leetCode38.countAndSay(3));
        Assert.assertEquals("1211", leetCode38.countAndSay(4));
        Assert.assertEquals("111221", leetCode38.countAndSay(5));
        Assert.assertEquals("312211", leetCode38.countAndSay(6));
    }
}
