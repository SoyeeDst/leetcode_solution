package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/5/25.
 */
public class LeetCode35Test {

    @Test
    public void testCountAndSay() {
        LeetCode35 leetCode35 = new LeetCode35();
        Assert.assertEquals("56088", leetCode35.multiply("123", "456"));
        Assert.assertEquals("1", leetCode35.multiply("1", "1"));
        Assert.assertEquals("0", leetCode35.multiply("0", "1"));
        Assert.assertEquals("56302789", leetCode35.multiply("7967", "7067"));
    }
}
