package com.freelancer.leetcode;
import java.util.Arrays;

public class LeetCode242 {

	public boolean isAnagram(String s, String t) {
        if (s == t || (s != null && t != null && s.equals(t))) {
        	return true;
        }
        
        int[] y = analyze(s);
        int[] z = analyze(t);
        
        return Arrays.equals(y, z);
	}
	
	private static int[] analyze(String sa) {
		if (sa == null) {
			return null;
		}
		
		int[] r = new int[26];
		for (char a : sa.toCharArray()) {
			r[a - 'a']++;
		}
		
		return r;
	}

}
