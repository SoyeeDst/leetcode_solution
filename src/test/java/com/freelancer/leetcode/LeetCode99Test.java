package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/20.
 */
public class LeetCode99Test {

    @Test
    public void testRecoverTree() {
        LeetCode99 leetCode99 = new LeetCode99();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(2);
        TreeNode rNode = new TreeNode(3);
        treeNode.left = lNode;
        treeNode.right = rNode;
        leetCode99.recoverTree(treeNode);
        Assert.assertEquals(2, treeNode.val);
    }

    @Test
    public void testRecoverTree2() {
        LeetCode99 leetCode99 = new LeetCode99();
        TreeNode treeNode = new TreeNode(7);
        TreeNode lNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(8);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(2);
        TreeNode lrNode = new TreeNode(4);
        lNode.left = llNode;
        lNode.right = lrNode;
        TreeNode rlNode = new TreeNode(5);
        TreeNode rrNode = new TreeNode(9);
        rNode.left = rlNode;
        rNode.right = rrNode;
        leetCode99.recoverTree(treeNode);
        Assert.assertEquals(5, treeNode.val);
    }

    @Test
    public void testRecoverTree3() {
        LeetCode99 leetCode99 = new LeetCode99();
        TreeNode treeNode = new TreeNode(8);
        TreeNode lNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(5);
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
        leetCode99.recoverTree(treeNode);
        Assert.assertEquals(5, treeNode.val);
    }

    @Test
    public void testRecoverTree4() {
        LeetCode99 leetCode99 = new LeetCode99();
        TreeNode treeNode = new TreeNode(5);
        TreeNode lNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(9);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(2);
        TreeNode lrNode = new TreeNode(4);
        lNode.left = llNode;
        lNode.right = lrNode;
        TreeNode rlNode = new TreeNode(7);
        TreeNode rrNode = new TreeNode(8);
        rNode.left = rlNode;
        rNode.right = rrNode;
        leetCode99.recoverTree(treeNode);
        Assert.assertEquals(5, treeNode.val);
        Assert.assertEquals(8, treeNode.right.val);
    }

    @Test
    public void testRecoverTree5() {
        LeetCode99 leetCode99 = new LeetCode99();
        TreeNode treeNode = new TreeNode(2);
        TreeNode rNode = new TreeNode(1);
        treeNode.right = rNode;
        leetCode99.recoverTree(treeNode);
        Assert.assertEquals(1, treeNode.val);
    }

    @Test
    public void testRecoverTree6() {
        LeetCode99 leetCode99 = new LeetCode99();
        TreeNode treeNode = new TreeNode(2);
        TreeNode lNode = new TreeNode(3);
        TreeNode rNode = new TreeNode(1);
        treeNode.left = lNode;
        treeNode.right = rNode;
        leetCode99.recoverTree(treeNode);
        Assert.assertEquals(2, treeNode.val);
    }
}
