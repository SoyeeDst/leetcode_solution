package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/26.
 */
public class LeetCode45 {

    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return 1;
        }
        Integer[][] resultMatrix = new Integer[nums.length + 1][nums.length + 1];
        performCalculation(resultMatrix, nums, 1, nums.length);
        return resultMatrix[1][nums.length];
    }

    // recursively do this to obtain the most optimized solution
    private static void performCalculation(Integer[][] resultMatrix, int[] nums, int start, int end) {

        if (resultMatrix[start][end] != null) {
            return;
        }

        if (start == end) {
            resultMatrix[start][end] = 0;
            return;
        }

        if (nums[start - 1] >= (end - start)) {
            resultMatrix[start][end] = 1;
            return;
        }

        if (end <= start + 1) {
            if (nums[start - 1] >= 1) {
                resultMatrix[start][end] = 1;
                return;
            }
        }

        int minimalStep = Integer.MAX_VALUE;
        int index = end - 1;
        do {
            // recursively call calculation
            performCalculation(resultMatrix, nums, index, end);
            performCalculation(resultMatrix, nums, start, index - 1);
            int step = resultMatrix[start][index] + resultMatrix[index + 1][end];
            if (step < minimalStep) {
                minimalStep = step;
            }
            index--;
        } while (index > start);
        // set the value to avoid duplicate calculation
        resultMatrix[start][end] = minimalStep;
    }

}
