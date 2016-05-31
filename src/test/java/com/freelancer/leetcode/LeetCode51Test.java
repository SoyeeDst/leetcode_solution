package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/5/31.
 */
public class LeetCode51Test {

    @Test
    public void test4Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(4);
        Assert.assertTrue(valueList.size() == 2);
    }

    @Test
    public void test8Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(8);
        Assert.assertEquals(92, valueList.size());
    }

    @Test
    public void testOdd5Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(5);
        Assert.assertEquals(10, valueList.size());
    }

    @Test
    public void testOdd7Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(7);
        Assert.assertEquals(40, valueList.size());
    }

    @Test
    public void testNoAnswers() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(2);
        Assert.assertTrue(valueList.size() == 0);
        valueList = leetCode51.solveNQueens(3);
        Assert.assertTrue(valueList.size() == 0);
    }
}
