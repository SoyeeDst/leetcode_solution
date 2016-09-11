package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/7/26.
 */
public class LeetCode145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> rl = new ArrayList<>();

        if (root.left != null) {
            rl.addAll(postorderTraversal(root.left));
        }

        if (root.right != null) {
            rl.addAll(postorderTraversal(root.right));
        }
        rl.add(root.val);
        return rl;
    }
}
