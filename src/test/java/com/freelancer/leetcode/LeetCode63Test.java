package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode63Test {

    @Test
    public void testUniquePaths() {
        LeetCode63 leetCode63 = new LeetCode63();
        Assert.assertEquals(2, leetCode63.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}
