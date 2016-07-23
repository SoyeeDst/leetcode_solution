package com.freelancer.leetcode;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/18.
 */
public class LeetCode135Test {

    @Test
    public void testCandy() {
        LeetCode135 leetCode135 = new LeetCode135();
        Assert.assertEquals(55, leetCode135.candy(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void testCandy2() {
        LeetCode135 leetCode135 = new LeetCode135();
        Assert.assertEquals(10, leetCode135.candy(new int[]{5, 6, 1, 1, 100, 200}));
    }

    @Test
    public void testCandy3() {
        LeetCode135 leetCode135 = new LeetCode135();
        Assert.assertEquals(3, leetCode135.candy(new int[]{2, 1}));
    }

    @Test
    public void testCandy4() {
        LeetCode135 leetCode135 = new LeetCode135();
        Assert.assertEquals(4, leetCode135.candy(new int[]{1, 2, 2}));
    }

    @Test
    public void testCandy5() {
        LeetCode135 leetCode135 = new LeetCode135();
        Assert.assertEquals(3, leetCode135.candy(new int[]{2, 2, 1}));
    }
}
