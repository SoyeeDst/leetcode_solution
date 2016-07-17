package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/17.
 */
public class LeetCode132 {

    public int minCut(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        if (s.length() == 1) {
            return 0;
        }

        if (isPalindrome(s)) {
            return 0;
        }

        Integer[][] m = new Integer[s.length()][s.length()];
        return minParts(s, 0, s.length() - 1, m) - 1;
    }

    private static int minParts(String s, int start, int end, Integer[][] m) {
        if (m[start][end] != null) {
            return m[start][end];
        }
        if (isPalindrome(s.substring(start, end + 1))) {
            m[start][end] = 1;
            return 1;
        }
        int mc = Integer.MAX_VALUE;
        int sentinel = end;
        do {
            String clip = s.substring(start, sentinel + 1);
            if (isPalindrome(clip)) {
                int parts = minParts(s, sentinel + 1, end, m);

                if (parts + 1 < mc) {
                    mc = parts + 1;
                }

                if (parts == 1) {
                    break;
                }
            }
            sentinel--;
        } while (sentinel >= start);
        m[start][end] = mc;
        return mc;
    }

    private static boolean isPalindrome(String part) {
        if (part.length() == 1) {
            return true;
        }
        int start = 0;
        int end = part.length() - 1;
        while(start <= end) {
            if (part.charAt(start) != part.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
