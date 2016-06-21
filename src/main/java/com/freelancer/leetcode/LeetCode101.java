package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return judge(root.left, root.right);
    }

    private static boolean judge(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode != null) {
            return false;
        } else if (leftNode != null && rightNode == null) {
            return false;
        } else if (leftNode == null && rightNode == null) {
            return true;
        } else if (leftNode.val != rightNode.val) {
            return false;
        }
        if (!judge(leftNode.left, rightNode.right)) {
            return false;
        }
        return judge(leftNode.right, rightNode.left);
    }


}
