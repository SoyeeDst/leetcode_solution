package com.freelancer.leetcode;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by soyee on 2016/9/23.
 */
public class LeetCodeTest1V2Test {

    @Test
    public void testIntersectSol() {
        LeetCodeTest1V2 v2Test = new LeetCodeTest1V2();
        Assert.assertEquals(4, v2Test.solution(5, 7));
        Assert.assertEquals(7, v2Test.solution(7, 7));
        Assert.assertEquals(6, v2Test.solution(6, 7));
    }
}
