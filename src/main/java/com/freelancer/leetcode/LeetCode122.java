package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/3.
 */
public class LeetCode122 {

    public int maxProfit(int[] prices) {
        int p = 0;
        for (int ix = 1; ix < prices.length; ix++) {
            int delta = prices[ix] - prices[ix - 1];
            if (delta >= 0) {
                p = p + delta;
            }
        }
        return p;
    }
}
