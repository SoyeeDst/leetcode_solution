package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by Soyee on 2016/7/22.
 */
public class LeetCode140 {

    public List<String> wordBreak(String s, Set<String> wordDict) {
        Boolean[][] throughFlags = new Boolean[s.length()][s.length()];
        return wordBreak(s, wordDict, 0, throughFlags);
    }

    private static List<String> wordBreak(String s, Set<String> wordDict, int start, Boolean[][] throughFlags) {
        if (start >= s.length()) {
            return null;
        }

        if (throughFlags[start][s.length() - 1] != null && !throughFlags[start][s.length() - 1]) {
            return Collections.emptyList();
        }

        // Calculate by recursive matching
        List<String> pl = new ArrayList<>();
        int sentinel = start;
        do {
            boolean oJ = false;
            String clip = s.substring(start, sentinel + 1);
            if (wordDict.contains(clip)) {
                List<String> subPls = wordBreak(s, wordDict, sentinel + 1, throughFlags);
                if (subPls == null) {
                    // it has reached to the end of this string, retain the current one
                    pl.add(clip);
                } else {
                    for (String subOption : subPls) {
                        pl.add(clip + " " + subOption);
                    }
                }
                if (subPls == null || !subPls.isEmpty()) {
                    oJ = true;
                }
            }
            if (throughFlags[start][s.length() - 1] == null) {
                throughFlags[start][s.length() - 1] = oJ;
            } else {
                throughFlags[start][s.length() - 1] = throughFlags[start][s.length() - 1] | oJ;
            }
            sentinel++;
        } while (sentinel < s.length());

        return pl;
    }
}
