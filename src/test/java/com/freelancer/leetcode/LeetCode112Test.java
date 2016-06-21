package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode112Test {

    @Test
    public void testHasPathSum() {
        LeetCode112 leetCode112 = new LeetCode112();
        TreeNode treeNode = new TreeNode(5);
        TreeNode lNode = new TreeNode(4);
        TreeNode rNode = new TreeNode(8);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(11);
        lNode.left = llNode;
        TreeNode rlNode = new TreeNode(13);
        TreeNode rrNode = new TreeNode(4);
        rNode.left = rlNode;
        rNode.right = rrNode;
        TreeNode llNode2 = new TreeNode(7);
        TreeNode lrNode2 = new TreeNode(2);
        llNode.left = llNode2;
        llNode.right = lrNode2;
        TreeNode rrNode2 = new TreeNode(1);
        rrNode.right = rrNode2;

        Assert.assertTrue(leetCode112.hasPathSum(treeNode, 22));
    }
}
