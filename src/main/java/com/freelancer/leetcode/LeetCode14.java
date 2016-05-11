package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int commonLength = 0;
        int maxLength = 0;
        for (String str : strs) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        for (int index = 0; index < maxLength; index++) {
            boolean isQuit = false;
            for (int strIndex = 0; strIndex < strs.length - 1; strIndex++) {
                if (strs[strIndex].length() < commonLength + 1) {
                    isQuit = true;
                    break;
                }
                if (strs[strIndex + 1].length() < commonLength + 1) {
                    isQuit = true;
                    break;
                }
                if (strs[strIndex].charAt(commonLength) != strs[strIndex + 1]
                        .charAt(commonLength)) {
                    isQuit = true;
                    break;
                }
            }
            if (!isQuit) {
                commonLength = commonLength + 1;
            } else {
                break;
            }
        }
        if (commonLength >= 1) {
            return strs[0].substring(0, commonLength);
        } else {
            return "";
        }
    }


}
