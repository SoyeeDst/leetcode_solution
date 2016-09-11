package com.freelancer.leetcode;

import java.util.*;

/**
 * Created by Soyee on 2016/9/8.
 */
public class LeetCode164 {

    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
           return 0;
        }
        int maxGap = Integer.MIN_VALUE;
        Map<Integer, Integer> s2b = new HashMap<>();
        Map<Integer, Integer> b2s = new HashMap<>();
        for (int num : nums) {
            if (s2b.containsKey(num + 1)) {
                // like 2, 3 -> 5
                int oldUpperB = s2b.remove(num + 1);
                s2b.put(num, oldUpperB);
                b2s.put(oldUpperB, num);
            } else if (b2s.containsKey(num - 1)) {
                // like 5, 4 -> 2
                int oldLowerB = b2s.remove(num - 1);
                b2s.put(num, oldLowerB);
                s2b.put(oldLowerB, num);
            } else {
                s2b.put(num, num);
                b2s.put(num, num);
            }
        }

        if (s2b.size() == 1) {
            return 0;
        }

        Integer[] keys = s2b.keySet().toArray(new Integer[s2b.size()]);
        // O(nlogn ??)
        Arrays.sort(keys);
        int idx = 0;
        Integer preKey = keys[0];
        idx++;
        while (idx < keys.length) {
            Integer currentKey = keys[idx];
            int gap = currentKey - s2b.get(preKey);
            if (gap > maxGap) {
                maxGap = gap;
            }
            preKey = currentKey;
            idx++;
        }
        return maxGap;
    }
}
