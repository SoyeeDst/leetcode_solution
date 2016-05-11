package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode firstNode = head;
        while(firstNode != null) {
            length++;
            firstNode = firstNode.next;
        }
        int offset = length - n;
        // Here I need to remove the positive th nodes from LinkedList
        firstNode = head;
        int index = 0;
        ListNode preNode = null;
        ListNode currentNode = null;
        while (offset >= 0) {
            currentNode = firstNode;
            firstNode = firstNode.next;
            if (offset > 0) {
                preNode = currentNode;
            }
            offset--;
        }
        if (preNode == null) {
            return currentNode.next;
        } else {
            preNode.next = currentNode.next;
            return head;
        }
    }


}
