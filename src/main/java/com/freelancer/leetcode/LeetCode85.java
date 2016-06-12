package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/12.
 */
public class LeetCode85 {

    public int maximalRectangle(char[][] m) {
        if (m == null || m.length == 0) {
            return 0;
        }
        int r = m.length;
        int c = m[0].length;
        int r1 = 0;
        Integer[][] res = new Integer[r][c];
        int max = 0;

        do {
            int c1 = 0;
            do {
                if (res[r1][c1] != null) {
                    c1++;
                    continue;
                }
                if (m[r1][c1] == '0') {
                    res[r1][c1] = 0;
                    c1++;
                    continue;
                }
                if (r1 + 1 < r && m[r1 + 1][c1] == '0') {
                    int c1temp = c1;
                    int hcount = 1;
                    while (c1temp + 1 < c) {
                        if (m[r1][c1temp] == '1') {
                            hcount++;
                        } else {
                            break;
                        }
                        c1temp++;
                    }
                    res[r1][c1] = hcount;
                    c1++;
                    continue;
                } else if (c1 + 1 < c && m[r1][c1 + 1] == '0') {
                    int r1temp = r1;
                    int rcount = 1;
                    while (r1temp + 1 < c) {
                        if (m[r1temp][c1] == '1') {
                            rcount++;
                        } else {
                            break;
                        }
                        r1temp++;
                    }
                    res[r1][c1] = rcount;
                    c1++;
                    continue;
                } else if (r1 + 1 < r && c1 + 1 < c) {
                    // todo blocks
                }
                c1++;
            } while (c1 < c);
            r1++;
        } while (r1 < r);

        return 0;
    }

}
