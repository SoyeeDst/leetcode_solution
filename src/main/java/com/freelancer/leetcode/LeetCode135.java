package com.freelancer.leetcode;

import java.util.Arrays;

/**
 * Created by Soyee on 2016/7/18.
 */
public class LeetCode135 {

    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
           return 0;
        }

        if (ratings.length == 1) {
            return 1;
        }

        int[] mc = new int[ratings.length];
        Arrays.fill(mc, 1);

        populateCandy(mc, ratings);

        int sum = 0;
        for (int idx = 0; idx < ratings.length; idx++) {
            sum += mc[idx];
        }
        return sum;
    }

    private static void populateCandy(int[] mc, int []rats) {
        int s = 1;
        do {
            Integer e = null;
            Integer st = null;
            do {
                if (rats[s - 1] > rats[s]) {
                    if (st == null) {
                        st = s - 1;
                    }
                    e = s;
                    s++;
                    continue;
                } else {
                    break;
                }
            } while (s < rats.length);

            if (st != null) {
                for (int i = st; i <= e; i++) {
                    mc[i] += (e - i);
                }
            }

            if (s >= rats.length) {
                break;
            }

            do {
               if (rats[s - 1] < rats[s]) {
                   mc[s] = mc[s - 1] + 1;
                   s++;
               } else if (rats[s - 1] == rats[s]) {
                   s++;
               } else {
                   s++;
                   break;
               }
            } while (s < rats.length);

        } while (s < rats.length);

    }
}
