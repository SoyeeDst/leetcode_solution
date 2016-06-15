package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/14.
 */
public class LeetCode91 {

    public int numDecodings(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        int l = s.length();
        if (l == 1) {
            int di = s.charAt(0) - '0';
            if (di >= 1 && di <= 26) {
                return 1;
            } else {
                return 0;
            }
        }

        Integer[][] m = new Integer[l][l];
        numDecodings(s, m, 0, l - 1);
        return m[0][l - 1];
    }

    private static void numDecodings(String s, Integer[][] r, int b, int f) {
        if (r[b][f] != null) {
            return;
        }
        if (b == f) {
            r[b][f] = 1;
            return;
        }

        r[b][b] = 1;
        int idx = b + 1;
        int nu = (s.charAt(idx - 1) - '0') * 10 + (s.charAt(idx) - '0');

        if (nu > 26) {
            numDecodings(s, r, idx, f);
            r[b][f] = r[b][b] * r[idx][f];
        } else {
            numDecodings(s, r, idx, f);
            if (idx + 1 <= f) {
                r[b][f] = r[b][b] * r[idx][f] + r[idx + 1][f];
            } else {
                r[b][f] = r[b][b] * r[idx][f] + 1;
            }
        }

    }

}
