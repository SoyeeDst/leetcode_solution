package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/6/15.
 */
public class LeetCode93 {

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() <= 3 || s.length() > 12) {
            return Collections.emptyList();
        }
        List<String> al = new ArrayList<>();
        int i1l = 1;
        do {
            if (!validate(s, 0, i1l)) {
                i1l++;
                continue;
            }
            int i2l = 1;
            do {
                if (s.length() - (i1l) > 3 * 3) {
                    break;
                }
                if (!validate(s, i1l, i2l)) {
                    i2l++;
                    continue;
                }
                int i3l = 1;
                do {
                    if (s.length() - (i1l + i2l) > 3 * 2) {
                        break;
                    }
                    if (!validate(s, i1l + i2l, i3l)) {
                        i3l++;
                        continue;
                    }
                    if (s.length() - (i1l + i2l + i3l) > 3) {
                        i3l++;
                        continue;
                    }
                    if (!validate(s, i1l + i2l + i3l, 0)) {
                        i3l++;
                        continue;
                    }
                    oneOptions(s, i1l, i2l, i3l, al);
                    i3l++;
                } while (i3l <= 3);
                i2l++;
            } while (i2l <= 3);
            i1l++;
        } while (i1l <= 3);

        return al;
    }

    private static boolean validate(String s, int start, int length) {
        String clip;
        if (length == 0) {
            if (start > s.length() - 1) {
                return false;
            }
            clip = s.substring(start);
        } else {
            if (start > s.length() - 1 || start + length > s.length()) {
                return false;
            }
            clip = s.substring(start, start + length);
        }
        if (clip == null || clip.length() == 0) {
            return false;
        }
        if (clip.charAt(0) == '0' && clip.length() > 1) {
            return false;
        }
        return Integer.parseInt(clip) < 256;
    }

    private static void oneOptions(String s, int i1l, int i2l, int i3l, List<String> resList) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s.substring(0, i1l));
        stringBuffer.append(".");
        stringBuffer.append(s.substring(i1l, i1l + i2l));
        stringBuffer.append(".");
        stringBuffer.append(s.substring(i1l + i2l, i1l + i2l + i3l));
        stringBuffer.append(".");
        stringBuffer.append(s.substring(i1l + i2l + i3l));
        resList.add(stringBuffer.toString());
    }

}
