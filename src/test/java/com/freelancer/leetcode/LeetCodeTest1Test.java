package com.freelancer.leetcode;

import com.freelancer.leetcode.support.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by soyee on 2016/8/3.
 */
public class LeetCodeTest1Test {

    @Test
    public void testEmptyMaxPoints() {
        LeetCodeTest1 leetCode149 = new LeetCodeTest1();
        Assert.assertEquals(5, leetCode149.solution(5, 5));
        Assert.assertEquals(4, leetCode149.solution(5, 7));
        Assert.assertEquals(8, leetCode149.solution(8, 9));
        Assert.assertEquals(0, leetCode149.solution(0, 0));
        Assert.assertEquals(67108864, leetCode149.solution(Integer.MAX_VALUE/16, Integer.MAX_VALUE));
    }

    @Test
    public void testEmptyMaxPoints2() {
        LeetCodeTest2 leetCode149 = new LeetCodeTest2();
        Assert.assertEquals(4, leetCode149.solution(new int[]{5, 4, 0, 3, 1, 6, 2}));
        int []data = new int[1000000];
        for (int index = 0; index < data.length - 1; index++) {
            data[index] = index + 1;
        }
        data[data.length - 1] = 0;
        Long start = System.currentTimeMillis();
        Assert.assertEquals(1000000, leetCode149.solution(data));
        System.err.println(System.currentTimeMillis() - start);
    }
}
