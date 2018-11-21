package com.freelancer.leetcode;

public class LeetCode200 {

	public int numIslands(char[][] grid) {
		boolean[][] flags = new boolean[grid.length][grid[0].length];
		return scanGrid(grid, flags);
	}

	private static int scanGrid(char[][] grid, boolean[][] flags) {
		int cnt = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (!flags[i][j] && grid[i][j] == '1') {
					cnt++;
					expand(grid, i, j, flags);
				}
				flags[i][j] = true;
			}
		}
		return cnt;
	}

	private static void expand(char[][] grid, int i, int j, boolean[][] flags) {
		if (i - 1 >= 0 && grid[i - 1][j] == '1' && !flags[i - 1][j]) {
			flags[i - 1][j] = true;
			expand(grid, i - 1, j, flags);
		}
		if (i + 1 <= grid.length - 1 && grid[i + 1][j] == '1' && !flags[i + 1][j]) {
			flags[i + 1][j] = true;
			expand(grid, i + 1, j, flags);
		}
		if (j - 1 >= 0 && grid[i][j - 1] == '1' && !flags[i][j - 1]) {
			flags[i][j - 1] = true;
			expand(grid, i, j - 1, flags);
		}
		if (j + 1 <= grid[0].length - 1 && grid[i][j + 1] == '1' && !flags[i][j + 1]) {
			flags[i][j + 1] = true;
			expand(grid, i, j + 1, flags);
		}
	}

}
