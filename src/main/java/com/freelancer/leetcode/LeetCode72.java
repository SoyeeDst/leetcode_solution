package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/7.
 */
public class LeetCode72 {

    // DP
    public int minDistance(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return 0;
        }
        if ((word1 == null || word1.equals("")) && word2 != null) {
            return word2.length();
        }
        if (word1 != null && (word2 == null || word2.equals(""))) {
            return word1.length();
        }
        if (word1.equals(word2)) {
            return 0;
        }
        int n = word1.length();
        int m = word2.length();
        Integer[][] result = minDistanceForCluster(word1, word2);
        return result[n - 1][m - 1];
    }

    private static Integer[][] minDistanceForCluster(String word1, String word2) {
        int i = word1.length();
        int j = word2.length();
        Integer[][] result = new Integer[i][j];

        // initialize edge case
        result[0][0] = (word1.charAt(0) == word2.charAt(0)) ? 0 : 1;
        int row0Pos = word2.indexOf(word1.charAt(0));
        for (int colIndex = 1; colIndex < j; colIndex++) {
            if (colIndex == row0Pos) {
                result[0][colIndex] = result[0][colIndex - 1];
            } else {
                result[0][colIndex] = result[0][colIndex - 1] + 1;
            }
        }

        int col0Pos = word1.indexOf(word2.charAt(0));
        for (int rowIndex = 1; rowIndex < i; rowIndex++) {
            if (rowIndex == col0Pos) {
                result[rowIndex][0] = result[rowIndex - 1][0];
            } else {
                result[rowIndex][0] = result[rowIndex - 1][0] + 1;
            }
        }

        // regular checking
        int index = 1;
        while (index < i) {
            int index2 = 1;
            while (index2 < j) {
                if (result[index][index2] != null) {
                    index2++;
                    continue;
                }
                int minPath;
                minPath = Math.min(result[index - 1][index2] + 1, result[index][index2 - 1] + 1);
                if (word1.charAt(index) == word2.charAt(index2)) {
                    minPath = Math.min(minPath, result[index - 1][index2 - 1]);
                } else {
                    minPath = Math.min(minPath, result[index - 1][index2 - 1] + 1);
                }
                result[index][index2] = minPath;
                index2++;
            }
            index++;
        }
        return result;
    }
}
