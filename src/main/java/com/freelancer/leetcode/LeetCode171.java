package com.freelancer.leetcode;

public class LeetCode171 {

	public int titleToNumber(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}

		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			number = number * 26 + (s.charAt(i) - 'A' + 1);
		}
		return number;
	}
}
