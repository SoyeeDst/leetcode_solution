package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0, j = 1;
        for (int i = 0; i < s.length(); i++) {
            for (; j <= s.length(); j++) {
                if (i == j) continue;
                String sub = s.substring(i, j);
                if (sub.indexOf(s.charAt(j-1)) == sub.length() - 1) {
                    if (max < j - i) {
                        max = j - i;
                    }
                }
                else {
                    break;
                }
            }
        }
        return max;
    }

}
