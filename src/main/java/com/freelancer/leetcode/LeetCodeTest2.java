package com.freelancer.leetcode;

import java.util.BitSet;
import java.util.Stack;

/**
 * Created by Soyee on 2016/8/3.
 */
public class LeetCodeTest2 {

    public int solution(int[] A) {
        if (A == null || A.length == 0 || A.length == 1) {
            return 0;
        }

        int maxLen = Integer.MIN_VALUE;
        int index = 0;
        BitSet bitSet = new BitSet(A.length);
        do {
            if (bitSet.get(index)) {
                index++;
                continue;
            }
            int length = calculateLenForElement(index, A, bitSet);
            if (length > maxLen) {
                maxLen = length;
            }
            index++;
        } while (index < A.length);

        return maxLen;
    }

    private static int calculateLenForElement(int index, int []A, BitSet bitSet) {
        if (A[index] == index) {
            return 0;
        }

        int cnt = 0;
        while (!bitSet.get(index)) {
            bitSet.set(index);
            index = A[index];
            cnt++;
        }
        return cnt;
    }
}
