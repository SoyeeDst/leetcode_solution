package com.freelancer.leetcode;

public class FindKNumber {

	public int getKthNumber(int[] a, int[] b, int k) {
		int i = 0;
		int j = 0;
		int count = 0;
		
		while (i < a.length || j < b.length) {
			boolean isFromA = true;
			int off = 0;
			if (i < a.length && j < b.length) {
				if (a[i] >= b[j] ) {
					off = i;
					i++;
				} else {
					off = j;
					j++;
					isFromA = false; 
				}
			} else if (i >= a.length) {
				off = j;
				j++;
				isFromA = false;
			} else if (j >= a.length) {
				off = i;
				i++;
			}
			count++;
			if (count == k) {
				return isFromA ? a[off] : b[off];
			}
		}
		
		return -1;
		
	}
	
}
