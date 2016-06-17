package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/17.
 */
public class LeetCode98Test {

    @Test
    public void testIsValidBST() {
        LeetCode98 leetCode98 = new LeetCode98();
        TreeNode treeNode = new TreeNode(2);
        TreeNode lNode = new TreeNode(1);
        TreeNode rNode = new TreeNode(3);
        treeNode.left = lNode;
        treeNode.right = rNode;
        Assert.assertTrue(leetCode98.isValidBST(treeNode));
    }

    @Test
    public void testIsValidBST2() {
        LeetCode98 leetCode98 = new LeetCode98();
        TreeNode treeNode = new TreeNode(5);
        TreeNode lNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(8);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(2);
        TreeNode lrNode = new TreeNode(4);
        lNode.left = llNode;
        lNode.right = lrNode;
        TreeNode rlNode = new TreeNode(7);
        TreeNode rrNode = new TreeNode(9);
        rNode.left = rlNode;
        rNode.right = rrNode;
        Assert.assertTrue(leetCode98.isValidBST(treeNode));
    }


    @Test
    public void testIsValidBST3() {
        LeetCode98 leetCode98 = new LeetCode98();
        TreeNode treeNode = new TreeNode(5);
        TreeNode lNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(8);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(2);
        TreeNode lrNode = new TreeNode(5);
        lNode.left = llNode;
        lNode.right = lrNode;
        TreeNode rlNode = new TreeNode(7);
        TreeNode rrNode = new TreeNode(9);
        rNode.left = rlNode;
        rNode.right = rrNode;
        Assert.assertFalse(leetCode98.isValidBST(treeNode));
    }

    @Test
    public void testIsValidBST4() {
        LeetCode98 leetCode98 = new LeetCode98();
        TreeNode treeNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(30);
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(10);
        rNode.left = llNode;
        TreeNode rlNode = new TreeNode(15);
        TreeNode rrNode = new TreeNode(45);
        llNode.right = rlNode;
        rlNode.right = rrNode;
        Assert.assertFalse(leetCode98.isValidBST(treeNode));
    }
}
