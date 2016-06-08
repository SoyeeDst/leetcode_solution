package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/8.
 */
public class LeetCode79Test {

    @Test
    public void testPossibleExisting() {
        LeetCode79 leetCode79 = new LeetCode79();
        Assert.assertEquals(true, leetCode79.exist(new char[][] {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCCED"));
    }

    @Test
    public void testPossibleExisting2() {
        LeetCode79 leetCode79 = new LeetCode79();
        Assert.assertEquals(true, leetCode79.exist(new char[][] {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "SEE"));
    }

    @Test
    public void testPossibleExisting3() {
        LeetCode79 leetCode79 = new LeetCode79();
        Assert.assertEquals(false, leetCode79.exist(new char[][] {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCB"));
    }

    @Test
    public void testPossibleExisting4() {
        LeetCode79 leetCode79 = new LeetCode79();
        Assert.assertEquals(false, leetCode79.exist(new char[][] {{'a'}}, "b"));
    }

    @Test
    public void testPossibleExisting5() {
        LeetCode79 leetCode79 = new LeetCode79();
        Assert.assertEquals(true, leetCode79.exist(new char[][] {{'A','B','C','E'}, {'S','F','E','S'}, {'A','D','E','E'}}, "ABCESEEEFS"));
    }
}
