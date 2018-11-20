package com.freelancer.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode804 {

	String[] a = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	public int uniqueMorseRepresentations(String[] words) {
		Set<String> b = new HashSet<>();

		for (String word : words) {
			StringBuffer sb = new StringBuffer("");
			for (int i = 0; i < word.length(); i++) {
               sb.append(a[word.charAt(i) - 'a']);
			}
			b.add(sb.toString());
		}
		
		return b.size();
	}

}
