package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.freelancer.leetcode.support.ListNode;

public class LeetCode382 {
	
private List<Integer> valList = new ArrayList<>();
    
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LeetCode382(ListNode head) {
        ListNode n = head;
        while (n != null) {
            valList.add(n.val);
            n = n.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int n = valList.size();
        int num = (int) (Math.random() * n);
        return valList.get(num);
    }

}
