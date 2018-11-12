package com.freelancer.leetcode;

/**
 * Created by Soyee on 2018/11/12
 */
public class LeetCode354 {

	public int maxEnvelopes(int[][] envelopes) {
		if (envelopes == null || envelopes.length == 0) {
			return 0;
		}

		Integer[] res = new Integer[envelopes.length];

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < envelopes.length; i++) {
			int t = getMaxEnvelopes(envelopes, res, i);
			max = Math.max(max, t);
		}

		return max;
	}

	private static int getMaxEnvelopes(int[][] es, Integer[] res, int ox) {
        if (res[ox] != null) {
        	return res[ox];
        }
        
        int t = 1;
        int w = es[ox][0];
        int h = es[ox][1];
        
        for (int i = 0; i < res.length; i++) {
        	if (i == ox) {
        		continue;
        	}
        	
        	if (es[i][0] > w && es[i][1] > h) {
        		int x = getMaxEnvelopes(es, res, i) + 1;
        		t = Math.max(t, x);
        	}
        }
        
        res[ox] = t;
        return t;
	}

}
