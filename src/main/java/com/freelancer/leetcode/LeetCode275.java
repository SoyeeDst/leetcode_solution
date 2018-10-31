package com.freelancer.leetcode;

public class LeetCode275 {

	public int hIndex(int[] citations) {
		
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
