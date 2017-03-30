package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode60 {

	static int[] maxCnt = new int[10];

	static {
		maxCnt[0] = 0;
		maxCnt[1] = 1;
		for (int i = 2; i <= 9; i++) {
			maxCnt[i] = maxCnt[i - 1] * i;
		}
	}

	public String getPermutation(int n, int k) {
		List<Integer> x = new ArrayList<>();
		for (int in = 0; in < n; in++) {
			x.add(in + 1);
		}
		StringBuffer sb = new StringBuffer("");
		int o = 1;
		while (o < n) {
			int y = find(n, k, o);
			k = k - y * maxCnt[n - o];
			sb.append(getAndRemoveNumber(x, y));
			o++;
		}

		// the left one
		sb.append(getAndRemoveNumber(x, 0));
		return sb.toString();
	}

	private static int find(int n, int k, int j) {
		int y = maxCnt[n - j];
		int of = 0;

		while (true) {
			if (y * of <= k && y * (of + 1) >= k) {
				break;
			}
			of++;
		}
		return of;
	}

	private static int getAndRemoveNumber(List<Integer> x, int y) {
		int z = x.get(y);
		x.remove(y);
		return z;
	}

}
