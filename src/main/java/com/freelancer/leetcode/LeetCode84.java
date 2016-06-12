package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/8.
 * Solution to get largest rectangle in Histogram
 */
public class LeetCode84 {

    public int largestRectangleArea(int[] height) {
        if (height == null || height.length < 1) return 0;
        int[] stack = new int[height.length + 1];
        int len = 0, max = 0;
        for (int i = 0; i <= height.length; i++) {
            int h = (i == height.length) ? 0 : height[i];
            while (len != 0 && (i == height.length || height[stack[len - 1]] > h)) {
                if (len == 1)
                    max = Math.max(height[stack[--len]] * i, max);
                else
                    max = Math.max(height[stack[--len]] * (i - stack[len - 1] - 1), max);
            }
            stack[len++] = i;
        }
        return max;
    }
}
