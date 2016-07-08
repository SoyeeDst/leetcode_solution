package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/5.
 */
public class LeetCode125 {

    public boolean isPalindrome(String s) {
        if (s == null || s.equals("")) {
            return true;
        }
        String ls = s.toLowerCase();
        int i = 0;
        int j = ls.length() - 1;
        while (i < j) {
            Character ic = ls.charAt(i);
            while(i < j && !isAlphaNumberic(ic)) {
                i++;
                ic = ls.charAt(i);
            }

            if (i >= j) {
                return true;
            }

            Character jc = ls.charAt(j);
            while (i < j && !isAlphaNumberic(jc)) {
                j--;
                jc = ls.charAt(j);
            }

            if (i >= j) {
                return true;
            }

            if (ic == jc) {
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }

    private static boolean isAlphaNumberic(char s) {
        if (s >= 'a' && s <= 'z') {
            return true;
        }
        if (s >= '0' && s <= '9') {
            return true;
        }
        return false;
    }
}
