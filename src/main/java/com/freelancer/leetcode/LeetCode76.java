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

        MiniWindowStatus miniWindowStatus = new MiniWindowStatus(t);

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
        private char[] criteriaArray;
        private Integer[] positions;
        private int placeHolderCnt;
        private int minLength = Integer.MAX_VALUE;
        public int minimumStart = -1;
        public int minimumEnd = -1;

        public MiniWindowStatus(String criteria) {
            this.criteriaArray = criteria.toCharArray();
            length = criteriaArray.length;
            positions = new Integer[length];

        }

        public void checkOnceChar(Character oneChar, int offset) {
            boolean found = true;
            for (int index = 0; index < length; index++) {
                if (criteriaArray[index] == oneChar) {
                    if (positions[index] == null) {
                        positions[index] = offset;
                        placeHolderCnt = placeHolderCnt + 1;
                        found = true;
                        break;
                    } else {
                        found = false;
                    }
                }
            }
            // override
            if (!found) {
                for (int index = 0; index < length; index++) {
                    if (criteriaArray[index] == oneChar) {
                        positions[index] = offset;
                    }
                }
            }
            if (placeHolderCnt == length) {
                int minStart = Integer.MAX_VALUE;
                for (int index = 0; index < length; index++) {
                    if (positions[index] < minStart) {
                        minStart = positions[index];
                    }
                }
                if (offset - minStart + 1 < minLength) {
                    minimumStart = minStart;
                    minimumEnd = offset;
                    minLength = offset - minStart + 1;
                }
            }
        }

    }

}

