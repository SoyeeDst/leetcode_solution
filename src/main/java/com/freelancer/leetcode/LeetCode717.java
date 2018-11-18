package com.freelancer.leetcode;

import java.util.Stack;

public class LeetCode717 {

	public boolean isOneBitCharacter(int[] bits) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < bits.length - 1; i++) {
           Integer b = bits[i];
           Integer p = null;
           if (!s.isEmpty()) {
        	   p = s.peek();
           }
           
           if (b == 0) {
        	   if (p != null && p != 0) {
        		   s.pop();
        	   }
           } else {
        	   if (p != null && p == 1) {
        		   s.pop();
        		   continue;
        	   }
        	   s.push(b);
           }
        }
        return s.isEmpty();
	}

}
