package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode62 {

    public int uniquePaths(int m, int n) {
        if (m + n <= 2) {
            return 1;
        }
        int totalSteps = m + n - 2;
        int min = Math.min(m - 1, n - 1);
        Long totalMulti = 1L;
        int startIndex = totalSteps - min + 1;
        while (startIndex <= totalSteps) {
            totalMulti = totalMulti * startIndex;
            startIndex++;
        }
        Long divisor = 1L;
        startIndex = 2;
        while (startIndex <= min) {
            divisor = divisor * startIndex;
            startIndex++;
        }
        return (int)(totalMulti / divisor);
    }
}
