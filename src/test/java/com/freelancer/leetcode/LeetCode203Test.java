package com.freelancer.leetcode;

import org.junit.Test;

import com.freelancer.leetcode.support.ListNode;

public class LeetCode203Test {
	
	@Test
	public void testRemoveLink6() {
		LeetCode203 lc = new LeetCode203();
		
		ListNode listNode = new ListNode(1);
		ListNode er = new ListNode(2);
		ListNode liu = new ListNode(6);
		ListNode san = new ListNode(3);
		ListNode shi = new ListNode(4);
		ListNode wu = new ListNode(5);
		ListNode liu2 = new ListNode(6);
		listNode.next = er;
		er.next = liu;
		liu.next = san;
		san.next = shi;
		shi.next = wu;
		wu.next = liu2;
		
		lc.removeElements(listNode, 6);
	}
	
	@Test
	public void testRemoveHead() {
		LeetCode203 lc = new LeetCode203();
		
		ListNode listNode = new ListNode(1);
		ListNode yi1 = new ListNode(1);
		ListNode liu = new ListNode(6);
		ListNode san = new ListNode(3);
		ListNode shi = new ListNode(4);
		ListNode wu = new ListNode(5);
		ListNode liu2 = new ListNode(6);
		listNode.next = yi1;
		yi1.next = liu;
		liu.next = san;
		san.next = shi;
		shi.next = wu;
		wu.next = liu2;
		
		lc.removeElements(listNode, 1);
	}
	
	@Test
	public void testRemoveTail() {
		LeetCode203 lc = new LeetCode203();
		
		ListNode listNode = new ListNode(1);
		ListNode er = new ListNode(2);
		ListNode liu = new ListNode(6);
		ListNode san = new ListNode(3);
		ListNode shi = new ListNode(4);
		ListNode wu = new ListNode(5);
		ListNode wu2 = new ListNode(5);
		listNode.next = er;
		er.next = liu;
		liu.next = san;
		san.next = shi;
		shi.next = wu;
		wu.next = wu2;
		
		ListNode head = lc.removeElements(listNode, 5);
		System.err.println(head);
	}

}
