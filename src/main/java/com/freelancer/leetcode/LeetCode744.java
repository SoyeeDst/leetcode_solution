package com.freelancer.leetcode;

public class LeetCode744 {

	public char nextGreatestLetter(char[] letters, char target) {	
		if (letters == null || letters.length == 0) {
			return ' ';
		}
		
        if (letters[0] > target || target >= letters[letters.length - 1]) {
        	return letters[0];
        }
        
        for (int i = 1; i < letters.length; i++) {
        	if (letters[i] > target) {
        		return letters[i];
        	}
        }
        return ' ';
	}

}
