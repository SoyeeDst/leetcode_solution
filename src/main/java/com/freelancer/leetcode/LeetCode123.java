package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/3.
 */
public class LeetCode123 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] sprices = capital(prices);
        if (sprices == null) {
            return 0;
        }

        int l = sprices.length;
        int[][] r = new int[l][l];
        populateCell(sprices, 0, l - 1, r);

        int max = r[0][l - 1];
        for (int i = l - 2; i > 0; i--) {
            max = Math.max(r[0][i] + r[i][l - 1], max);
        }
        return max;
    }

    private static int[] capital(int[] prices) {
        int ix = 1;
        do {
            if (prices[ix] <= prices[ix - 1]) {
                ix++;
                continue;
            } else {
                ix--;
                break;
            }
        } while (ix < prices.length);
        if (ix >= prices.length) {
            return null;
        }
        int[] pricesCopy = new int[prices.length - ix];
        System.arraycopy(prices, ix, pricesCopy, 0, pricesCopy.length);
        return pricesCopy;
    }

    private static void populateCell(int[] prices, int s, int e, int[][] r) {
        r[s][s] = 0;
        int ix = s + 1;
        int mf = 0;
        if (ix > e) {
            return;
        }
        do {
            // DP
            if (r[s][ix] != 0) {
                ix++;
                continue;
            }
            if (prices[ix] > prices[ix - 1]) {
                int bix = ix - 1;
                do {
                    mf = Math.max(prices[ix] - prices[bix], mf);
                    r[bix][ix] = mf;
                    bix--;
                } while (bix >= s);
            } else {
                r[s][ix] = r[s][ix - 1];
            }
            ix++;
        } while (ix <= e);
    }
}
