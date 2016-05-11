package com.freelancer.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        Map<Character, Character> symbolMapper = new HashMap<Character, Character>();
        symbolMapper.put('}', '{');
        symbolMapper.put(')', '(');
        symbolMapper.put(']', '[');
        Stack<Character> symbolStack = new Stack<Character>();
        for (int index = 0; index < s.length(); index++) {
            Character tempChar = s.charAt(index);
            if (tempChar == '{' || tempChar == '(' || tempChar == '[') {
                symbolStack.push(tempChar);
            } else {
                if (!symbolStack.isEmpty()) {
                    Character topElement = symbolStack.elementAt(symbolStack
                            .size() - 1);
                    if (topElement == symbolMapper.get(tempChar)) {
                        symbolStack.pop();
                    } else {
                        symbolStack.push(tempChar);
                    }
                } else {
                    return false;
                }
            }
        }
        if (symbolStack.size() == 0) {
            return true;
        }
        return false;
    }

}
