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
        int[][] pc = new int[prices.length][2];

        do {
            if (prices[ix] > prices[ix - 1]) {
                if (mf == 0) {
                    // reset
                    pc[ix - 1][0] = ix - 1;
                    pc[ix - 1][1] = ix - 1;
                }

                int d1 = prices[ix] - prices[pc[ix - 1][0]];
                int d2 = 0;
                int li = 0;
                int nix = pc[ix - 1][1];
                do {
                    int t2 = prices[ix] - prices[nix];
                    if (t2 >= d2) {
                        d2 = t2;
                        li = nix;
                    }
                    nix++;
                } while (nix <= ix - 1);

                int df = d2 >= d1 ? d2 : d1;
                if (df > mf) {
                    mf = df;
                    pc[ix][0] = (d2 >= d1) ? li : (pc[ix - 1][0]);
                    pc[ix][1] = ix;
                    ix++;
                    continue;
                }
            }

            pc[ix][0] = pc[ix - 1][0];
            pc[ix][1] = pc[ix - 1][1];
            ix++;
        } while (ix < prices.length);
        return mf;
    }
}
