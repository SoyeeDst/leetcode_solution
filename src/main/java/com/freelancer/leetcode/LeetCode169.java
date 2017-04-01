package com.freelancer.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Soyee on 2016/6/7.
 */
public class LeetCode169 {

	public int majorityElement(int[] nums) {
       if (nums.length == 1) {
    	   return nums[0];
       }
       
       Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
       for (int x = 0; x < nums.length; x++) {
    	   if (countMap.get(nums[x]) == null) {
    		   countMap.put(nums[x], 1);
    	   } else {
    		   countMap.put(nums[x], countMap.get(nums[x]) + 1);
    	   }
       }
       
       Iterator<Integer> xxx = countMap.keySet().iterator();
       Integer maxCount = Integer.MIN_VALUE;
       while (xxx.hasNext()) {
    	   int key = xxx.next();
    	   int value = countMap.get(key);
       }
	}
}
