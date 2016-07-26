package com.freelancer.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Soyee on 2016/7/26.
 */
public class LeetCode146 {

    private Map<Integer, Integer> dataMap = null;

    public LeetCode146(final int capacity) {
        dataMap = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (dataMap.containsKey(key)) {
            return dataMap.get(key);
        }
        return -1;
    }

    public void set(int key, int value) {
        dataMap.put(key, value);
    }
}
