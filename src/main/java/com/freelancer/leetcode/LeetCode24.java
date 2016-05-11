package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode handlingNode = head;
        int index = 1;
        ListNode firstNode = head;
        ListNode oddNode = null;
        ListNode lastEvenNode = null;
        ListNode evenNode = null;
        while (handlingNode != null) {
            if (index % 2 == 1) {
                oddNode = handlingNode;
                handlingNode = handlingNode.next;
            } else {
                evenNode = handlingNode;
                oddNode.next = evenNode.next;
                evenNode.next = oddNode;
                if (lastEvenNode != null) {
                    lastEvenNode.next = evenNode;
                } else {
                    firstNode = evenNode;
                }
                // Empty cache data
                lastEvenNode = oddNode;
                handlingNode = oddNode.next;
                oddNode = null;
                evenNode = null;
            }
            index++;
        }
        return firstNode;
    }
}
