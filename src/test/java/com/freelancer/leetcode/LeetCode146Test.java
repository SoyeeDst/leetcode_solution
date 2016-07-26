package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/26.
 */
public class LeetCode146Test {

    @Test
    public void testLRUCache() {
        LeetCode146 leetCode146 = new LeetCode146(1);
        Assert.assertEquals(-1, leetCode146.get(1));
        leetCode146.set(1, 2);
        Assert.assertEquals(2, leetCode146.get(1));
        leetCode146.set(1, 3);
        Assert.assertEquals(3, leetCode146.get(1));
        leetCode146.set(2, 4);
        Assert.assertEquals(-1, leetCode146.get(1));
        Assert.assertEquals(4, leetCode146.get(2));
    }

    @Test
    public void testLRUCache2() {
        LeetCode146 leetCode146 = new LeetCode146(2);
        Assert.assertEquals(-1, leetCode146.get(1));
        leetCode146.set(2, 1);
        leetCode146.set(1, 1);
        Assert.assertEquals(1, leetCode146.get(2));
        leetCode146.set(4, 1);
        Assert.assertEquals(-1, leetCode146.get(1));
        Assert.assertEquals(1, leetCode146.get(2));
    }
}
