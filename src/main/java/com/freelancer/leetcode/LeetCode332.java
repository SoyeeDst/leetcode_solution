package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LeetCode332 {

	public List<String> findItinerary(String[][] tickets) {
		if (tickets == null || tickets.length == 0) {
			return Collections.emptyList();
		}
		
		Map<String, List<String>> itM = new HashMap<>();
		List<String> x;
		for (int i = 0; i < tickets.length; i++) {
			if (!itM.containsKey(tickets[i][0])) {
				x = new ArrayList<String>();
			} else {
				x = itM.get(tickets[i][0]);
			}
			x.add(tickets[i][1]);
			Collections.sort(x);
			itM.put(tickets[i][0], x);
		}
		
		String now = "JFK";
		Stack<String> y = new Stack<>();
		y.push(now);
		while (y.size() < tickets.length + 1) {
		    if (!itM.containsKey(now) || itM.get(now) == null || itM.get(now).size() == 0) {
		    	now = y.pop();
		    	continue;
		    } 
		    
		    List<String> opsList = itM.get(now); 
		    String xx = opsList.remove(0);
		    y.push(xx);
		    now = xx;
		}
		
		List<String> routes = new ArrayList<>();
		routes.addAll(y);
		
		return routes;
	}
	
}
