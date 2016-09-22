package com.freelancer.leetcode;

/**
 * Created by soyee on 2016/9/23.
 */
public class LeetCodeTest1V2 {

    public int solution(int M, int N) {
        if (M == 0 || N == 0) {
            return 0;
        }

        int maxNum = 0;
        int base = 1;
        while (base <= N) {
            maxNum = base;
            base = base << 1;
        }

        if (maxNum > M) {
            return 0;
        }

        return maxNum + solution(M - maxNum, N - maxNum);
    }
}
