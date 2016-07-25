package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/7/25.
 */
public class LeetCode144Test {

    @Test
    public void testPreorderTraversal() {
        LeetCode144 leetCode144 = new LeetCode144();
        TreeNode treeNode = new TreeNode(1);
        TreeNode rNode = new TreeNode(2);
        treeNode.right = rNode;
        TreeNode lNode = new TreeNode(3);
        rNode.left = lNode;
        List<Integer> nodeVals = leetCode144.preorderTraversal(treeNode);
        Assert.assertEquals(3, nodeVals.size());
        Assert.assertEquals(1, nodeVals.get(0).intValue());
        Assert.assertEquals(2, nodeVals.get(1).intValue());
        Assert.assertEquals(3, nodeVals.get(2).intValue());
    }
}
