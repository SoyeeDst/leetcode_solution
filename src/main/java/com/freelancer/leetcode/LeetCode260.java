package com.freelancer.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LeetCode260 {

	public int[] singleNumber(int[] nums) {
       Set<Integer> sta = new HashSet<>();
       
       int[] r = new int[2];
       int index = 0;
       for (int num : nums) {
    	   if (sta.contains(num)) {
    		   sta.remove(num);
    	   } else {
    		   sta.add(num);
    	   }    	   
       }
       
       Iterator<Integer> i = sta.iterator();
       
       while(i.hasNext()) {
    	   r[index++] = i.next().intValue();   
       }
       
       return r;
	}

}
