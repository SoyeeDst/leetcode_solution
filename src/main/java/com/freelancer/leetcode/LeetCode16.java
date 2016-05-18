package com.freelancer.leetcode;

import java.util.Arrays;

/**
 * Created by Soyee on 2016/5/18.
 */
public class LeetCode16 {

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int closetNum = Integer.MAX_VALUE;
        int closetPath = Integer.MAX_VALUE;
        int index = 0;
        while (index < nums.length - 2) {
            int start = index + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[index] + nums[start] + nums[end];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < closetPath) {
                    closetPath = Math.abs(sum - target);
                    closetNum = sum;
                }
                if (sum > target) {
                    do
                    {
                        end--;
                    } while(end > start && nums[end] == nums[end + 1]);
                } else {
                    do {
                        start++;
                    } while(start > end && nums[start] == nums[start - 1]);
                }
            }
            index++;
        }
        return closetNum;
    }

    public static void main(String []args) throws Exception {
        LeetCode16 leetCode16 = new LeetCode16();
        System.err.println(leetCode16.threeSumClosest(new int[] {-1,2,1,-4}, 1) == 2);
        System.err.println(leetCode16.threeSumClosest(new int[] {-10,2,-10,3}, -5) == -5);
        System.err.println(leetCode16.threeSumClosest(new int[] {0,2,1,-3}, 1) == 0);
        System.err.println(leetCode16.threeSumClosest(new int[] {1, 1, -1, -1, 3}, 3) == 3);
        System.err.println(leetCode16.threeSumClosest(new int[] {1, 1, -1, -1, 5, 9}, 5) == 5);
        System.err.println(leetCode16.threeSumClosest(new int[] {1,2,4,8,16,32,64,128}, 82) == 82);
        System.err.println(leetCode16.threeSumClosest(new int[] {-10001, 1, 0, 5, 10000}, 0) == 0);
        System.err.println(leetCode16.threeSumClosest(new int[] {0, 1, 2}, 0) == 3);
        System.err.println(leetCode16.threeSumClosest(new int[] {-10,0,-2,3,-8,1,-10,8,-8,6,-7,0,-7,2,2,-5,-8,1,-4,6 }, 18) == 17);
        System.err.println(leetCode16.threeSumClosest(new int[] {6,-18,-20,-7,-15,9,18,10,1,-20,-17,-19,-3,-5,-19,10,6,-11,1,-17,-15,6,17,-18,-3,16,19,-20,-3,-17,-15,-3,12,1,-9,4,1,12,-2,14,4,-4,19,-20,6,0,-19,18,14,1,-15,-5,14,12,-4,0,-10,6,6,-6,20,-8,-6,5,0,3,10,7,-2,17,20,12,19,-13,-1,10,-1,14,0,7,-3,10,14,14,11,0,-4,-15,-8,3,2,-5,9,10,16,-4,-3,-9,-8,-14,10,6,2,-12,-7,-16,-6,10}, -52) == -52);
    }
}
