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
        Assert.assertEquals(5,leetCode102.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0,leetCode102.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }

}
