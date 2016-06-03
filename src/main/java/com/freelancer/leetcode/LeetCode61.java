package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        ListNodeStatus nodeStatus = lastNode(head);
        if (k % nodeStatus.size == 0) {
            return head;
        }
        k = k % nodeStatus.size;
        return rotateOffSet(head, nodeStatus.size - k, nodeStatus.lastNode);
    }

    private static ListNodeStatus lastNode(ListNode head) {
        int count = 0;
        ListNode tail = null;
        while (head != null) {
            count++;
            tail = head;
            head = head.next;
        }
        ListNodeStatus status = new ListNodeStatus();
        status.lastNode = tail;
        status.size = count;
        return status;
    }

    private static class ListNodeStatus {
        public ListNode lastNode;
        public int size;
    }

    private static ListNode rotateOffSet(ListNode head, int offset, ListNode tail) {
        int index = 0;
        ListNode startNode = head;
        ListNode currentNode;
        do {
            currentNode = head;
            head = head.next;
            index++;
        } while (index < offset);
        currentNode.next = null;
        tail.next = startNode;
        return head;
    }
}
