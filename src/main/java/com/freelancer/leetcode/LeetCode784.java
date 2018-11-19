package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode784 {

	public List<String> letterCasePermutation(String S) {
		if (S == null) {
			return Collections.emptyList();
		}

		List<String> a = new ArrayList<>();
		a.add(S);

		for (int s = 0; s < S.length(); s++) {
			char t = S.charAt(s);
			if ((t >= 'a' && t <= 'z') || (t >= 'A' && t <= 'Z')) {
				List<String> subList = new ArrayList<>();
				for (int j = 0; j < a.size(); j++) {
					subList.add(convert(a.get(j), s, t));
				}
				a.addAll(subList);
			}
		}
		return a;
	}

	private static String convert(String str, int j, char chr) {
		String clip;
		if (chr >= 'a' && chr <= 'z') {
			clip = new String(new char[] { chr }).toUpperCase();
		} else {
			clip = new String(new char[] { chr }).toLowerCase();
		}

		String before = "";
		String after = "";
		if (j != 0) {
			before = str.substring(0, j);
		}

		if (j != str.length() - 1) {
			after = str.substring(j + 1);
		}

		return before + clip + after;
	}
}
