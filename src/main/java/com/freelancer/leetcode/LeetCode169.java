package com.freelancer.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Soyee on 2016/6/7.
 */
public class LeetCode169 {

	public int majorityElement(int[] nums) {
       if (nums.length == 1) {
    	   return nums[0];
       }
       
       Integer maxCount = Integer.MIN_VALUE;
       Integer maxKey = null;
       Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
       for (int x = 0; x < nums.length; x++) {
    	   Integer count = null;
    	   if (countMap.get(nums[x]) == null) {
    		   count = 1;
    	   } else {
    		   count = countMap.get(nums[x]) + 1;
    	   }
    	   countMap.put(nums[x], count);
    	   if (count > maxCount) {
    		   maxCount = count;
    		   maxKey = nums[x];
    	   }
       }
       
       return maxKey;
	}
	
	public int majorityElementV2(int[] nums) {
		// General n log(n) complexity, really surpass the performance of o(n) ?
		Arrays.sort(nums);
	    return nums[nums.length/2];
	}
}
