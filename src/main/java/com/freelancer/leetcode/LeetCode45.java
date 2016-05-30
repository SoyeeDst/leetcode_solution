package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Soyee on 2016/5/26.
 *
 */
public class LeetCode45 {

    public int jump(int[] nums) {
        Integer[] nullZeroList = dataCopy(nums);
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return 1;
        }
        int value = flatNumbers(nullZeroList, 0, nullZeroList.length - 1);
        if (value != 0) {
            return value;
        }
        Integer[] zoomOutIntegers = zoomOut(nullZeroList);
        if (zoomOutIntegers == null) {
            return 1;
        }
        Integer[][] resultMatrix = new Integer[zoomOutIntegers.length][zoomOutIntegers.length];
        performCalculation(resultMatrix, zoomOutIntegers, 0, zoomOutIntegers.length - 1);
        return resultMatrix[0][zoomOutIntegers.length - 1];
    }

    private static Integer[] dataCopy(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            numList.add(nums[index]);
        }
        return numList.toArray(new Integer[numList.size()]);
    }

    private static int flatNumbers(Integer[] nums, int start, int end) {
        Map<Integer, Object> uniqueData = new HashMap<>();
        for (int index = start; index <= end; index++) {
            uniqueData.put(nums[index], null);
        }
        if (uniqueData.size() != 1) {
            return 0;
        }
        if ((start - end - 1) % nums[start] == 0) {
            return (nums.length - 1) / nums[start];
        } else {
            return ((nums.length - 1) / nums[start]) + 1;
        }
    }

    private static Integer[] zoomOut(Integer[] nums) {
        Integer maxValue = Integer.MIN_VALUE;
        int length = 1;
        for (int index = 0; index < nums.length; index++) {
            if (maxValue == Integer.MIN_VALUE) {
                maxValue = nums[index];
            } else {
                if (nums[index] == maxValue - 1) {
                    maxValue = nums[index];
                    length++;
                } else {
                    break;
                }
            }
        }
        if (length == nums.length) {
            return null;
        }
        if (length <= 2) {
            return nums;
        }
        Integer[] zoomOutIntegers = new Integer[nums.length - length + 2];
        System.arraycopy(nums, length - 2, zoomOutIntegers, 0, nums.length - length + 2);
        return zoomOutIntegers;
    }

    // recursively do this to obtain the most optimized solution
    private static void performCalculation(Integer[][] resultMatrix, Integer[] nums, int start, int end) {
        if (resultMatrix[start][end] != null) {
            // duplicate calculation, return directly
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

        int value;
        if ((value = flatNumbers(nums, start, end)) != 0) {
            resultMatrix[start][end] = value;
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
