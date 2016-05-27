package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Soyee on 2016/5/26.
 */
public class LeetCode45 {

    public int jump(int[] nums) {
        Integer[] nullZeroList = nullZero(nums);
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return 1;
        }
        Integer[][] resultMatrix = new Integer[nullZeroList.length][nullZeroList.length];
        performCalculation(resultMatrix, nullZeroList, 0, nullZeroList.length - 1);
        return resultMatrix[0][nullZeroList.length - 1];
    }

    private static Integer[] nullZero(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                numList.add(nums[index]);
            }
        }
        return numList.toArray(new Integer[numList.size()]);
    }

    private static boolean flatNumbers(Integer[] nums) {
        Set<Integer> uniqueData = new HashSet<>();
        for (Integer num : nums) {
            uniqueData.add(num);
        }
        return uniqueData.size() == 1 ? true : false;
    }


    // recursively do this to obtain the most optimized solution
    private static void performCalculation(Integer[][] resultMatrix, Integer[] nums, int start, int end) {
        //System.err.println("Perform calculation, start : " + start + ", end : " + end);
        if (resultMatrix[start][end] != null) {
            // duplicate calculation, return directly
            return;
        }

        if (flatNumbers(nums)) {
            if ((nums.length - 1) % nums[0] == 0) {
                resultMatrix[start][end] = (nums.length - 1) / nums[0];
            } else {
                resultMatrix[start][end] = ((nums.length - 1) / nums[0]) + 1;
            }
            return;
        }

        if (start == end) {
            resultMatrix[start][end] = 0;
            return;
        }

        if (nums[start] >= (end - start)) {
            resultMatrix[start][end] = 1;
            return;
        }

        if (end == start + 1) {
            resultMatrix[start][end] = 1;
            return;
        }

        int minimalStep = Integer.MAX_VALUE;
        int index = end - 1;
        do {
            // recursively call calculation
            performCalculation(resultMatrix, nums, index, end);
            performCalculation(resultMatrix, nums, start, index);
            int step = resultMatrix[start][index] + resultMatrix[index][end];
            if (step < minimalStep) {
                minimalStep = step;
            }
            index--;
        } while (index > start);
        // set the value to avoid duplicate calculation
        resultMatrix[start][end] = minimalStep;
    }

}
