package com.freelancer.leetcode;

import java.util.Stack;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode168 {

    public String convertToTitle(int n) {
        int mode = 26;
        int base = n;
        Stack<Integer> myStack = new Stack<Integer>();
        while (base != 0) {
            if (base % mode == 0) {
                myStack.push(mode);
                base = base / mode - 1;
            } else {
                myStack.push(base % mode);
                base = base / mode;
            }
        }
        StringBuffer result = new StringBuffer("");
        Integer digits = null;
        while (!myStack.isEmpty() && (digits = myStack.pop()) != null) {
            result.append(digitsAlphaLetterMapper(digits));
        }
        return result.toString();
    }

    private char digitsAlphaLetterMapper(int digits) {
        return (char)('A' + (digits - 1));
    }


}
