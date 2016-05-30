package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/5/27.
 */
public class LeetCode45Test {

    @Test
    public void testJumpGames() {
        LeetCode45 leetCode45 = new LeetCode45();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(2, (leetCode45.jump(new int[]{2, 3, 1, 1, 4})));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testJumpGames5() {
        LeetCode45 leetCode45 = new LeetCode45();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(1, (leetCode45.jump(new int[]{3, 2, 1})));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testJumpGames6() {
        LeetCode45 leetCode45 = new LeetCode45();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(2, (leetCode45.jump(new int[]{2, 0, 2, 0, 1})));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testJumpGames7() {
        LeetCode45 leetCode45 = new LeetCode45();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(2, (leetCode45.jump(new int[]{3, 1, 1, 1, 1})));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testJumpGames2() {
        LeetCode45 leetCode45 = new LeetCode45();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(4, (leetCode45.jump(new int[]{2, 0, 6, 3, 5, 6, 7, 8, 1, 6, 0, 3, 6, 4, 2, 5, 5, 9})));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testJumpGames3() {
        LeetCode45 leetCode45 = new LeetCode45();
        Long start = System.currentTimeMillis();
        Assert.assertEquals(3, (leetCode45.jump(new int[]{5, 2, 1, 2, 5, 2, 6, 8, 1, 9, 3, 5, 8, 0, 2})));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testJumpGame3() {
        LeetCode45 leetCode45 = new LeetCode45();
        int[] nums = new int[5000];
        for (int index = 0; index < 5000; index++) {
            nums[index] = 2;
        }
        Assert.assertEquals(2499, (leetCode45.jump(nums)));
    }

    @Test
    public void testJumpGame4() {
        LeetCode45 leetCode45 = new LeetCode45();
        int[] nums = new int[25002];
        for (int index = 0; index < 25000; index++) {
            nums[index] = 25000 - index;
        }
        nums[25000] = 1;
        nums[25001] = 0;
        Assert.assertEquals(2, leetCode45.jump(nums));
    }
}
