package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/7/25.
 */
public class LeetCode144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> rl = new ArrayList<>();
        rl.add(root.val);
        if (root.left != null) {
            rl.addAll(preorderTraversal(root.left));
        }

        if (root.right != null) {
            rl.addAll(preorderTraversal(root.right));
        }

        return rl;
    }
}
