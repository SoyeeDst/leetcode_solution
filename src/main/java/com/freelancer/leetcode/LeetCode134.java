package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/7/19.
 */
public class LeetCode134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cnr = gas.length;
        int[] diff = new int[cnr];
        for (int ci = 0; ci < cnr; ci++) {
            diff[ci] = gas[ci] - cost[ci];
        }

        for (int ci = 0; ci < cnr; ci++) {
            if (diff[ci] >= 0) {
                int delta = 0;
                int st = 0;
                int idx = ci;
                boolean nf = false;
                do {
                    delta = delta + diff[idx];
                    if (delta < 0) {
                        nf = true;
                        break;
                    }
                    idx++;
                    st++;
                    if (idx >= cnr) {
                        idx = idx % cnr;
                    }
                } while (st <  cnr);

                if (!nf) {
                    return ci;
                }
            }
        }
        return -1;
    }
}
