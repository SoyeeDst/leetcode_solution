package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeLinkNode;

/**
 * Created by Soyee on 2016/6/23.
 */
public class LeetCode116 {

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        TreeLinkNode node = root;
        connectNode(node);
    }

    public static void connectNode(TreeLinkNode node) {
        if (node.left != null) {
            node.left.next = node.right;

            if (node.next != null) {
                node.right.next = node.next.left;
            }

            connectNode(node.left);
            connectNode(node.right);
        }
    }
}
