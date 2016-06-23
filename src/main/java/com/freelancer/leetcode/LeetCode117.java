package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeLinkNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Soyee on 2016/6/23.
 */
public class LeetCode117 {

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        List<TreeLinkNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while ((nodeList = perLayer(nodeList)).size() != 0) {

        }

    }

    public static List<TreeLinkNode> perLayer(List<TreeLinkNode> nodeList) {

        List<TreeLinkNode> nodeList2 = new ArrayList<>();
        for (TreeLinkNode node : nodeList) {
            if (node.left != null) {
                nodeList2.add(node.left);
            }
            if (node.right != null) {
                nodeList2.add(node.right);
            }

        }

        for (int index = 0; index < nodeList2.size() - 1;index++) {
            nodeList2.get(index).next = nodeList2.get(index + 1);
        }

        return nodeList2;
    }
}
