package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/3.
 */
public class LeetCode61Test {

    private static ListNode linker(int ... nums) {
        ListNode last = null;
        ListNode head = null;
        for (int num : nums) {
            ListNode newNode = new ListNode(num);
            if (last != null) {
                last.next = newNode;
            }
            last = newNode;
            if (head == null) {
                head = newNode;
            }
        }
        return head;
    }

    @Test
    public void testRotateRight() {
        LeetCode61 leetCode61 = new LeetCode61();
        ListNode listNode = leetCode61.rotateRight(linker(1, 2, 3, 4, 5), 2);
        ListNode listNode2 = leetCode61.rotateRight(linker(1, 2), 1);
    }
}
