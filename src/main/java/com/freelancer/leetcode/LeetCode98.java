package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.freelancer.leetcode.support.TreeNode;

/**
 * Created by Soyee on 2016/6/17.
 */
public class LeetCode98 {

    // DFS check
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        List<TreeNode> pl = new ArrayList<>();
        flat(root, pl);

        for (int index = 1; index < pl.size(); index++) {
            if (pl.get(index).val <= pl.get(index - 1).val) {
                return false;
            }
        }
        return true;
    }

    public void flat(TreeNode root, List<TreeNode> pl) {
        if (root.left != null) {
            flat(root.left, pl);
        }
        pl.add(root);
        if (root.right != null) {
            flat(root.right, pl);
        }
    }

}
