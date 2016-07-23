package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/19.
 */
public class LeetCode136Test {

    @Test
    public void testSingleNumber() {
        LeetCode136 leetCode136 = new LeetCode136();
        Assert.assertEquals(1, leetCode136.singleNumber(new int[] {2, 1, 2}));
        Assert.assertEquals(1, leetCode136.singleNumber(new int[] {1, 2, 2}));
        Assert.assertEquals(1, leetCode136.singleNumber(new int[] {2, 2, 1}));
        Assert.assertEquals(7, leetCode136.singleNumber(new int[] {5, 5, 6, 6, 7}));
    }
}
