package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.freelancer.leetcode.support.TreeNode;

public class LeetCode236 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (p.val == q.val) {
			return p;
		}

		List<TreeNode> treeNodes = new ArrayList<>();
		traverseTree(Collections.singletonList(root), treeNodes);

		List<TreeNode> pa = nodePath(treeNodes, p);
		List<TreeNode> qa = nodePath(treeNodes, q);
		for (TreeNode qaNode : qa) {
			if (pa.contains(qaNode)) {
				return qaNode;
			}
		}

		return root;
	}

	private static void traverseTree(List<TreeNode> sc, List<TreeNode> list) {
		boolean exit = true;
		for (TreeNode scNode : sc) {
			if (scNode != null) {
				exit = false;
				break;
			}
		}
		if (exit)
			return;
		list.addAll(sc);
		List<TreeNode> children = new ArrayList<>();
		for (TreeNode node : sc) {
			if (node != null) {
				children.add(node.left);
				children.add(node.right);
			}
		}
		traverseTree(children, list);
	}

	private static List<TreeNode> nodePath(List<TreeNode> list, TreeNode n) {
		List<TreeNode> paths = new ArrayList<>();
		int index = list.indexOf(n);
		do {
			if (list.get(index) == null) {
				break;
			}
			paths.add(list.get(index));
			if (index == 0) {
				break;
			}
			index = (index - 1) / 2;

		} while (index >= 0);

		return paths;
	}

}
