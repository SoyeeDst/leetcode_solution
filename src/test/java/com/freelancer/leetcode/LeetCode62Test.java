package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode62Test {

    @Test
    public void testUniquePaths() {
        LeetCode62 leetCode62 = new LeetCode62();
        Assert.assertEquals(28, leetCode62.uniquePaths(3, 7));
    }

    @Test
    public void testUniquePaths2() {
        LeetCode62 leetCode62 = new LeetCode62();
        Assert.assertEquals(48620, leetCode62.uniquePaths(10, 10));
    }
}
