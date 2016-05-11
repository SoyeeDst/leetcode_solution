package com.freelancer.leetcode;

import java.util.Stack;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode32 {

    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<Integer>();
        int maxLen = 0;
        int curLen = 0;
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i) == '(') {
                st.push(curLen);
                curLen = 0;
            } else if (s.charAt(i) == ')') {
                if(st.isEmpty()) {
                    curLen = 0;
                } else {
                    curLen = curLen + st.pop() + 2;
                    if(curLen > maxLen) maxLen = curLen;
                }
            }
        }
        return maxLen;
    }
}
