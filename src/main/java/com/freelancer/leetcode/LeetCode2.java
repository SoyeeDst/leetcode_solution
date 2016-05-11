package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        boolean bit = false;
        boolean isFirst = true;
        ListNode newNode = null;
        ListNode firstNode = null;
        ListNode lastNode = null;
        while (l1 != null || l2 != null) {
            int value = 0;
            if (l1 == null) {
                value = l2.val;
            } else if (l2 == null) {
                value = l1.val;
            } else {
                value = l1.val + l2.val;
            }
            if (bit) {
                value = value + 1;
            }
            if (value >= 10) {
                value = value - 10;
                bit = true;
            } else {
                bit = false;
            }
            newNode = new ListNode(value);
            if (isFirst) {
                firstNode = newNode;
                isFirst = false;
            }
            if (lastNode != null) {
                lastNode.next = newNode;
            }
            lastNode = newNode;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        // The last digits
        if (bit) {
            newNode = new ListNode(1);
            lastNode.next = newNode;
        }
        return firstNode;
    }
}
