package com.freelancer.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {

	public boolean isIsomorphic(String s, String t) {
		if (s == null && t == null) {
			return true;
		}

		if ((s != null && t == null) || (s == null && t != null)) {
			return false;
		}

		if (s.length() != t.length()) {
			return false;
		}

		int length = s.length();
		Map<Character, Character> charMap = new HashMap<Character, Character>();
		Map<Character, Character> reverseMap = new HashMap<Character, Character>();
		for (int i = 0; i < length; i++) {
			char char1 = s.charAt(i);
			char char2 = t.charAt(i);
			// Check uniqueness
			if (charMap.containsKey(char1)) {
				if (charMap.get(char1) != char2) {
					return false;
				}
			} else if (reverseMap.containsKey(char2)) {
				if (reverseMap.get(char2) != char1) {
					return false;
				}
			} else {
				charMap.put(char1, char2);
				reverseMap.put(char2, char1);
			}
		}

		return true;
	}

}
