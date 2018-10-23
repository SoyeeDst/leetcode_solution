package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {

	public List<String> summaryRanges(int[] nums) {
		List<String> r = new ArrayList<>();
		List<int[]> rangeList = new ArrayList<int[]>();
		for (int num : nums) {
		   Integer lastMax = getLastMax(rangeList);
           if (lastMax != null && lastMax + 1 == num) {
        	   rangeList.get(rangeList.size() - 1)[1] = num;
           } else {
        	   rangeList.add(new int[]{num, num});
           }
		}
		for (int[] range : rangeList) {
		   r.add(range[0] == range[1] ? "" + range[0] : range[0] + "->" + range[1]);
		}
		return r;
	}
	
	private static Integer getLastMax(List<int[]> rangeList) {
		if (rangeList.size() == 0) {
			return null;
		}
		return rangeList.get(rangeList.size() - 1)[1];
	}

}
