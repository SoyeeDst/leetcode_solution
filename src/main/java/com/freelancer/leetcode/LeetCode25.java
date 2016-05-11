package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;

/**
 * Created by Soyee on 2016/5/11.
 */
public class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return head;
        }
        ListNode handlingNode = head;
        int index = 1;
        ListNode firstNode = null;
        ListNode firstNodeOfGroup = null;
        ListNode lastNodeOfLastGroup = null;
        ListNode lastNodeOfGroup = null;
        while (handlingNode != null) {
            if (index % k == 1) {
                firstNodeOfGroup = handlingNode;
                handlingNode = handlingNode.next;
            } else if (index % k == 0) {
                lastNodeOfGroup = handlingNode;
                adjustSubGroup(firstNodeOfGroup, lastNodeOfGroup, k);
                if (firstNode == null) {
                    firstNode = firstNodeOfGroup;
                }
                if (lastNodeOfLastGroup != null) {
                    lastNodeOfLastGroup.next = firstNodeOfGroup;
                }
                lastNodeOfLastGroup = lastNodeOfGroup;
                handlingNode = handlingNode.next;
            } else {
                handlingNode = handlingNode.next;
            }
            index++;
        }
        if (firstNode == null) {
            firstNode = head;
        }
        return firstNode;
    }

    public void adjustSubGroup(ListNode head, ListNode tail, int k) {
        ListNode tempNode = head;
        int index = 0;
        int triesCount = k / 2 - 1;
        while (tempNode != null & triesCount >= 0) {
            int tempNodeValue = tempNode.val;
            int offset = k - index - 1 - index;
            ListNode remoteNode = tempNode;
            while (offset > 0) {
                remoteNode = remoteNode.next;
                offset--;
            }
            int remoteVal = remoteNode.val;
            // Swap the value for two nodes
            remoteNode.val = tempNodeValue;
            tempNode.val = remoteVal;
            tempNode = tempNode.next;
            triesCount--;
            index++;
        }
    }
}
