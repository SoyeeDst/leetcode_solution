package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode6 {

    public String convert(String s, int nRows) {
        //Special case
        if (nRows >= s.length() || nRows == 1) {
            return s;
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < nRows; i++) {
            //Two gaps for the next character
            int gap1 = 2 * (nRows - 1 - i);
            int gap2 = 2 * i;

            int j = i;
            //Record the previous char position in original string
            int prevPos = 0;

            // Init buffer
            sb.append(s.charAt(j));

            while (j < s.length()) {
                prevPos = j;
                j += gap1;
                //gap1 is 0 when it is last row, do not add it twice
                if (j != prevPos && j < s.length()) {
                    sb.append(s.charAt(j));
                }
                prevPos = j;
                j += gap2;
                //gap2 is 0 when it is first row, do not add it twice
                if (j != prevPos && j < s.length()) {
                    sb.append(s.charAt(j));
                }
            }
        }

        return sb.toString();
    }
}
