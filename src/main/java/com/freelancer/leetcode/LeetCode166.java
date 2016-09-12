package com.freelancer.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Soyee on 2016/9/12.
 */
public class LeetCode166 {

    private static final String DECIMAL_FLAG = ".";
    private static final String PLACE_HOLDER = "0";
    private static final String PREFIX_BRACKET = "(";
    private static final String SUFFIX_BRACKET = ")";

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return PLACE_HOLDER;
        }
        StringBuffer sBuffer = new StringBuffer("");
        int legacy = numerator;
        boolean decimal = false;
        Map<Integer, Integer> modular = new HashMap<>();
        while ((legacy != 0)) {
            // before any business logic handling
            if (decimal) {
                if (modular.containsKey(legacy)) {
                    break;
                }
                modular.put(legacy, sBuffer.length());
            }
            int val = legacy / denominator;
            if (val >= 1) {
                sBuffer.append(val);
                legacy = legacy - val * denominator;
            } else {
                if (!decimal) {
                    if (sBuffer.length() == 0) {
                        sBuffer.append(PLACE_HOLDER);
                    }
                    sBuffer.append(DECIMAL_FLAG);
                    modular.put(legacy, sBuffer.length());
                    decimal = true;
                } else {
                    sBuffer.append(PLACE_HOLDER);
                }
            }
            if (decimal) {
                legacy = legacy * 10;
            }
        }

        if (legacy != 0) {
            sBuffer.insert(modular.get(legacy), PREFIX_BRACKET);
            sBuffer.append(SUFFIX_BRACKET);
        }
        return sBuffer.toString();
    }
}
