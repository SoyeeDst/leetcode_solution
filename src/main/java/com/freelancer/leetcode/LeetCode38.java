package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/23.
 */
public class LeetCode38 {

    private static final String START_POINT = "1";

    public String countAndSay(int n) {
        if (n <= 0) {
            return null;
        }
        if (n == 1) {
            return START_POINT;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        String subValue = countAndSay(n - 1);
        int index = 0;
        while (index < subValue.length()) {
           int count = 1;
           int index2 = index + 1;
           while (index2 < subValue.length()) {
               if (subValue.charAt(index2) == subValue.charAt(index)) {
                   count++;
                   index2++;
                   index++;
               } else {
                   break;
               }
           }
           stringBuffer.append(count).append(subValue.charAt(index));
           index++;
        }
        return stringBuffer.toString();
    }
}
