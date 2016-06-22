package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/22.
 */
public class LeetCode115 {

    public int numDistinct(String s, String t) {
        Integer[][] res = new Integer[s.length()][t.length()];
        return numDistinct(s, t, 0, 0, res);
    }

    private static int numDistinct(String s, String t, int b1, int b2, Integer[][] res) {
        int cnt = 0;
        int scnt = 0;
        int tcnt = 0;

        if (b1 >= s.length() && b2 >= t.length()) {
            return 1;
        }
        if (b1 >= s.length() && b2 <= t.length() - 1) {
            return 0;
        }
        if (b1 <= s.length() && b2 >= t.length()) {
            return 1;
        }

        if (res[b1][b2] != null) {
            return res[b1][b2];
        }

        if (s.length() - b1 < t.length() - b2) {
            res[b1][b2] = 0;
            return 0;
        }

        int b2i = b2;
        int tc = t.charAt(b2);
        do {
            b2i++;
            tcnt++;
        } while ((b2i < t.length() && t.charAt(b2i) == tc));

        int b1i = b1;
        int bls = b1;
        int ble = b1;
        while (b1i < s.length()) {
            if (s.charAt(b1i) == tc) {
                scnt++;
                ble = b1i;
            }
            if (scnt == tcnt) {
                bls = b1i;
            }
            b1i++;
        }

        if (scnt < tcnt) {
            res[b1][b2] = 0;
            return 0;
        }

        for (int index = bls; index <= ble; index++) {
            cnt = cnt + numDistinct(s, t, index + 1, b2 + tcnt, res);
        }
        res[b1][b2] = cnt;
        return cnt;
    }
}
