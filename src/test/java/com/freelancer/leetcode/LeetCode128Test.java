package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/11.
 */
public class LeetCode128Test {

    @Test
    public void testLongestConsecutive() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(4, leetCode128.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    @Test
    public void testLongestConsecutive2() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(5, leetCode128.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2, 101, 102, 103, 104}));
    }

    @Test
    public void testLongestConsecutive3() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(1, leetCode128.longestConsecutive(new int[] {100, 4, 200, 300, 250, 130, 380}));
    }

    @Test
    public void testLongestConsecutive4() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(2, leetCode128.longestConsecutive(new int[] {0, -1}));
    }

    @Test
    public void testLongestConsecutive5() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(5, leetCode128.longestConsecutive(new int[] {0, 1,-1,2, -2, 5,6, 7,8}));
    }

    @Test
    public void testLongestConsecutive6() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(4, leetCode128.longestConsecutive(new int[] {0, 1, 2, 3,9 ,8, 20}));
    }

    @Test
    public void testLongestConsecutive7() {
        LeetCode128 leetCode128 = new LeetCode128();
        Assert.assertEquals(3, leetCode128.longestConsecutive(new int[] {2147483646,-2147483647,0,2,2147483644,-2147483645,2147483645}));
    }
}
