package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.freelancer.leetcode.support.Interval;

/**
 * Created by Soyee on 2017/3/30
 */
public class LeetCode56 {

	public List<Interval> merge(List<Interval> intervals) {
		List<IntervalWrapper> wrapperList = new ArrayList<IntervalWrapper>();
		for (Interval interval : intervals) {
			wrapperList.add(new IntervalWrapper(interval));
		}
		Collections.sort(wrapperList);
		
		int i = 0;
		do {
			int j = i + 1;
			while (j < wrapperList.size()) {
				boolean merged = attemptMerge(i, j, wrapperList);
				if (merged) {
					continue;
				}
				j++;
			}
			i++;
		} while (i < intervals.size());
		
		List<Interval> intervalList = new ArrayList<Interval>();
		for (IntervalWrapper intervalWrapper : wrapperList) {
			intervalList.add(intervalWrapper.interval);
		}
		return intervalList;
	}

	public class IntervalWrapper implements Comparable<IntervalWrapper> {

		public Interval interval;
		
		public IntervalWrapper(Interval interval) {
			this.interval = interval;
		}

		@Override
		public int compareTo(IntervalWrapper o) {
			if (this.interval.start > o.interval.start) {
				return 1;
			} else if (this.interval.start < o.interval.start) {
				return -1;
			} else if (this.interval.end > o.interval.end) {
				return 1;
			} else if (this.interval.end < o.interval.end) {
				return -1;
			}
			return 0;
		}

	}

	private static boolean attemptMerge(int i, int j, List<IntervalWrapper> intervals) {
		Interval one = intervals.get(i).interval;
		Interval two = intervals.get(j).interval;
		int max = Math.max(one.end, two.end);
		int min = Math.min(one.start, two.start);
		int gap = max - min;
		int gap1 = one.end - one.start;
		int gap2 = two.end - two.start;
		if (gap <= gap1 + gap2) {
			one.start = min;
			one.end = max;
			intervals.remove(j);
			return true;
		}
		return false;
	}

}
