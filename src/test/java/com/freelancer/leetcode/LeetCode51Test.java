package com.freelancer.leetcode;

import com.sun.deploy.util.StringUtils;
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
        int answerIndex = 0;
        for (List<String> alternativeAnswer : valueList) {
            System.err.println("---------- Answer " + answerIndex + " ----------");
            answerIndex++;
            System.err.println(StringUtils.join(alternativeAnswer, "\n"));
        }
    }

    @Test
    public void test8Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(8);
        Assert.assertEquals(92, valueList.size());
        int answerIndex = 0;
        for (List<String> alternativeAnswer : valueList) {
            System.err.println("---------- Answer " + answerIndex + " ----------");
            answerIndex++;
            System.err.println(StringUtils.join(alternativeAnswer, "\n"));
        }
    }

    @Test
    public void testOdd5Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(5);
        int answerIndex = 0;
        for (List<String> alternativeAnswer : valueList) {
            System.err.println("---------- Answer " + answerIndex + " ----------");
            answerIndex++;
            System.err.println(StringUtils.join(alternativeAnswer, "\n"));
        }
    }

    @Test
    public void testOdd7Queens() {
        LeetCode51 leetCode51 = new LeetCode51();
        List<List<String>> valueList = leetCode51.solveNQueens(7);
        Assert.assertEquals(40, valueList.size());
        int answerIndex = 0;
        for (List<String> alternativeAnswer : valueList) {
            System.err.println("---------- Answer " + answerIndex + " ----------");
            answerIndex++;
            System.err.println(StringUtils.join(alternativeAnswer, "\n"));
        }
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
