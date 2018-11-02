package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

public class LeetCode328 {

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode ot = null;
		ListNode eh = null;
		ListNode et = null;

		ListNode n = head;
		int c = 1;
		while (n != null) {
			ListNode nex = n.next;
			n.next = null;
			if (c % 2 == 1) {
				if (ot != null) {
					ot.next = n;
				} 
				ot = n;
			} else {
                if (et != null) {
                	et.next = n;
                } 
                et = n;
                if (eh == null) {
                	eh = et;
                }
			}
			c++;
			n = nex;
		}
		
        ot.next = eh;
		return head;

	}

}
