package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/25.
 */
public class LeetCode35 {

    // simulate natural calculation of computer
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if (num1.equals("1")) {
            return num2;
        }
        if (num2.equals("1")) {
            return num1;
        }
        int length1 = num1.length();
        int length2 = num2.length();
        int length = length1 + length2;
        int[] digits = new int[length];
        int index = length1 - 1;
        do {
            for (int index2 = length2 - 1; index2 >= 0; index2--) {
                multiply(num1, index, num2, index2, digits);
            }
            index--;
        } while (index >= 0);

        // remove all heading zeros
        StringBuffer resultBuffer = new StringBuffer("");
        boolean startfilling = false;
        for (int index3 = 0; index3 < length; index3++) {
            if (!startfilling && digits[index3] == 0) {
                continue;
            }
            startfilling = true;
            resultBuffer.append(digits[index3]);
        }
        return resultBuffer.toString();
    }

    public void multiply(String num1, int index, String num2, int index2, int[] digits) {
        int multi = num1.charAt(index) - '0';
        int multisor = num2.charAt(index2) - '0';
        if (multi == 0 || multisor == 0) {
            return;
        }
        int resultIndex = digits.length - 1 - (num1.length() - 1 - index) - (num2.length() - 1 - index2);
        int originalPlaceHolder = digits[resultIndex];
        digits[resultIndex] = (originalPlaceHolder + (multi * multisor)) % 10;
        int lastHolder = digits[resultIndex - 1] + ((originalPlaceHolder + (multi * multisor)) / 10);
        digits[resultIndex - 1] = lastHolder % 10;
        int leftTrivial = lastHolder / 10;
        int startIndex = resultIndex - 2;
        while (leftTrivial > 0) {
            leftTrivial = digits[startIndex] + leftTrivial;
            if (leftTrivial < 10) {
                digits[startIndex] = leftTrivial;
                break;
            }
            digits[startIndex] = leftTrivial % 10;
            startIndex--;
            leftTrivial = leftTrivial / 10;
        }
    }

}
