package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/5/19.
 */
public class LeetCode18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 4) {
            int sum = 0;
            for (int perNum : nums) {
                sum = sum + perNum;
            }
            if (sum == target) {
                result.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
                return result;
            } else {
                return Collections.emptyList();
            }
        }

        int length = nums.length;
        int firstIndex = 0;
        while (firstIndex < length - 2) {
            int start = firstIndex + 1;
            int end = length - 1;
            while (start < end - 1) {
                int sum3 = nums[firstIndex] + nums[start] + nums[end];
                int diff = target - sum3;
                if (diff >= nums[start] && diff <= nums[end]) {
                    int nestedStart = start + 1;
                    int nestedEnd = end;
                    int twoSum = target - nums[firstIndex] - nums[start];
                    List<List<Integer>> pairList = possiblePairs(nums, nestedStart, nestedEnd, twoSum);
                    for (List<Integer> pair : pairList) {
                        add2ResultSet(result, Arrays.asList(nums[firstIndex], nums[start], pair.get(0), pair.get(1)));
                    }
                    start++;
                } else if (diff < nums[start]) {
                    do {
                        end--;
                    } while (start < end && nums[end + 1] == nums[end]);
                } else if (diff > nums[end]) {
                    do {
                        start++;
                    } while (start < end && nums[start] == nums[start - 1]);
                }
            }
            do {
                firstIndex++;
            } while (firstIndex < length - 2 && nums[firstIndex] == nums[firstIndex - 1]);
        }
        return result;
    }

    private static List<List<Integer>> possiblePairs(int[] nums, int beginOffset, int endOffset, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        while (beginOffset < endOffset) {
            int tempSum = nums[beginOffset] + nums[endOffset];
            if (tempSum - sum == 0) {
                result.add(Arrays.asList(nums[beginOffset], nums[endOffset]));
                beginOffset++;
                endOffset--;
            } else if (tempSum - sum > 0) {
                do {
                    endOffset--;
                } while (beginOffset < endOffset && nums[endOffset + 1] == nums[endOffset]);
            } else {
                do {
                    beginOffset++;
                } while (beginOffset < endOffset && nums[beginOffset] == nums[beginOffset - 1]);
            }
        }
        return result;
    }

    public void add2ResultSet(List<List<Integer>> allInOneList,
                              List<Integer> oneList) {
        for (List<Integer> temp : allInOneList) {
            if (oneList.equals(temp)) {
                return;
            }
        }
        allInOneList.add(oneList);
    }

    public static void main(String []args) throws Exception {
        LeetCode18 leetCode18 = new LeetCode18();
        List<List<Integer>> dataList = leetCode18.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
        for (List<Integer> data : dataList) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }
        List<List<Integer>> dataList2 = leetCode18.fourSum(new int[] {2, 1, 0, -1}, 2);
        for (List<Integer> data : dataList2) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }

        System.err.println("===================== Test 3 ==========================");

        List<List<Integer>> dataList3 = leetCode18.fourSum(new int[] {-1, 0, 1, 2, -1, -4}, -1);

        for (List<Integer> data : dataList3) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }

        System.err.println("===================== Test 4 ==========================");
        List<List<Integer>> dataList4 = leetCode18.fourSum(new int[] {-4,-3,-2,-1,0,0,1,2,3,4}, 0);

        System.err.println(dataList4.size() == 0);


        System.err.println("===================== Test 5 ==========================");
        List<List<Integer>> dataList5 = leetCode18.fourSum(new int[] {-3, -1, 0, 2, 4, 5}, 0);

        for (List<Integer> data : dataList5) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }

        System.err.println("===================== Test 6 ==========================");
        List<List<Integer>> dataList6 = leetCode18.fourSum(new int[] {-1,0,1,2,-1,-4}, -1);
        for (List<Integer> data : dataList6) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }

        // chong fu
        System.err.println("===================== Test 7 ==========================");
        List<List<Integer>> dataList7 = leetCode18.fourSum(new int[] {-1,-5,-5,-3,2,5,0,4}, -7);
        for (List<Integer> data : dataList7) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }

        System.err.println("===================== Test 8 ==========================");
        List<List<Integer>> dataList8 = leetCode18.fourSum(new int[] {-1,0,-5,-2,-2,-4,0,1,-2}, -9);
        for (List<Integer> data : dataList8) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }


        System.err.println("===================== Test 9 ==========================");
        List<List<Integer>> dataList9 = leetCode18.fourSum(new int[] {2,0, 3, 0, 1, 2, 4}, 7);

        for (List<Integer> data : dataList9) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }

        System.err.println("===================== Test 9 ==========================");
        List<List<Integer>> dataList10 = leetCode18.fourSum(new int[] {-5, 5, 4, -3, 0, 0, 4, -2}, 4);
        for (List<Integer> data : dataList10) {
            for (Integer a : data) {
                System.err.print(a + " ");
            }
            System.err.println("");
        }
    }
}
