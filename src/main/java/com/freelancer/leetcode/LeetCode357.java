package com.freelancer.leetcode;

/**
 * Created by Soyee on 2018/11/12
 */
public class LeetCode357 {

	public int countNumbersWithUniqueDigits(int n) {
        if (n >= 10) {
        	return 0;
        }
        
        if (n == 0) {
        	return 1;
        }
        
        int[] x = new int[10];
        x[1] = 10;
        x[2] = 81;
        
        for (int i = 3; i <= n; i++) {
        	x[i] = x[i - 1] * (10 - i + 1);
        }
        
        int sum = 0;
        
        for (int i = 1; i <= n ; i++) {
        	sum = sum + x[i];
        }
        
        return sum;
	}
}
