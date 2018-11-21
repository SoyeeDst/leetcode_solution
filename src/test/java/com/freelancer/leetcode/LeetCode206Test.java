package com.freelancer.leetcode;

import org.junit.Test;

import com.freelancer.leetcode.support.ListNode;

public class LeetCode206Test {
	
	@Test
	public void testReverseList() {
		LeetCode206 leetcode = new LeetCode206();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode newHead = leetcode.reverseList(n1);
		
	}

}
