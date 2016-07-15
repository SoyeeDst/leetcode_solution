package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/7/14.
 */
public class LeetCode131 {

    public List<List<String>> partition(String s) {
        if (s == null || s.equals("")) {
            return Collections.emptyList();
        }

        if (s.length() == 1) {
            return Collections.singletonList(Collections.singletonList(s));
        }

        return partitions(s, 0);
    }

    private static List<List<String>> partitions(String s, int start) {
        if (start >= s.length()) {
            return Collections.emptyList();
        }
        List<List<String>> pl = new ArrayList<>();
        int sentinel = start;
        do {
            String clip = s.substring(start, sentinel + 1);
            if (isPalindrome(clip)) {
                List<List<String>> subPls = partitions(s, sentinel + 1);
                if (subPls.isEmpty()) {
                    // it has reached to the end of this string, retain the current one
                    List<String> plAny = new ArrayList<>();
                    plAny.add(clip);
                    pl.add(plAny);
                } else {
                    for (List<String> subOption : subPls) {
                        List<String> plAny = new ArrayList<>();
                        plAny.add(clip);
                        plAny.addAll(subOption);
                        pl.add(plAny);
                    }
                }
            }
            sentinel++;
        } while (sentinel < s.length());
        return pl;
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
