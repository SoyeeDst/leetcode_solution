package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode firstNode = null;
        ListNode lastNode = null;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        while (currentNode1 != null && currentNode2 != null) {
            ListNode newTemp = null;
            if (currentNode1.val < currentNode2.val) {
                newTemp = new ListNode(currentNode1.val);
                currentNode1 = currentNode1.next;
            } else {
                newTemp = new ListNode(currentNode2.val);
                currentNode2 = currentNode2.next;
            }
            if (lastNode != null) {
                lastNode.next = newTemp;
            }
            if (firstNode == null) {
                firstNode = newTemp;
            }
            lastNode = newTemp;
        }
        // Check which part becomes Empty
        ListNode legacyNode = null;
        if (currentNode1 == null) {
            if (currentNode2 != null) {
                legacyNode = currentNode2;
            }
        } else {
            legacyNode = currentNode1;
        }
        while (legacyNode != null) {
            ListNode newNode = new ListNode(legacyNode.val);
            if (firstNode == null) {
                firstNode = newNode;
            }
            if (lastNode != null) {
                lastNode.next = newNode;
            }
            legacyNode = legacyNode.next;
            lastNode = newNode;
        }
        return firstNode;
    }
}
