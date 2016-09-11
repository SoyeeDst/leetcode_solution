package com.freelancer.leetcode;

import org.junit.Assert;

/**
 * Created by Soyee on 2016/9/7.
 */
public class LeetCode152Test {

    @org.junit.Test
    public void testMaxProduct() {
        LeetCode152 leetCode152 = new LeetCode152();
        Assert.assertEquals(6, leetCode152.maxProduct(new int[] {2,3,-2, 4}));
    }

    @org.junit.Test
    public void testMaxProducts2() {
        LeetCode152 leetCode152 = new LeetCode152();
        Assert.assertEquals(120, leetCode152.maxProduct(new int[] {2,3,5,4}));
        Assert.assertEquals(30, leetCode152.maxProduct(new int[] {2,3,5,-4}));
        Assert.assertEquals(24, leetCode152.maxProduct(new int[] {-2,3,-4}));
    }
}
