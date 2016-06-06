package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode70 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int[] ways = new int[n + 1];
        ways[0] = 0;
        ways[1] = 1;
        ways[2] = 2;
        for (int index = 3; index <= n; index++) {
            ways[index] = ways[index - 2] + ways[index - 1];
        }
        return ways[n];
    }
}
