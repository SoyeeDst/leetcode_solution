package com.freelancer.leetcode;

public class LeetCode392 {
	
	public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        
        
        int x = 0;    
        int y = 0;
        
        while (x < s.length()) {
           if (y >= t.length()) {
               return false;
           }
            
           if (s.charAt(x) == t.charAt(y)) {
               x++;
               y++;
               continue;
           } else {
               y++;
           } 
        }
        
        return true; 
    }

}
