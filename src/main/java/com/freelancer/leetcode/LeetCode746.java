package com.freelancer.leetcode;

public class LeetCode746 {

	public int minCostClimbingStairs(int[] cost) {
       if (cost == null || cost.length == 0) {
    	   return 0;
       }
       
       int[] x = new int[cost.length + 1];
       x[0] = cost[0];
       x[1] = cost[1];
       
       if (cost.length <= 2) {
    	   return x[cost.length - 1];
       }
       
       for (int i = 2; i < cost.length; i++) {
    	   x[i] = Math.min(x[i - 1] + cost[i], x[i - 2] + cost[i]);
       }
       
       return Math.min(x[cost.length - 2], x[cost.length - 1]);
	}

}
