package com.freelancer.leetcode;

import com.freelancer.leetcode.support.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/24.
 */
public class LeetCode143Test {

    @Test
    public void testReorderList0() {
        LeetCode143 leetCode143 = new LeetCode143();
        ListNode listNode = new ListNode(1);
        leetCode143.reorderList(listNode);
        Assert.assertEquals(1, listNode.val);
        ListNode ndNode = new ListNode(2);
        listNode.next = ndNode;
        leetCode143.reorderList(listNode);
        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(2, listNode.next.val);
    }

    @Test
    public void testReorderList() {
        LeetCode143 leetCode143 = new LeetCode143();
        ListNode listNode = new ListNode(1);
        ListNode ndNode = new ListNode(2);
        ListNode rdNode = new ListNode(3);
        ListNode fthNode = new ListNode(4);
        listNode.next = ndNode;
        ndNode.next = rdNode;
        rdNode.next = fthNode;
        leetCode143.reorderList(listNode);
        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(4, listNode.next.val);
        Assert.assertEquals(2, listNode.next.next.val);
        Assert.assertEquals(3, listNode.next.next.next.val);
    }

    @Test
    public void testReorderList2() {
        LeetCode143 leetCode143 = new LeetCode143();
        ListNode listNode = new ListNode(1);
        ListNode ndNode = new ListNode(2);
        ListNode rdNode = new ListNode(3);
        ListNode fthNode = new ListNode(4);
        ListNode fithNode = new ListNode(5);
        listNode.next = ndNode;
        ndNode.next = rdNode;
        rdNode.next = fthNode;
        fthNode.next = fithNode;
        leetCode143.reorderList(listNode);
        Assert.assertEquals(1, listNode.val);
        Assert.assertEquals(5, listNode.next.val);
        Assert.assertEquals(2, listNode.next.next.val);
        Assert.assertEquals(4, listNode.next.next.next.val);
        Assert.assertEquals(3, listNode.next.next.next.next.val);
    }
}
