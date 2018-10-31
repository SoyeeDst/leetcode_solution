package com.freelancer.leetcode;

public class LeetCode279 {

	public int numSquares(int n) {
		return numOfSquares(n, new int[n + 1]);
	}

	public static int numOfSquares(int n, int[] dp) {
		if (n == 0)
			return 0;
        
		if (dp[n] != 0) {
			return dp[n];
		}
		
		int min = n;
		for(int i = 1; i <= Math.sqrt(n); i++) 
			min = Math.min(min, 1 + numOfSquares(n - i*i, dp)); 

		dp[n] = min;
		
		return dp[n];
	}

}
