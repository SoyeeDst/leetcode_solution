package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/13.
 */
public class LeetCode87 {

	public boolean isScramble(String s1, String s2) {
		if (s1 == null && s2 == null) {
			return true;
		}

		if (s1 != null && s2 != null) {
			if (s1.length() != s2.length()) {
				return false;
			}
		}

		int n = s1.length();
		if (n == 0) {
			return true;
		}

		return scramble(s1, s2, n);
	}

	private static boolean scramble(String s1, String s2, int l) {

		if (l == 0) {
			return true;
		}

		String p1 = s1.substring(0, l / 2);
		String p2 = s1.substring(l / 2);
		if (s1.equals(s2) || s2.equals(p2 + p1)) {
			return true;
		}

		return scramble(p1, s2.substring(0, l / 2), l / 2) && scramble(p2, s2.substring(l / 2), l - l / 2);
	}
}
