package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        if (lists.length == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }
        // Binary merge, great!!!
        int length = lists.length;
        ListNode leftNode = recursiveMerge(lists, 0, length/2 - 1);
        ListNode rightNode = recursiveMerge(lists, length/2, length - 1);
        return mergeTwoLists(leftNode, rightNode);
    }

    public ListNode recursiveMerge(ListNode[] lists, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            if (startIndex == endIndex) {
                return lists[startIndex];
            }
            if (endIndex - startIndex == 1) {
                return mergeTwoLists(lists[startIndex], lists[endIndex]);
            }
            ListNode leftNode = recursiveMerge(lists, startIndex, (endIndex + startIndex) / 2 - 1);
            ListNode rightNode = recursiveMerge(lists, (endIndex + startIndex) / 2 , endIndex);
            return mergeTwoLists(leftNode, rightNode);
        }
        return null;
    }

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
