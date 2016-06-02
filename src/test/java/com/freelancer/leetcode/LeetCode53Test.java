package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/2.
 */
public class LeetCode53Test {

    @Test
    public void testMaxSubArray() {
        LeetCode53 leetCode53 = new LeetCode53();
        Assert.assertEquals(6, leetCode53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
