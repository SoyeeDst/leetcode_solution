package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode9 {

    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        if (xStr.length() <= 1) {
            return true;
        }
        int start = 0;
        int end = xStr.length() - 1;
        while(start <= end) {
            if (xStr.charAt(start) != xStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
