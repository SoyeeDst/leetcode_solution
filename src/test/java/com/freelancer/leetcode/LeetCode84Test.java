package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/12.
 */
public class LeetCode84Test {

    @Test
    public void testLargestRectangleArea() {
        LeetCode84 leetCode84 = new LeetCode84();
        Assert.assertEquals(10, leetCode84.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
    }
}
