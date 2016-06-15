package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/14.
 */
public class LeetCode91 {

    public int numDecodings(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        int l = s.length();
        if (l == 1) {
            int di = s.charAt(0) - '0';
            if (di >= 1 && di <= 26) {
                return 1;
            } else {
                return 0;
            }
        }

        if (s.charAt(0) == '0') {
            return 0;
        }

        Integer[][] m = new Integer[l][l];
        int r = numDecodings(s, m, 0, l - 1);
        return r == -1 ? 0 : (m[0][l - 1]);
    }

    private static int numDecodings(String s, Integer[][] r, int b, int f) {
        if (b == f) {
            if (s.charAt(b) != '0') {
                r[b][f] = 1;
            } else {
                r[b][f] = 0;
            }
            return r[b][f];
        }

        if (b > f) {
            // no impact
            return 0;
        }

        if (r[b][f] != null) {
            return r[b][f];
        }

        if (s.charAt(b) == '0') {
            return -1;
        }

        r[b][b] = 1;
        int idx = b + 1;
        int nu = (s.charAt(idx - 1) - '0') * 10 + (s.charAt(idx) - '0');

        if (nu > 26) {
            if (s.charAt(idx) == '0') {
                r[b][idx] = 0;
                return -1;
            } else {
                int rs = numDecodings(s, r, idx, f);
                if (rs == -1) {
                    return -1;
                }
                r[b][f] = r[b][b] * rs;
            }
        } else {
            int sp = idx;
            boolean skip = false;
            if (s.charAt(idx) == '0') {
                sp = idx + 1;
                skip = true;
            }
            if (sp > f) {
                r[b][f] = r[b][b] * 1;
                if (!skip) {
                    r[b][f] += 1;
                }
                return r[b][f];
            }

            int rs = numDecodings(s, r, sp, f);
            if (rs == -1) {
                return -1;
            }

            if (skip) {
                r[b][f] = r[b][b] * rs;
                return r[b][f];
            }

            int rs1;
            if (sp + 1 > f && rs != 0) {
                rs1 = 1;
            } else {
                rs1 = numDecodings(s, r, sp + 1, f);
            }
            if (rs1 == -1) {
                return -1;
            }
            r[b][f] = r[b][b] * rs + rs1;

        }

        return r[b][f];

    }

}
