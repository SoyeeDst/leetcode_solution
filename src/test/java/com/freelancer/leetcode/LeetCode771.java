package com.freelancer.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode771 {

	public int numJewelsInStones(String J, String S) {
		Set<Character> Js = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
        	Js.add(J.charAt(i));
        }
        
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
        	if (Js.contains(S.charAt(i)))
        		cnt++;
        }
        return cnt;
	}

}
