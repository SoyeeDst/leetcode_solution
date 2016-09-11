package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/9/11.
 */
public class LeetCode165 {
    public int compareVersion(String version1, String version2) {
       if (version1.equals("") && version2.equals("")) {
           return 0;
       }
       int mV1 = 0;
       String subV1 = "";
       int mV2 = 0;
       String subV2 = "";
       if (!version1.equals("")) {
           if (version1.indexOf(".") < 0) {
               mV1 = Integer.parseInt(version1);
           } else {
               mV1 = Integer.parseInt(version1.substring(0, version1.indexOf(".")));
               subV1 = version1.substring(version1.indexOf(".") + 1);
           }
       }
       if (!version2.equals("")) {
           if (version2.indexOf(".") < 0) {
               mV2 = Integer.parseInt(version2);
           } else {
               mV2 = Integer.parseInt(version2.substring(0, version2.indexOf(".")));
               subV2 = version2.substring(version2.indexOf(".") + 1);
           }
       }
       if (mV1 < mV2) {
           return -1;
       }
       if (mV1 > mV2) {
           return 1;
       }
       return compareVersion(subV1, subV2);
    }
}
