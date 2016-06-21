package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode102Test {

    @Test
    public void testLevelOrder() {
        LeetCode102 leetCode102 = new LeetCode102();
        TreeNode treeNode = new TreeNode(3);
        TreeNode lNode = new TreeNode(9);
        TreeNode rNode = new TreeNode(20);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode rlNode = new TreeNode(15);
        TreeNode rrNode = new TreeNode(7);
        rNode.left = rlNode;
        rNode.right = rrNode;
        List<List<Integer>> levelOrderList = leetCode102.levelOrder(treeNode);
        Assert.assertEquals(3, levelOrderList.size());
    }

}
