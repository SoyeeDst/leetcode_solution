package com.freelancer.leetcode;

public class LeetCode240 {

	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length <= 0) return false;
        return helper(matrix, target, 0, matrix[0].length-1);
    }
    
    private boolean helper(int[][] matrix, int target, int i, int j) {
        if (i < matrix.length && j >= 0) {
            int curr = matrix[i][j];
            if (curr == target) return true;
            else if (curr >= target) return helper(matrix, target, i, j-1);
            else return helper(matrix, target, i+1, j);
        } else return false;
    }

}
