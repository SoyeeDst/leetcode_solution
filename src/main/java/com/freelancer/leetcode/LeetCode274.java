package com.freelancer.leetcode;

import java.util.Arrays;

public class LeetCode274 {

	public int hIndex(int[] citations) {
		Arrays.sort(citations);

		int i = 0, j = citations.length - 1;

		// binary search
		while (i <= j) {
			int mid = (i + j) / 2;

			if (citations[mid] >= citations.length - mid) {
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		
		return citations.length - i;
	}

}
