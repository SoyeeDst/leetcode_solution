package com.freelancer.leetcode;

import org.junit.Assert;

/**
 * Created by soyee on 2017/1/8.
 */
public class LeetCode239Test {

    @org.junit.Test
    public void testMaxSlidingWindow() {
        LeetCode239 leetCode239 = new LeetCode239();
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int[] res = leetCode239.maxSlidingWindow(nums, 3);
        Assert.assertEquals(6, res.length);
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, res);
    }
}
