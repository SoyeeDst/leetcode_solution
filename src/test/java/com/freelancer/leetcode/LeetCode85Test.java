package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/13.
 */
public class LeetCode85Test {

    @Test
    public void testLargestRectangleArea() {
        LeetCode85 leetCode85 = new LeetCode85();
        Assert.assertEquals(20, leetCode85.maximalRectangle(new char[][]{{'1', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}}));
    }

    @Test
    public void testLargestRectangleArea2() {
        LeetCode85 leetCode85 = new LeetCode85();
        Assert.assertEquals(8, leetCode85.maximalRectangle(new char[][]{{'0', '1', '1', '0', '0'}, {'0', '1', '1', '0', '0'}, {'0', '1', '1', '0', '0'}, {'0', '1', '1', '0', '0'}}));
    }

    @Test
     public void testLargestRectangleArea3() {
        LeetCode85 leetCode85 = new LeetCode85();
        Assert.assertEquals(9, leetCode85.maximalRectangle(new char[][]{{'0', '1', '1', '0', '0'}, {'1', '1', '1', '1', '0'}, {'1', '1', '1', '1', '0'}, {'0', '1', '1', '1', '0'}, {'0', '0', '0', '0', '0'}}));
    }

    @Test
    public void testLargestRectangleArea4() {
        LeetCode85 leetCode85 = new LeetCode85();
        Assert.assertEquals(0, leetCode85.maximalRectangle(new char[][]{{'0'}}));
    }
}
