package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/2.
 */
public class LeetCode121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int mf = 0;
        int ix = 1;

        do {
            if (prices[ix] > prices[ix - 1]) {
                int bix = 0;
                do {
                    mf = Math.max(prices[ix] - prices[bix], mf);
                    bix++;
                } while (bix <= ix - 1);
            }
            ix++;
        } while (ix < prices.length);
        return mf;
    }
}
