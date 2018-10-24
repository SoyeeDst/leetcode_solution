package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

public class LeetCode203 {

	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		ListNode pre = null;
		ListNode node = head;
		do {
			if (node.val == val) {
				if (pre != null) {
					pre.next = node.next;
				} else {
					head = node.next;
				}
			} else {
				pre = node;
			}
			node = node.next;
		} while (node != null);
		
		return head;
	}

}
