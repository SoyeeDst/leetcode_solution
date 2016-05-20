package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/19.
 */
public class LeetCode29 {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        if (divisor == 1) {
            return dividend;
        }

        if (dividend == divisor) {
            return 1;
        }

        if ((dividend == 0) || (dividend > 0 && dividend < divisor)) {
            return 0;
        }

        if (divisor < 0 && dividend < 0 && dividend > divisor) {
            return 0;
        }

        if (divisor < 0 && Math.abs(divisor) < 0) {
            return 0;
        }

        if (dividend < 0 && dividend == Integer.MIN_VALUE && divisor == -1) {
            // Overflow
            return Integer.MAX_VALUE;
        }

        boolean negative = false;
        if ((dividend > 0 && divisor < 0)
                || (dividend < 0 && divisor > 0)) {
            negative = true;
        }

        boolean compensate = false;
        if (dividend == Integer.MIN_VALUE) {
            compensate = true;
            dividend = dividend + Math.abs(divisor);
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int answer = 0;
        if (dividend < divisor) {
            answer = 0;
        } else if (dividend == divisor) {
            answer = 1;
        } else {
            int left = dividend;
            while (left >= divisor) {
                int delta = divisor;
                Integer deltaAnswer = null;
                Boolean rollback = true;

                do {
                    if (deltaAnswer == null) {
                        deltaAnswer = 1;
                    } else {
                        deltaAnswer = deltaAnswer << 1;
                    }

                    if ((delta << 1) <= 0) {
                        rollback = false;
                        break;
                    }
                    delta = delta << 1;

                } while (delta <= left);

                // rollback
                if (rollback) {
                    delta = delta >> 1;
                }
                left = left - delta;
                answer = answer + deltaAnswer;
            }
        }

        if (!compensate)
           return negative ? -answer : answer;
        return negative ? (-(answer + 1)) : (answer + 1);
    }

    public static void main(String []args) throws Exception {
        System.err.println(new LeetCode29().divide(32, 5));

        System.err.println(new LeetCode29().divide(24, 5));

        System.err.println(new LeetCode29().divide(Integer.MAX_VALUE, 5));

        System.err.println(new LeetCode29().divide(1, -1));

        System.err.println(new LeetCode29().divide(-1010369383,
                -2147483648));

        System.err.println(new LeetCode29().divide(1038925803,
                -2147483648));

        System.err.println(new LeetCode29().divide(-2147483648,
                -1));

        System.err.println(new LeetCode29().divide(-2147483648,
                2));

        System.err.println(new LeetCode29().divide(-2147483648,
                -2147483642));

        System.err.println(new LeetCode29().divide(-2147483648,
                -2147483648));
    }

}
