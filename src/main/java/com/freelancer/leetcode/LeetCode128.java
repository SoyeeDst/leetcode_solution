package com.freelancer.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Soyee on 2016/7/11.
 */
public class LeetCode128 {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int mt = Integer.MIN_VALUE;
        Set<Integer> ds = new HashSet<>();
        for (int n : nums) {
            ds.add(n);
        }

        Iterator<Integer> iterator = ds.iterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            ds.remove(i);
            int c = i;
            int x = 1;
            while(ds.contains(++c)) {
                ds.remove(c);
                x++;
            }
            c = i;
            while(ds.contains(--c)) {
                ds.remove(c);
                x++;
            }
            if (x > mt) {
                mt = x;
            }
            // reassign
            iterator = ds.iterator();
        }
        return mt;
    }
}
