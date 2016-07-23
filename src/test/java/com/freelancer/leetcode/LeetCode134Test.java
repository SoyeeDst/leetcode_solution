package com.freelancer.leetcode;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/19.
 */
public class LeetCode134Test {

    @Test
    public void testCandy() {
        LeetCode134 leetCode134 = new LeetCode134();
        Assert.assertEquals(0, leetCode134.canCompleteCircuit(new int[]{5}, new int[] {4}));
    }
}
