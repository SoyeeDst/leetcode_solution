package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(depthForTree(root.left, 1), depthForTree(root.right, 1));
    }

    private static int depthForTree(TreeNode node, int elapsedDepth) {
        if (node == null) {
            return elapsedDepth;
        }
        return Math.max(depthForTree(node.left, elapsedDepth + 1), depthForTree(node.right, elapsedDepth + 1));
    }
}
