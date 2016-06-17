package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Created by Soyee on 2016/6/17.
 */
public class LeetCode98 {

    // DFS check
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.left.val >= root.val) {
                return false;
            }
            Stack<Cond> conditions = new Stack<>();
            conditions.push(new Cond(true, root.val));
            if (!isValidBST(root.left, conditions)) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.right.val <= root.val) {
                return false;
            }
            Stack<Cond> conditions = new Stack<>();
            conditions.push(new Cond(false, root.val));
            if (!isValidBST(root.right, conditions)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidBST(TreeNode treeNode, Stack<Cond> conditions) {
        if (treeNode.left != null) {
            if (treeNode.left.val >= treeNode.val) {
                return false;
            }

            Enumeration<Cond> enumeration =  conditions.elements();
            while (enumeration.hasMoreElements()) {
                Cond cond = enumeration.nextElement();
                if (!cond.leftTree) {
                    if (treeNode.left.val <= cond.value) {
                        return false;
                    }
                } else {
                    if (treeNode.left.val >= cond.value) {
                        return false;
                    }
                }
            }

            conditions.push(new Cond(true, treeNode.val));
            if (!isValidBST(treeNode.left, conditions)) {
                return false;
            }
        }

        if (treeNode.right != null) {
            if (treeNode.right.val <= treeNode.val) {
                return false;
            }

            Enumeration<Cond> enumeration =  conditions.elements();
            while (enumeration.hasMoreElements()) {
                Cond cond = enumeration.nextElement();
                if (!cond.leftTree) {
                    if (treeNode.right.val <= cond.value) {
                        return false;
                    }
                } else {
                    if (treeNode.right.val >= cond.value) {
                        return false;
                    }
                }
            }

            conditions.push(new Cond(false, treeNode.val));
            if (!isValidBST(treeNode.right, conditions)) {
                return false;
            }
        }

        conditions.pop();
        return true;
    }


    private static class Cond {
        public boolean leftTree;
        public int value;

        public Cond(boolean leftTree, int value) {
            this.leftTree = leftTree;
            this.value = value;
        }
    }

}
