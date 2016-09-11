package com.freelancer.leetcode;

import java.util.*;

/**
 * Created by Soyee.Deng on 2016/9/7.
 */
public class LeetCode150 {

    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MULTI = "*";
    private static final String DIV = "/";

    private static List<String> OPS = null;

    static {
        OPS = Arrays.asList(ADD, SUB, MULTI, DIV);
    }

    public int evalRPN(String[] tokens) {
        if (tokens == null) {
           return 0;
        }
        List<String> dataList = Arrays.asList(tokens);
        Stack<String> dataStack = new Stack<String>();
        for (String data : dataList) {
            dataStack.push(data);
            int size = dataStack.size();
            if (size >= 3) {
                if (isNumeric(dataStack.get(size - 3))
                        && isNumeric(dataStack.get(size - 2))
                        && isCaculus(dataStack.get(size - 1))) {
                    String ops = dataStack.pop();
                    String num2 = dataStack.pop();
                    String num1 = dataStack.pop();
                    dataStack.push(String.valueOf(handle(num1, num2, ops)));
                }
            }
        }
        return Integer.parseInt(dataStack.get(0));
    }


    private static boolean isNumeric(String item) {
        try {
            Integer.parseInt(item);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    private static boolean isCaculus(String item) {
        return OPS.contains(item);
    }

    private static int handle(String num1, String num2, String ops) {
        int num1Digits = Integer.parseInt(num1);
        int num2Digits = Integer.parseInt(num2);
        if (ops.equals(ADD)) {
            return num1Digits + num2Digits;
        } else if (ops.equals(SUB)) {
            return num1Digits - num2Digits;
        } else if (ops.equals(MULTI)) {
            return num1Digits * num2Digits;
        }
        return num1Digits / num2Digits;
    }
}
