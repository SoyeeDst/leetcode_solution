package com.freelancer.leetcode;

import java.util.BitSet;

public class LeetCode268 {

	public int missingNumber(int[] nums) {
		BitSet bs = new BitSet();
        
		for (int n : nums) {
			bs.set(n);
		}
		
		return bs.nextClearBit(0);
	}
}
