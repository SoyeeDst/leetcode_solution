package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/15.
 */
public class LeetCode97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1 == null || s1.equals("")) {
            return s2.equals(s3);
        }
        if (s2 == null || s2.equals("")) {
            return s1.equals(s3);
        }

        int i1l = s1.length();
        int i2l = s2.length();
        int i3l = s3.length();

        if (i1l + i2l != i3l) {
            return false;
        }

        int i3 = 0;
        Boolean[][] res = new Boolean[i1l + 1][i2l + 1];

        do {
            if (i3 == 0) {
                boolean got = false;
                if (s3.charAt(i3) == s1.charAt(0)) {
                    res[1][0] = true;
                    got = true;
                }
                if (s3.charAt(i3) == s2.charAt(0)) {
                    res[0][1] = true;
                    got = true;
                }

                if (!got) {
                    return false;
                }

            } else {
                int t = Math.min(i3, i1l);
                boolean got = false;
                do {
                    if (i3 - t <= i2l && res[t][i3 - t] != null && res[t][i3 - t]) {
                        if (t < i1l && s3.charAt(i3) == s1.charAt(t)) {
                            res[t + 1][i3 - t] = true;
                            got = true;
                        }
                        if (i3 - t < i2l && s3.charAt(i3) == s2.charAt(i3 - t)) {
                            res[t][i3 - t + 1] = true;
                            got = true;
                        }
                    }
                    t--;
                } while (t >= 0);

                if (!got) {
                    return false;
                }
            }
            i3++;
        } while (i3 < i3l);

        return true;
    }
}
