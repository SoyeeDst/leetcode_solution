package com.freelancer.leetcode;

import com.freelancer.leetcode.support.Point;
import org.junit.*;

/**
 * Created by Soyee on 2016/9/7.
 */
public class LeetCode150Test {

    @org.junit.Test
    public void testEvalRPN() {
        LeetCode150 leetCode150 = new LeetCode150();
        Assert.assertEquals(9, leetCode150.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        Assert.assertEquals(6, leetCode150.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @org.junit.Test
    public void testEvalEliminateError() {
        LeetCode150 leetCode150 = new LeetCode150();
        Assert.assertEquals(-7, leetCode150.evalRPN(new String[] {"4","-2","/","2","-3","-","-"}));
        Long start = System.currentTimeMillis();
        Assert.assertEquals(18, leetCode150.evalRPN(new String[] {"18"}));
        System.err.println(System.currentTimeMillis() - start);
    }
}
