package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/7.
 */
public class LeetCode76 {

    public String minWindow(String s, String t) {
        if (s == null || s.equals("") || t == null || t.equals("")) {
            return "";
        }
        if (s.length() < t.length()) {
            return "";
        }

        MiniWindowStatus miniWindowStatus = new MiniWindowStatus(t, s);

        int index = 0;
        do {
            Character onceChar = s.charAt(index);
            miniWindowStatus.checkOnceChar(onceChar, index);
            index++;
        } while (index < s.length());

        int start = miniWindowStatus.minimumStart;
        int end = miniWindowStatus.minimumEnd;

        if (start == -1 || end == -1) {
            return "";
        }
        return s.substring(start, end + 1);
    }

    private static class MiniWindowStatus {

        private int length;
        private int start = 0;
        private char[] criteriaArray;
        private char[] wholeStrArray;
        private int[] positions = new int[256];
        int minLength = Integer.MAX_VALUE;
        public int minimumStart = -1;
        public int minimumEnd = -1;

        public MiniWindowStatus(String criteria, String wholeStr) {
            this.criteriaArray = criteria.toCharArray();
            length = criteria.length();
            wholeStrArray = wholeStr.toCharArray();
            for (char eachChar : criteriaArray) {
                positions[eachChar]++;
            }
        }

        public void checkOnceChar(Character oneChar, int offset) {
            if (positions[oneChar] > 0) {
                length--;
            }
            positions[oneChar]--;
            while (length == 0) {
                if ((offset - start + 1) < minLength) {
                    minLength = offset - start + 1;
                    minimumStart = start;
                    minimumEnd = offset;
                }
                positions[wholeStrArray[start]]++;
                if (positions[wholeStrArray[start]] > 0) {
                    length++;
                }
                start++;
            }
        }
    }


}

