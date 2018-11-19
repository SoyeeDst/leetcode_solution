package com.freelancer.leetcode;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode763Test {
	
	@Test
	public void testPartitionLabels() {
		LeetCode763 leetCode763 = new LeetCode763();
		
		List<Integer> lenList = leetCode763.partitionLabels("ababcbacadefegdehijhklij");
		Assert.assertEquals(3, lenList.size());
		Assert.assertEquals(9, lenList.get(0).intValue());
		Assert.assertEquals(7, lenList.get(1).intValue());
		Assert.assertEquals(8, lenList.get(2).intValue());
	}

}
