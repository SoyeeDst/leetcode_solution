package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/5/17.
 */
public class LeetCode15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> matchedList = new ArrayList<List<Integer>>();
        int index1 = 0;
        int maxIndex1 = nums.length - 2;
        int index2;
        int maxIndex2;
        int index3;
        int maxIndex3;
        while (index1 < maxIndex1) {
            if (index1 > 0 && nums[index1] == nums[index1 - 1]) {
                index1++;
                continue;
            }
            index2 = index1 + 1;
            int startIndex2 = index2;
            maxIndex2 = nums.length - 1;
            maxIndex3 = nums.length;
            boolean interrupt = false;
            while (index2 < maxIndex2) {
                if (index2 > startIndex2 && interrupt && nums[index2] == nums[index2 - 1]) {
                    index2++;
                    continue;
                }
                index3 = index2 + 1;
                interrupt = false;
                while (index3 < maxIndex3) {
                    int sum = nums[index1] + nums[index2] + nums[index3];
                    if (sum == 0) {
                        List<Integer> onceHit = new ArrayList<Integer>();
                        onceHit.add(nums[index1]);
                        onceHit.add(nums[index2]);
                        onceHit.add(nums[index3]);
                        Collections.sort(onceHit);
                        if (!isDuplicated(matchedList, onceHit)) {
                            matchedList.add(onceHit);
                        }
                        maxIndex2 = index3;
                        maxIndex3 = index3;
                        interrupt = true;
                        break;
                    } else if (sum > 0) {
                        maxIndex2 = index3 - 1;
                        maxIndex3 = index3 - 1;
                        interrupt = true;
                        break;
                    }
                    index3++;
                }
                index2++;
            }
            index1++;
        }
        return matchedList;
    }

    public boolean isDuplicated(List<List<Integer>> allInOneList,
                                List<Integer> oneList) {
        for (List<Integer> temp : allInOneList) {
            if (oneList.equals(temp)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String []args) throws Exception {
        LeetCode15 leetCode15 = new LeetCode15();
        List<List<Integer>> dataList = leetCode15.threeSum(new int[] {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
        System.err.println(dataList.size());
    }
}
