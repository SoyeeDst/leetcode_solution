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

        int i1 = 0;
        int i2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        boolean lst = true;
        boolean stlst = true;

        do {
            if (i1 < 0 || i2 < 0) {
                return false;
            }

            if (i1 > i1l - 1) {
                lst = false;
            } else if (i2 > i2l - 1) {
                lst = true;
            }
            if (lst && s3.charAt(cnt1 + cnt2) == s1.charAt(i1)) {
                cnt1++;
                i1++;
                stlst = true;
            } else if (!lst && s3.charAt(cnt1 + cnt2) == s2.charAt(i2)) {
                cnt2++;
                i2++;
                stlst = false;
            } else {
                char mc = s3.charAt(cnt1 + cnt2);
                lst = !lst;
                if (stlst) {
                    boolean got = false;
                    i2 = Math.min(i2, i2l - 1);
                    do {
                        if (mc == s2.charAt(i2)) {
                            got = true;
                            i2++;
                            cnt2++;
                            stlst = false;
                            break;
                        }
                        i1--;
                        cnt1--;
                        i2++;
                        if (i2 > cnt2 - 1) {
                            break;
                        }
                    } while((i1 >= 0 && i2 <= cnt2 - 1));

                    if (!got) {
                        return false;
                    }
                } else {
                    boolean got = false;
                    i1 = Math.min(i1, i1l - 1);
                    do {
                        if (mc == s1.charAt(i1)) {
                            got = true;
                            i1++;
                            cnt1++;
                            stlst = true;
                            break;
                        }
                        i1++;
                        cnt2--;
                        i2--;
                        if (i1 > cnt1 - 1) {
                            break;
                        }
                    } while (i2 >= 0 && i1 <= cnt1 - 1);

                    if (!got) {
                        return false;
                    }
                }
            }
        } while (cnt1 + cnt2 < i1l + i2l);

        return true;
    }
}
