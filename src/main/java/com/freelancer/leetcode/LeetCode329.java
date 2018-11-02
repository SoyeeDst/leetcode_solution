package com.freelancer.leetcode;

public class LeetCode329 {

	public int longestIncreasingPath(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}

		int n = matrix.length;
		int m = matrix[0].length;

		Integer[][] res = new Integer[n][m];

		int r = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int t = dpLongestPath(matrix, i, j, res);
				if (t > r) {
					r = t;
				}
			}

		}

		return r;
	}

	private static Integer dpLongestPath(int[][] matrix, int sr, int sc, Integer[][] res) {
		if (sr < 0 || sr >= matrix.length) {
			return 0;
		}

		if (sc < 0 || sc >= matrix[0].length) {
			return 0;
		}

		if (res[sr][sc] != null) {
			return res[sr][sc];
		}

		int xmax = 1;
		if (sc + 1 < matrix[0].length && matrix[sr][sc + 1] > matrix[sr][sc]) {
			xmax = dpLongestPath(matrix, sr, sc + 1, res) + 1;
		}

		int smax = 1;
		if (sc - 1 >= 0 && matrix[sr][sc - 1] > matrix[sr][sc]) {
			smax = dpLongestPath(matrix, sr, sc - 1, res) + 1;
		}

		int zmax = 1;
		if (sr - 1 >= 0 && matrix[sr - 1][sc] > matrix[sr][sc]) {
			zmax = dpLongestPath(matrix, sr - 1, sc, res) + 1;
		}

		int ymax = 1;
		if (sr + 1 < matrix.length && matrix[sr + 1][sc] > matrix[sr][sc]) {
			ymax = dpLongestPath(matrix, sr + 1, sc, res) + 1;
		}

		int max = Math.max(zmax, Math.max(Math.max(xmax, smax), ymax));
		res[sr][sc] = max;
		return max;

	}

}
