package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/5/25.
 */
public class LeetCode41Test {

    @Test
    public void testFindMissingPositive1() {
        LeetCode41 leetCode41 = new LeetCode41();
        Assert.assertEquals(3, leetCode41.firstMissingPositive(new int[] {1, 2, 0}));
        Assert.assertEquals(2, leetCode41.firstMissingPositive(new int[] {3, 4, -1, 1}));
        Assert.assertEquals(2, leetCode41.firstMissingPositive(new int[] {Integer.MAX_VALUE, 4, -1, 1}));
        Assert.assertEquals(2, leetCode41.firstMissingPositive(new int[] {Integer.MIN_VALUE, 4, -1, 1}));
        Assert.assertEquals(6, leetCode41.firstMissingPositive(new int[] {1, 1, 7, 8, 2, 3, 4, 5}));
        Assert.assertEquals(7, leetCode41.firstMissingPositive(new int[] {1, 2, 3, 4, 5, 6}));
        Assert.assertEquals(5, leetCode41.firstMissingPositive(new int[] {4, 1, 2, 3}));
    }
}
