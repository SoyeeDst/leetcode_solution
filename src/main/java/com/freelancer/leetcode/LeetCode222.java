package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

public class LeetCode222 {

	public int countNodes(TreeNode root) {
		int h = len(root);
		if (h < 0) {
			return 0;
		}

		int hr = len(root.right);
		return (hr == h - 1) ? (1 << h) + countNodes(root.right) : (1 << h - 1) + countNodes(root.left);
	}

	static int len(TreeNode root) {
		return root == null ? -1 : 1 + len(root.left);
	}

}
