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

    @Test
    public void testLargestRectangleArea2() {
        LeetCode84 leetCode84 = new LeetCode84();
        Assert.assertEquals(4, leetCode84.largestRectangleArea(new int[] {1, 2, 2}));
    }

    @Test
    public void testLargestRectangleArea3() {
        LeetCode84 leetCode84 = new LeetCode84();
        Assert.assertEquals(3, leetCode84.largestRectangleArea(new int[] {2, 1, 2}));
    }

    @Test
    public void testLargestRectangleArea4() {
        LeetCode84 leetCode84 = new LeetCode84();
        Assert.assertEquals(6, leetCode84.largestRectangleArea(new int[] {3, 2, 2}));
    }

    @Test
    public void testLargestRectangleArea5() {
        LeetCode84 leetCode84 = new LeetCode84();
        Assert.assertEquals(9, leetCode84.largestRectangleArea(new int[] {1, 2, 3, 4, 5}));
    }
}
