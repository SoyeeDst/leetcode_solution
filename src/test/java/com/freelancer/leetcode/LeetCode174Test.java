package com.freelancer.leetcode;

import org.junit.Assert;

/**
 * Created by Soyee on 2016/10/24.
 */
public class LeetCode174Test {

    @org.junit.Test
    public void testCalculateMinimumHP() {
        LeetCode174 leetCode174 = new LeetCode174();
        int[][] scores = new int[][] {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        Assert.assertTrue(7 == leetCode174.calculateMinimumHP(scores));
    }

    @org.junit.Test
    public void testCalculateMinimumHP2() {
        LeetCode174 leetCode174 = new LeetCode174();
        int[][] scores = new int[][] {{1,-3,3},{0,-2,0},{-3,-3,-3}};
        Assert.assertEquals(3, leetCode174.calculateMinimumHP(scores));
    }
}
