package com.freelancer.leetcode;

import java.util.Arrays;

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
        int b1i = b1;
        int scnt = 0;
        int tcnt = 0;

        int tc = t.charAt(b2);
        do {
            b2i++;
            tcnt++;
        } while ((b2i < t.length() && t.charAt(b2i) == tc));

        char[] chars = new char[tcnt];
        Arrays.fill(chars, t.charAt(b2));
        String ms = new String(chars);

        while (b1i <= s.lastIndexOf(tc, b1 + 1)) {
            if (s.charAt(b1i) == tc) {
                scnt++;
            }
            b1i++;
        }

        if (scnt < tcnt) {
            res[b1][b2] = 0;
            return 0;
        }

        // c x
        long x = 1;
        long y = 1;
        for (int i = scnt; i > (scnt - tcnt); i--) {
            x = x * i;
        }
        for (int i = 2; i <= tcnt; i++) {
            y = y * i;
        }

        int tcnt2 = (int) (x / y);
        cnt = cnt + tcnt2 * numDistinct(s, t, b1i, b2 + tcnt, res);

        System.err.println("------------------------- cnt -----------------------------" + cnt);

        // further counts which is not located at the beginning of s
        int ps = b1 + 1;
        int loc;

        if ((loc = s.indexOf(ms, ps)) >= 0) {
            int delta = numDistinct(s, t, loc, b2, res);
            cnt = cnt + delta;
            System.err.println("------------------------- cnt -----------------------------, delta, " + cnt + "," + delta);
        }
        res[b1][b2] = cnt;

        return cnt;
    }
}
