package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

import java.util.Stack;

/**
 * Created by Soyee on 2016/7/24.
 */
public class LeetCode143 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
             return;
        }

        Stack<ListNode> sliceNode = slice(head);
        ListNode node = head;
        while (node != null) {
            ListNode nextNode = node.next;
            if (sliceNode.isEmpty()) {
                 break;
            }
            insertNode(node, sliceNode.pop());
            node = nextNode;
        }
    }

    private static void insertNode(ListNode node, ListNode insertNode) {
        ListNode nextNode = node.next;
        node.next = insertNode;
        insertNode.next = nextNode;
    }

    private static Stack<ListNode> slice(ListNode head) {
        int cnr = 0;
        ListNode node = head;
        while (node != null) {
            cnr++;
            node = node.next;
        }
        int sliceCnt = cnr / 2;
        int idx = 0;
        node = head;
        ListNode lastNode = null;
        while (idx < cnr - sliceCnt) {
            lastNode = node;
            node = node.next;
            idx++;
        }
        lastNode.next = null;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        return stack;
    }

}
