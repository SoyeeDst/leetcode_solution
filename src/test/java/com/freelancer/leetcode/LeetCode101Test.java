package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode101Test {

    @Test
    public void testJudgeSymmeric() {
        LeetCode101 leetCode101 = new LeetCode101();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(2);
        TreeNode rNode = new TreeNode(2);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(3);
        TreeNode lrNode = new TreeNode(4);
        lNode.left = llNode;
        lNode.right = lrNode;
        TreeNode rlNode = new TreeNode(4);
        TreeNode rrNode = new TreeNode(3);
        rNode.left = rlNode;
        rNode.right = rrNode;
        Assert.assertTrue(leetCode101.isSymmetric(treeNode));
    }

    @Test
    public void testJudgeSymmeric2() {
        LeetCode101 leetCode101 = new LeetCode101();
        TreeNode treeNode = new TreeNode(1);
        TreeNode lNode = new TreeNode(2);
        TreeNode rNode = new TreeNode(2);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode lrNode = new TreeNode(3);
        lNode.right = lrNode;
        TreeNode rrNode = new TreeNode(3);
        rNode.right = rrNode;
        Assert.assertFalse(leetCode101.isSymmetric(treeNode));
    }
}
