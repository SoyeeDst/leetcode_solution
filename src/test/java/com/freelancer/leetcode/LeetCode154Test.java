package com.freelancer.leetcode;

import org.junit.Assert;

/**
 * Created by Soyee on 2016/9/8.
 */
public class LeetCode154Test {

    @org.junit.Test
    public void testFindMin() {
        LeetCode154 leetCode154 = new LeetCode154();
        Assert.assertEquals(0, leetCode154.findMin(new int[] {4,5,6,7,0,1,2}));
    }

    @org.junit.Test
    public void testFindMin2() {
        LeetCode154 leetCode154 = new LeetCode154();
        Assert.assertEquals(4, leetCode154.findMin(new int[] {4,4,4,4,4,4}));
    }

    @org.junit.Test
    public void testFindMin3() {
        LeetCode154 leetCode154 = new LeetCode154();
        Assert.assertEquals(1, leetCode154.findMin(new int[] {3, 1, 2}));
    }
}
