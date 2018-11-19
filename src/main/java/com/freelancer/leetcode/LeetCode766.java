package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode766 {

	public boolean isToeplitzMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return true;
		}
		
		int i = matrix.length;
		int j = matrix[0].length;
		
		List<Integer> y = new ArrayList<>();
		for (int x = 0; x < j; x++) {
			y.add(matrix[0][x]);
		}
		y.remove(y.size() - 1);
		
		for (int x = 1; x < i; x++) {
           for (int yz = 1; yz < j; yz++) {
        	   if (matrix[x][yz] != y.get(yz - 1)) {
        		   return false;
        	   }
           }
           y.add(0, matrix[x][0]);
           y.remove(y.size() - 1);
		}
		
		return true;
	}

}
