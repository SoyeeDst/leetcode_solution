package com.freelancer.leetcode;

import java.util.*;

/**
 * Created by Soyee on 2016/7/10.
 */
public class LeetCode127 {

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        if (wordList.size() == 0) {
            return 0;
        }

        if (beginWord.equals(endWord)) {
            return 0;
        }

        return dijisktra(beginWord, endWord, wordList);
    }

    private static int dijisktra(String begin, String end, Set<String> wordList) {
        Map<String, Integer> sm = new HashMap<>();
        sm.put(begin, 0);
        Queue<String> queue = new ArrayDeque<>();
        queue.add(begin);

        while (!queue.isEmpty()) {
            String mw = queue.poll();
            for (int l = 0; l < mw.length(); l++) {
                StringBuilder builder = new StringBuilder(mw);
                for (char rc = 'a'; rc <= 'z'; rc++) {
                    builder.setCharAt(l, rc);
                    String nw = builder.toString();
                    if (wordList.contains(nw)) {
                        Integer old = sm.get(nw);
                        if (old == null || sm.get(mw) + 1 < old) {
                            sm.put(nw, sm.get(mw) + 1);
                            queue.add(nw);
                        }
                        continue;
                    }
                    if (nw.equals(end)) {
                        Integer old = sm.get(nw);
                        if (old == null || sm.get(mw) + 1 < old) {
                            sm.put(nw, sm.get(mw) + 1);
                        }
                    }
                }
            }
        }
        if (sm.get(end) == null) {
            return 0;
        }
        return sm.get(end) + 1;
    }
}
