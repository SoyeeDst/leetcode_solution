package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode796 {

	public boolean rotateString(String A, String B) {
       List<String> rotated = new ArrayList<>();
       
       for (int i = 0; i < A.length(); i++) {
    	   String t = A.substring(i);
    	   if (i > 0) {
    		   t = t + A.substring(0, i);
    	   }
    	   rotated.add(t);
       }
       
       return rotated.contains(B);
	}

}
