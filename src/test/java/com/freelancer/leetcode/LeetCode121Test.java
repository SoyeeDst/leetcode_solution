package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/2.
 */
public class LeetCode121Test {

    @Test
    public void testMaxProfit() {
        LeetCode121 leetCode102 = new LeetCode121();
        Assert.assertEquals(5, leetCode102.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, leetCode102.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(2, leetCode102.maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
        Assert.assertEquals(8, leetCode102.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0}));
    }

}
