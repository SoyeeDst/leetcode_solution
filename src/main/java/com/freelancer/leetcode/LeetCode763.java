package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode763 {

	public List<Integer> partitionLabels(String S) {
		if (S == null || S.equals("")) {
			return Collections.emptyList();
		}

		List<Integer> t = new ArrayList<>();
		Integer[][] s = new Integer[26][2];

		for (int i = 0; i < S.length(); i++) {
			char te = S.charAt(i);
			if (s[te - 'a'][0] == null) {
				s[te - 'a'][0] = i;
			}
			s[te - 'a'][1] = i;
		}

		int i = 0;
		int b = 0;
		int e = 0;

		do {
			e = Math.max(s[S.charAt(i) - 'a'][1], e);	
			if (i == e) {
				t.add(e - b + 1);
				b = i + 1;
				e = i + 1;
			}
			i++;
		} while (i < S.length());

		return t;
	}

}
