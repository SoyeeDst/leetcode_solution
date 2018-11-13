package com.freelancer.leetcode;

import java.util.HashSet;

public class LeetCode396 {

	public boolean isRectangleCover(int[][] rectangles) {
		if (rectangles == null || rectangles.length == 0) {
			return false;
		}

		if (rectangles.length == 1) {
			return true;
		}

		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
		int sumSize = 0;

		// Anyhow we use this set to judge overlapping area
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i <= rectangles.length - 1; i++) {
			int[] rect = rectangles[i];

			minX = Math.min(minX, rectangles[i][0]);
			minY = Math.min(minY, rectangles[i][1]);

			maxX = Math.max(maxX, rectangles[i][2]);
			maxY = Math.max(maxY, rectangles[i][3]);

			sumSize += (rectangles[i][3] - rectangles[i][1]) * (rectangles[i][2] - rectangles[i][0]);
			
			String s1 = rect[0] + " " + rect[1];
			String s2 = rect[0] + " " + rect[3];
			String s3 = rect[2] + " " + rect[3];
			String s4 = rect[2] + " " + rect[1];

			if (!set.add(s1))
				set.remove(s1);
			if (!set.add(s2))
				set.remove(s2);
			if (!set.add(s3))
				set.remove(s3);
			if (!set.add(s4))
				set.remove(s4);
		}

		if (!set.contains(minX + " " + minY) || !set.contains(minX + " " + maxY) || !set.contains(minY + " " + maxX)
				|| !set.contains(minY + " " + maxY) || set.size() != 4)
			return false;

		return (maxY - minY) * (maxX - minX) == sumSize;
	}

}
