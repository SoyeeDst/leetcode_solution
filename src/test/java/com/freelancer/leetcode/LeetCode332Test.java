package com.freelancer.leetcode;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode332Test {
	
	@Test
	public void testObtainRoutes() {
		LeetCode332 leetCode = new LeetCode332();
		final List<String> xte = leetCode.findItinerary(new String[][]{{"MUC", "LHR"},{"JFK", "MUC"},{"SFO", "SJC"}, {"LHR", "SFO"}});
		Assert.assertEquals(5, xte.size());
		
		Assert.assertEquals("JFK", xte.get(0));
		
		Assert.assertEquals("MUC", xte.get(1));
		
		Assert.assertEquals("LHR", xte.get(2));
		
		Assert.assertEquals("SFO", xte.get(3));
		
		Assert.assertEquals("SJC", xte.get(4));
	}

	
	@Test
	public void testObtainRoutes2() {
		LeetCode332 leetCode = new LeetCode332();
		final List<String> xte = leetCode.findItinerary(new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"}, {"ATL","JFK"}, {"ATL","SFO"}});
		Assert.assertEquals(6, xte.size());
		
		Assert.assertEquals("JFK", xte.get(0));
		
		Assert.assertEquals("ATL", xte.get(1));
		
		Assert.assertEquals("JFK", xte.get(2));
		
		Assert.assertEquals("SFO", xte.get(3));
		
		Assert.assertEquals("ATL", xte.get(4));
		
		Assert.assertEquals("SFO", xte.get(5));
	}
	
	@Test
	public void testObtainRoutes3() {
		LeetCode332 leetCode = new LeetCode332();
		final List<String> xte = leetCode.findItinerary(new String[][] {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}});
		Assert.assertEquals(6, xte.size());
		
		Assert.assertEquals("JFK", xte.get(0));
		
		Assert.assertEquals("ATL", xte.get(1));
		
		Assert.assertEquals("JFK", xte.get(2));
		
		Assert.assertEquals("SFO", xte.get(3));
		
		Assert.assertEquals("ATL", xte.get(4));
		
		Assert.assertEquals("SFO", xte.get(5));
	}


}
