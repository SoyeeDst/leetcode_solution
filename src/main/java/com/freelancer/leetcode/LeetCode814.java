package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

public class LeetCode814 {

	public TreeNode pruneTree(TreeNode root) {
         if (root == null) {
        	 return null;
         }
         
         trimTree(root.left, root, true);
         trimTree(root.right, root, false);
         
         return root;
	}
	
	private static void trimTree(TreeNode node, TreeNode parent, boolean isLeft) {
		if (node == null) {
			return;
		}
		
		int lc = node.left == null ? 0 : node.left.val;
		int rc = node.right == null ? 0 : node.right.val;
		if (node.val == 0 && lc == 0 && rc == 0) {
			 if (isLeft) {
				 parent.left = null;
			 } else {
				 parent.right = null;
			 }
			 return;
		}
		
		if (node.left != null) {
			trimTree(node.left, node, true);
		}
		
		if (node.right != null) {
			trimTree(node.right, node, false);
		}
	}

}
