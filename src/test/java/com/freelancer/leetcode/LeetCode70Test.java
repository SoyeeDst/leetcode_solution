package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode70Test {

    @Test
    public void testClimbStairs() {
        LeetCode70 leetCode70 = new LeetCode70();
        int n = leetCode70.climbStairs(5);
        Assert.assertEquals(10, n);
    }
}
