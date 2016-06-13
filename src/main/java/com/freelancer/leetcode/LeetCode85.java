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
        int ma = 0;

        do {
            int c1 = 0;
            do {
                if (m[r1][c1] == 0) {
                    c1++;
                    continue;
                } else {
                    int ct = c1;

                    while (ct < c && m[r1][ct] != '0') {
                        ct++;
                    }

                    ct--;

                    // maxCols get
                    for (int ii = ct; ii >= c1; ii--) {
                        int rs = r1 + 1;
                        while (rs < r) {
                            int ct2 = ii;
                            do {
                                if (m[rs][ct2] == '0') {
                                    break;
                                }
                                ct2--;
                            } while (ct2 >= c1);

                            if (ct2 < c1) {
                                rs++;
                            } else {
                                break;
                            }
                        }

                        int mp = (rs - r1) * (ii - c1 + 1);
                        if (mp > ma) {
                            ma = mp;
                        }

                        if (rs == r) {
                            break;
                        }

                    }
                }
                c1++;
            } while (c1 < c);
            r1++;
        } while (r1 < r);
        return ma;
    }

}
