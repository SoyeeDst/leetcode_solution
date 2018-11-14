package com.freelancer.leetcode;

public class LeetCode397 {

	public int integerReplacement(int n) {
        if (n == 1) {
        	return 0;
        }
        
        Integer[] steps = new Integer[n + 2];
        steps[1] = 0;
        
        doReplace(n, steps);
        
        return steps[n];
	}
	
	private static Integer doReplace(int n, Integer[] steps) {
		if (steps[n] != null) {
			return steps[n];
		}
		
		if (n % 2 == 0) {
			steps[n] = doReplace(n / 2, steps) + 1;
		} else {
			steps[n] = Math.min(doReplace(n + 1, steps) + 1, doReplace(n - 1, steps) + 1);
		}
		
		return steps[n];
	}

}
