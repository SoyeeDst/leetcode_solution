package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/7/2.
 */
public class LeetCode113Test {

    @Test
    public void testPathSum() {
        LeetCode113 code113 = new LeetCode113();
        TreeNode treeNode = new TreeNode(5);
        TreeNode lNode = new TreeNode(4);
        TreeNode rNode = new TreeNode(8);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(11);
        TreeNode rlNode = new TreeNode(13);
        TreeNode rrNode = new TreeNode(4);
        lNode.left = llNode;
        rNode.left = rlNode;
        rNode.right = rrNode;
        TreeNode lNode1 = new TreeNode(7);
        TreeNode lNode2 = new TreeNode(2);
        TreeNode lNode3 = new TreeNode(5);
        TreeNode lNode4 = new TreeNode(1);
        llNode.left = lNode1;
        llNode.right = lNode2;
        rrNode.left = lNode3;
        rrNode.right = lNode4;
        List<List<Integer>> dl = code113.pathSum(treeNode, 22);
        Assert.assertEquals(2, dl.size());
        Assert.assertEquals("5,4,11,2" , StringUtils.join(dl.get(0).toArray(), ","));
        Assert.assertEquals("5,8,4,5" , StringUtils.join(dl.get(1).toArray(), ","));
    }

    @Test
    public void testPathSumWithMinus() {
        LeetCode113 code113 = new LeetCode113();
        TreeNode treeNode = new TreeNode(5);
        TreeNode lNode = new TreeNode(4);
        TreeNode rNode = new TreeNode(8);
        treeNode.left = lNode;
        treeNode.right = rNode;
        TreeNode llNode = new TreeNode(11);
        TreeNode lrNode = new TreeNode(20);
        TreeNode rlNode = new TreeNode(13);
        TreeNode rrNode = new TreeNode(4);
        lNode.left = llNode;
        lNode.right = lrNode;
        rNode.left = rlNode;
        rNode.right = rrNode;
        TreeNode lNode1 = new TreeNode(7);
        TreeNode lNode2 = new TreeNode(2);
        TreeNode lNode3 = new TreeNode(5);
        TreeNode lNode4 = new TreeNode(1);
        TreeNode lNode5 = new TreeNode(-7);
        llNode.left = lNode1;
        llNode.right = lNode2;
        rrNode.left = lNode3;
        rrNode.right = lNode4;
        lrNode.left = lNode5;
        List<List<Integer>> dl = code113.pathSum(treeNode, 22);
        Assert.assertEquals(3, dl.size());
        Assert.assertEquals("5,4,11,2" , StringUtils.join(dl.get(0).toArray(), ","));
        Assert.assertEquals("5,4,20,-7" , StringUtils.join(dl.get(1).toArray(), ","));
        Assert.assertEquals("5,8,4,5" , StringUtils.join(dl.get(2).toArray(), ","));
    }

}

