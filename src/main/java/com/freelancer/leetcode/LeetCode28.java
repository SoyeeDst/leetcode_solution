package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode28 {

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        } else if (needle.length() > haystack.length()) {
            return -1;
        } else if (needle.length() == 0) {
            return 0;
        }
        int i = 0;
        while (i < haystack.length()) {
            // find possible substring
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() > haystack.length()) {
                    return -1;
                } else if (haystack.substring(i, i + needle.length()).equals(
                        needle)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }


}
