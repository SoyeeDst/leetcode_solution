package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/3.
 */
public class LeetCode123Test {

    @Test
    public void testMaxProfit() {
        LeetCode123 leetCode123 = new LeetCode123();
        Assert.assertEquals(11, leetCode123.maxProfit(new int[]{7, 1, 5, 3, 6, 4, 10}));
    }
}
