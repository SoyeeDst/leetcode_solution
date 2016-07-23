package com.freelancer.leetcode;

import java.util.Set;

/**
 * Created by Soyee on 2016/7/22.
 */
public class LeetCode139 {

    public boolean wordBreak(String s, Set<String> wordDict) {
        if (wordDict.contains(s)) {
            return true;
        }

        int n = s.length();
        Boolean[][] throughFlags = new Boolean[n][n];
        goThrough(s, wordDict, throughFlags, 0);

        for (int ni = n - 1; ni >= 0; ni--) {
            if (throughFlags[ni][n - 1] != null && throughFlags[ni][n - 1]) {
                return true;
            }
        }
        return false;
    }

    private static void goThrough(String s, Set<String> wordDict, Boolean[][] throughFlags, int start) {
        if (start >= s.length()) {
            return;
        }
        if (throughFlags[start][s.length() - 1] != null) {
            return;
        }

        int st = start;
        int nd = start + 1;

        do {
            String clip = s.substring(st, nd);
            if (wordDict.contains(clip)) {
                throughFlags[st][nd - 1] = true;
                goThrough(s, wordDict, throughFlags, nd);
            } else {
                throughFlags[st][nd - 1] = false;
            }
            nd++;
        } while (nd <= s.length());
    }

}
