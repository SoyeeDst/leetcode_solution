package com.freelancer.leetcode;

import com.freelancer.leetcode.support.Point;

/**
 * Created by Soyee on 2016/7/27.
 */
public class LeetCode149 {

    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        int pl = points.length;
        Integer[][] ml = new Integer[pl][pl];
        int max = 1;

        // List should be used to degrade time complexity
        int idx = 0;
        // O(N ^ 3)
        do {
            ml[idx][idx] = 1;
            for (int nix = 0; nix < idx; nix++) {
                for (int niix = nix; niix < idx; niix++) {
                    if (ml[nix][niix] != null) {
                        // Try to expand the current range, if yes, ignore some intermediate points
                        if (straightLine(nix, niix, idx, points)) {
                            ml[nix][idx] = Math.max(ml[nix][idx] == null ? 0 : ml[nix][idx], ml[nix][niix] + 1);
                            // Reset, otherwise duplicate calculation will not prevented.
                            if (nix != niix && ml[nix][idx] == ml[nix][niix] + 1) {
                                ml[nix][niix] = null;
                            }
                            if (ml[nix][idx] > max) {
                                max = ml[nix][idx];
                            }
                        }
                    }
                }
            }
            idx++;
        } while (idx < pl);

        return max;
    }

    public static boolean straightLine(int bix, int mix, int eix, Point[] points) {
        Point bp = points[bix];
        Point mp = points[mix];
        Point ep = points[eix];
        int x1 = Math.abs(bp.x - mp.x);
        int x11 = Math.abs(bp.y - mp.y);
        int x2 = Math.abs(mp.x - ep.x);
        int x21 = Math.abs(mp.y - ep.y);
        return x1 * x21 == x2 * x11;
    }
}
