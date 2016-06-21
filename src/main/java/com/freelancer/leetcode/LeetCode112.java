package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return (sum == root.val);
        return (hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
    }
}
