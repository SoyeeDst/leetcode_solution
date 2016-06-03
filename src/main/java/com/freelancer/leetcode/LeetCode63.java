package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowCount = obstacleGrid.length;
        int colCount = obstacleGrid[0].length;
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int[][] numOfPaths = new int[rowCount][colCount];

        // edge case
        numOfPaths[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int index1 = 1; index1 < rowCount; index1++) {
            if (obstacleGrid[index1][0] == 1) {
                numOfPaths[index1][0] = 0;
            } else {
                numOfPaths[index1][0] = numOfPaths[index1 - 1][0];
            }
        }
        for (int index2 = 1; index2  < colCount; index2++) {
            if (obstacleGrid[0][index2] == 1) {
                numOfPaths[0][index2] = 0;
            } else {
                numOfPaths[0][index2] = numOfPaths[0][index2 - 1];
            }
        }

        // dp algorithm
        for (int index1 = 1; index1 < rowCount; index1++) {
            for (int index2 = 1; index2 < colCount; index2++) {
                if (obstacleGrid[index1][index2] == 1) {
                    numOfPaths[index1][index2] = 0;
                } else {
                    numOfPaths[index1][index2] = numOfPaths[index1 - 1][index2] + numOfPaths[index1][index2 - 1];
                }
            }
        }
        return numOfPaths[rowCount - 1][colCount - 1];
    }

}
