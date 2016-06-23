package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/22.
 */
public class LeetCode115 {

    public int numDistinct(String S, String T) {
        int[] counts = new int[T.length()];
        for (int indexS = 0; indexS < S.length(); indexS++) {
            for (int indexT = T.length() - 1; indexT >= 0; indexT--)
                if (T.charAt(indexT) == S.charAt(indexS))
                    counts[indexT] = indexT == 0 ? counts[indexT]+1 : counts[indexT]+counts[indexT-1];
        }
        return counts[counts.length-1];
    }


}
