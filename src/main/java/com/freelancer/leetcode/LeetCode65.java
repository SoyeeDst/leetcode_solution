package com.freelancer.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode65 {

    private static final Character LOWER_E_CHAR = 'e';
    private static final Character POINTS_CHAR = '.';
    private static final Character MINUS_CHAR = '-';
    private static final Character ADD_CHAR = '+';

    private static final Set<Character> VALID_CHAR = new HashSet<>();
    private static final Set<Character> DIGITS_CHAR = new HashSet<>();
    private static final Set<Character> SPECIAL_CHAR = new HashSet<>();

    static {
        for (int index = 0; index <= 9; index++) {
            DIGITS_CHAR.add((char) ('0' + index));
        }
        // digits
        SPECIAL_CHAR.add(POINTS_CHAR);
        // e should have higher priority
        SPECIAL_CHAR.add(LOWER_E_CHAR);
        SPECIAL_CHAR.add(MINUS_CHAR);
        SPECIAL_CHAR.add(ADD_CHAR);

        VALID_CHAR.addAll(DIGITS_CHAR);
        VALID_CHAR.addAll(SPECIAL_CHAR);
    }

    public boolean isNumber(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        // remove empty space on both sides
        String slimVersion = s.trim();
        if (anyInvalidChar(slimVersion)) {
            return false;
        }
        if (slimVersion.indexOf((int) LOWER_E_CHAR) != slimVersion.lastIndexOf((int) LOWER_E_CHAR)) {
            return false;
        }
        return splitNumberAndCheck(slimVersion);
    }

    private static boolean anyInvalidChar(String value) {
        if (value.equals("")) {
            return true;
        }
        char[] charArray = value.toCharArray();
        for (char eachChar : charArray) {
            if (!VALID_CHAR.contains(eachChar)) {
                return true;
            }
        }
        return false;
    }

    private static boolean splitNumberAndCheck(String value) {
        int pos;
        if (((pos = value.lastIndexOf((int) LOWER_E_CHAR)) >= 0)) {
            if (!numberic(value.substring(pos + 1), true)) {
                return false;
            }
            value = value.substring(0, pos);
        }
        return numberic(value, false);
    }

    private static boolean numberic(String clip, boolean isEMode) {
        if (clip.indexOf((int) MINUS_CHAR) >= 0) {
            // more than one minus symbol
            if (clip.indexOf((int) MINUS_CHAR) != clip.lastIndexOf((int) MINUS_CHAR)) {
                return false;
            }
            if (clip.indexOf((int) MINUS_CHAR) != 0) {
                return false;
            }
            clip = clip.substring(1);
            if (clip == null || clip.length() == 0) {
                return false;
            }
        }
        if (clip.indexOf((int) ADD_CHAR) >= 0) {
            // more than one minus symbol
            if (clip.indexOf((int) ADD_CHAR) != clip.lastIndexOf((int) ADD_CHAR)) {
                return false;
            }
            if (clip.indexOf((int) ADD_CHAR) != 0) {
                return false;
            }
            clip = clip.substring(1);
            if (clip == null || clip.length() == 0) {
                return false;
            }
        }
        if (clip.indexOf((int) POINTS_CHAR) < 0) {
            if (clip == null || clip.length() == 0) {
                return false;
            }
            return true;
        } else {
            if (clip.length() == 1) {
                return false;
            }
            if (isEMode) {
                return false;
            }
            // more than one points
            if ((clip.indexOf((int) POINTS_CHAR) != clip.lastIndexOf((int) POINTS_CHAR))) {
                return false;
            }
            return true;
        }
    }
}
