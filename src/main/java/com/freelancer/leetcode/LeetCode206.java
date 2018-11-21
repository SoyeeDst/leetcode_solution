package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

public class LeetCode206 {

	public ListNode reverseList(ListNode head) {
       if (head == null) {
    	   return null;
       }
       
       ListNode newhead = null;
       ListNode node = head;
       
       while (node != null) {
    	   ListNode nextNode = node.next;
    	   node.next = newhead;
    	   newhead = node;
    	   node = nextNode;
       }
       
       return newhead;
	}

}
