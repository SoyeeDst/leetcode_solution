package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode179 {

	public String largestNumber(int[] nums) {
		List<String> x = new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {
			x.add(String.valueOf(nums[i]));
		}

		StringBuffer sb = new StringBuffer("");
		int y = 0;
		while (y < nums.length) {
			sb.append(premium(x));
			y++;
		}
		return sb.toString();
	}

	private static String premium(List<String> x) {
		int compareOffset = -1;
		List<Integer> offsetMark = new ArrayList<Integer>();
		for (int j = 0; j < x.size(); j++) {
			offsetMark.add(j);
		}

		int maxLength = 0;
		do {
			List<Integer> turnOffsetMark = new ArrayList<Integer>();
			compareOffset++;
			Integer xixi = -1;

			for (int inx = 0; inx < offsetMark.size(); inx++) {
				String content = x.get(offsetMark.get(inx));
				int digit = 0;
				if (compareOffset > content.length() - 1) {
					digit = content.charAt(compareOffset % (content.length())) - '0';
				} else {
					digit = content.charAt(compareOffset) - '0';
				}

				if (content.length() > maxLength) {
					maxLength = content.length();
				}

				// count the biggest character
				if (digit > xixi) {
					xixi = digit;
					turnOffsetMark.clear();
					turnOffsetMark.add(offsetMark.get(inx));
					continue;
				} else if (digit < xixi) {
					continue;
				} else {
					turnOffsetMark.add(offsetMark.get(inx));
				}
			}

			offsetMark.clear();
			offsetMark.addAll(turnOffsetMark);

		} while (offsetMark.size() != 1 && compareOffset < maxLength);

		return x.remove((int) offsetMark.get(0));
	}

}
