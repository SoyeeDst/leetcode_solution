package com.freelancer.leetcode;

import org.junit.Test;

import com.freelancer.leetcode.support.ListNode;

import junit.framework.Assert;

public class LeetCode328Test {
	
	@Test
    public void testOddEvenList1() {
		LeetCode328 leetcode = new LeetCode328();
		
		ListNode t1 = new ListNode(1);
		ListNode t2 = new ListNode(2);
		ListNode t3 = new ListNode(3);
		ListNode t4 = new ListNode(4);
		ListNode t5 = new ListNode(5);
		
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		t4.next = t5;
		
		ListNode wl = leetcode.oddEvenList(t1);
		Assert.assertEquals(1, wl.val);
		Assert.assertEquals(3, wl.next.val);
		Assert.assertEquals(5, wl.next.next.val);
		Assert.assertEquals(2, wl.next.next.next.val);
		Assert.assertEquals(4, wl.next.next.next.next.val);
	}
	
	@Test
    public void testOddEvenList2() {
		LeetCode328 leetcode = new LeetCode328();
		
		ListNode t2 = new ListNode(2);
		ListNode t1 = new ListNode(1);
		ListNode t3 = new ListNode(3);
		ListNode t5 = new ListNode(5);
		ListNode t6 = new ListNode(6);
		ListNode t4 = new ListNode(4);
		ListNode t7 = new ListNode(7);
		
		t2.next = t1;
		t1.next = t3;
		t3.next = t5;
		t5.next = t6;
		t6.next = t4;
		t4.next = t7;
		
		ListNode wl = leetcode.oddEvenList(t2);
		Assert.assertEquals(2, wl.val);
		Assert.assertEquals(3, wl.next.val);
		Assert.assertEquals(6, wl.next.next.val);
		Assert.assertEquals(7, wl.next.next.next.val);
		Assert.assertEquals(1, wl.next.next.next.next.val);
		Assert.assertEquals(5, wl.next.next.next.next.next.val);
		Assert.assertEquals(4, wl.next.next.next.next.next.next.val);
	}
	
	

}
