package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode811 {

	public List<String> subdomainVisits(String[] cpdomains) {
		if (cpdomains == null || cpdomains.length == 0) {
			return Collections.emptyList();
		}

		Map<String, Integer> statsMap = new HashMap<>();
		for (String cpdomain : cpdomains) {
			analyzeDomainStats(cpdomain, statsMap);
		}

		List<String> x = new ArrayList<>();
		for (String domain : statsMap.keySet()) {
			x.add(statsMap.get(domain) + " " + domain);
		}

		return x;
	}

	private static void analyzeDomainStats(String cpdomain, Map<String, Integer> statsMap) {
		String[] clips = cpdomain.split(" ");
		int cnt = Integer.parseInt(clips[0]);
		String domain = clips[1];
		do {
			int val = cnt;
			if (statsMap.containsKey(domain)) {
				val = val + statsMap.get(domain);
			}
			statsMap.put(domain, val);

			if (domain.indexOf(".") < 0) {
				return;
			}

			domain = domain.substring(domain.indexOf(".") + 1);
		} while (domain != null);
	}

}
