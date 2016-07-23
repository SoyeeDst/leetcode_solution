package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/11.
 */
public class LeetCode129Test {

    @Test
    public void testSumNumbers() {
        LeetCode129 leetCode129 = new LeetCode129();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(0);
        treeNode.left = lNode;
        Assert.assertEquals(10, leetCode129.sumNumbers(treeNode));
    }

    @Test
    public void testSumNumbers2() {
        LeetCode129 leetCode129 = new LeetCode129();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(2);
        TreeNode rNode = new TreeNode(3);
        treeNode.left = lNode;
        treeNode.right = rNode;
        Assert.assertEquals(25, leetCode129.sumNumbers(treeNode));
    }

    @Test
    public void testSumNumbers3() {
        LeetCode129 leetCode129 = new LeetCode129();
        TreeNode treeNode = new TreeNode(0);
        TreeNode lNode = new TreeNode(1);
        TreeNode rNode = new TreeNode(3);
        treeNode.left = lNode;
        treeNode.right = rNode;
        Assert.assertEquals(4, leetCode129.sumNumbers(treeNode));
    }
}
