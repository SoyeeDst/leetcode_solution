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

        Integer[] maxLenArray = new Integer[A.length];
        int maxLen = Integer.MIN_VALUE;
        int index = 0;
        do {
            if (maxLenArray[index] != null) {
                if (maxLenArray[index] > maxLen) {
                    // impossible, but give it a try
                    maxLen = maxLenArray[index];
                }
                index++;
                continue;
            }
            BitSet bitSet = new BitSet(A.length);
            calculateLenForElement(index, A, maxLenArray, bitSet);
            if (maxLenArray[index] > maxLen) {
                maxLen = maxLenArray[index];
            }
            index++;
        } while (index < A.length);

        return maxLen;
    }

    private static void calculateLenForElement(int index, int []A, Integer[] maxLenArray, BitSet bitSet) {
        if (A[index] == index || bitSet.get(index)) {
            maxLenArray[index] = 0;
            return;
        }

        bitSet.set(index);
        calculateLenForElement(A[index], A, maxLenArray, bitSet);
        maxLenArray[index] = maxLenArray[A[index]] + 1;
    }
}
