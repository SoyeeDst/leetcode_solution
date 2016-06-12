package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/6/8.
 * Solution to get largest rectangle in Histogram
 */
public class LeetCode84 {

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int[] maxSizeFactors = new int[heights.length];
        int max;
        int[][] effectiveColumns = new int[heights.length][2];
        maxSizeFactors[0] = heights[0];
        effectiveColumns[0][0] = heights[0];
        effectiveColumns[0][1] = 1;
        max = heights[0];
        int index = 1;
        while (index < heights.length) {
            int secondMax = Math.max(maxSizeFactors[index - 1], heights[index]);
            MaximumFactors firstMax = evaluateTillMax(heights[index], index, effectiveColumns);
            if (secondMax <= firstMax.sum) {
                maxSizeFactors[index] = firstMax.sum;
                // adjust previous elements
                effectiveColumns[index][0] = firstMax.evenHeight;
                effectiveColumns[index][1] = firstMax.count;
            } else {
                maxSizeFactors[index] = heights[index];
                effectiveColumns[index][0] = heights[index];
                effectiveColumns[index][1] = 1;
            }
            if (maxSizeFactors[index] > max) {
                max = maxSizeFactors[index];
            }
            index++;
        }
        return max;
    }

    public static MaximumFactors evaluateTillMax(int heights, int endOffset, int[][] effectiveColumns) {
        int lastNumber = effectiveColumns[endOffset - 1][0];
        int chosenHeights = Math.min(lastNumber, heights);
        return new MaximumFactors(chosenHeights, (effectiveColumns[endOffset - 1][1] + 1));
    }

    private static class MaximumFactors {
        int evenHeight;
        int count;
        int sum;

        public MaximumFactors(int evenHeight, int count) {
            this.evenHeight = evenHeight;
            this.count = count;
            this.sum = this.evenHeight * this.count;
        }
    }
}
