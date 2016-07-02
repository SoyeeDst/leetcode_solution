package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by Soyee on 2016/7/2.
 */
public class LeetCode113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> pl = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        pathSum(root, pl, sum, st);
        return pl;
    }

    private static void pathSum(TreeNode node, List<List<Integer>> pl, int sum, Stack<Integer> st) {
        st.push(node.val);
        if (node.left == null && node.right == null) {
            if (sum == node.val) {
                // copy
                pl.add(Collections.list(st.elements()));
                st.pop();
                return;
            }
        }

        if (node.left != null) {
            pathSum(node.left, pl, sum - node.val, st);
        }

        if (node.right != null) {
            pathSum(node.right, pl, sum - node.val, st);
        }

        if (!st.isEmpty()) {
            st.pop();
        }
    }

}
