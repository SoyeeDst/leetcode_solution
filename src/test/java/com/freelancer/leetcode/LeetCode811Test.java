package com.freelancer.leetcode;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode811Test {
	
	@Test
	public void testSubdomainVisits() {
	     LeetCode811 leetcode = new LeetCode811();
	     List<String> statsList = leetcode.subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
	     Assert.assertTrue(statsList.contains("901 mail.com"));
	     Assert.assertTrue(statsList.contains("50 yahoo.com"));
	     Assert.assertTrue(statsList.contains("900 google.mail.com"));
	     Assert.assertTrue(statsList.contains("5 wiki.org"));
	     Assert.assertTrue(statsList.contains("5 org"));
	     Assert.assertTrue(statsList.contains("1 intel.mail.com"));
	     Assert.assertTrue(statsList.contains("951 com"));
	}

}
