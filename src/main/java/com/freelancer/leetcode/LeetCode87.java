package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/13.
 */
public class LeetCode87 {

    public boolean isScramble(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }

        if (s1 != null && s2 != null) {
            if (s1.length() != s2.length()) {
                return false;
            }
        }

        int n = s1.length();
        if (n == 0) {
            return true;
        }

        return scramble(s1, s2, 0, n);
    }

    private static boolean scramble(String s1, String s2, int s, int l) {

        if (l == 0) {
            return true;
        }

        if (l <= 3) {
            int lt = 0;
            int tp = s;
            int rtp = s + l - 1;
            do {
                if (s1.charAt(tp) != s2.charAt(rtp)) {
                    return false;
                }
                lt++;
                tp++;
                rtp--;
            } while (lt < l);
            return true;
        } else {
            if (!scramble(s1, s2, s, l / 2)) {
                return false;
            }
            if (s1.substring(s + l / 2).equals(s2.substring(s + l / 2))) {
                return true;
            }
            return scramble(s1, s2, s + l / 2, l - (l / 2));
        }
    }
}
