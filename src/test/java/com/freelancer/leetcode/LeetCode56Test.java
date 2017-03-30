package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.freelancer.leetcode.support.Interval;

public class LeetCode56Test {

	@Test
	public void testMergeIntervals() {
		LeetCode56 leetCode56 = new LeetCode56();
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));
		List<Interval> mergedList = leetCode56.merge(intervals);
		Assert.assertEquals(3, mergedList.size());
	}
	
	@Test
	public void testMergeIntervalsMoreThanOnce() {
		LeetCode56 leetCode56 = new LeetCode56();
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(3, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));
		List<Interval> mergedList = leetCode56.merge(intervals);
		Assert.assertEquals(3, mergedList.size());	
	}
	
	@Test
	public void testMergeIntervalsToOne() {
		LeetCode56 leetCode56 = new LeetCode56();
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(4, 6));
		intervals.add(new Interval(2, 5));
		intervals.add(new Interval(15, 18));
		List<Interval> mergedList = leetCode56.merge(intervals);
		Assert.assertEquals(2, mergedList.size());	
		Assert.assertEquals(1, mergedList.get(0).start);
		Assert.assertEquals(6, mergedList.get(0).end);
		Assert.assertEquals(15, mergedList.get(1).start);
		Assert.assertEquals(18, mergedList.get(1).end);
	}
	
	@Test
	public void testMergeIntervalsToOne2() {
		LeetCode56 leetCode56 = new LeetCode56();
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(0, 1));
		intervals.add(new Interval(1, 6));
		intervals.add(new Interval(1, 5));
		intervals.add(new Interval(15, 18));
		List<Interval> mergedList = leetCode56.merge(intervals);
		Assert.assertEquals(2, mergedList.size());	
		Assert.assertEquals(0, mergedList.get(0).start);
		Assert.assertEquals(6, mergedList.get(0).end);
		Assert.assertEquals(15, mergedList.get(1).start);
		Assert.assertEquals(18, mergedList.get(1).end);
	}
}
