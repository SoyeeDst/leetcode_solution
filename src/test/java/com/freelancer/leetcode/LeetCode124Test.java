package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/6.
 */
public class LeetCode124Test {

    @Test
    public void testMaxPathSum() {
        LeetCode124 leetCode124 = new LeetCode124();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(2);
        TreeNode rNode = new TreeNode(3);
        treeNode.left = lNode;
        treeNode.right = rNode;
        Assert.assertEquals(6, leetCode124.maxPathSum(treeNode));
    }

    @Test
    public void testMaxPathSum2() {
        LeetCode124 leetCode124 = new LeetCode124();
        TreeNode treeNode = new TreeNode(-2);
        TreeNode lNode = new TreeNode(-1);
        treeNode.left = lNode;
        Assert.assertEquals(-1, leetCode124.maxPathSum(treeNode));
    }

    @Test
    public void testMaxPathSum3() {
        LeetCode124 leetCode124 = new LeetCode124();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(-2);
        TreeNode rNode = new TreeNode(-3);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(1);
        TreeNode lrNode = new TreeNode(3);
        lNode.left = llNode;
        lNode.right = lrNode;
        TreeNode rlNode = new TreeNode(-2);
        rNode.left = rlNode;
        TreeNode lllNode = new TreeNode(-1);
        llNode.left = lllNode;
        Assert.assertEquals(3, leetCode124.maxPathSum(treeNode));
    }

    @Test
    public void testMaxPathSum4() {
        LeetCode124 leetCode124 = new LeetCode124();
        TreeNode treeNode = new TreeNode(-2);
        TreeNode lNode = new TreeNode(6);
        treeNode.left = lNode;
        TreeNode llNode = new TreeNode(0);
        TreeNode lrNode = new TreeNode(-6);
        lNode.left = llNode;
        lNode.right = lrNode;
        Assert.assertEquals(6, leetCode124.maxPathSum(treeNode));
    }
}
