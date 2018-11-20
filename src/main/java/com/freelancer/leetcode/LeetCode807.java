package com.freelancer.leetcode;

public class LeetCode807 {

	public int maxIncreaseKeepingSkyline(int[][] grid) {
		if (grid == null) {
			return 0;
		}
		
		if (grid.length == 0 && grid[0].length == 0) {
			return 0;
		}
		
		int inc = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				inc = inc + getCellIncrease(grid, i, j);
			}
		}
	    return inc;
	}
	
	private static int getCellIncrease(int[][] grid, int i, int j) {
		int max1 = 0;
		int max2 = 0;
		for (int jt = 0; jt < grid[0].length; jt++) {
			max1 = Math.max(max1, grid[i][jt]);
		}
		
		for (int it = 0; it < grid.length; it++) {
			max2 = Math.max(max2, grid[it][j]);
		}
		
		return Math.min(max1, max2) - grid[i][j];
	}

}
