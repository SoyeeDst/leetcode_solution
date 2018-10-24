package com.freelancer.leetcode;

import org.junit.Test;

import com.freelancer.leetcode.support.TreeNode;

import junit.framework.Assert;

public class LeetCode236Test {
	
	@Test
    public void testLCA() {
		LeetCode236 leetCode236 = new LeetCode236();
        
		TreeNode root = new TreeNode(3);
		TreeNode l11 = new TreeNode(5);
		TreeNode l12 = new TreeNode(1);
		root.left = l11;
		root.right = l12;
		
		TreeNode l21 = new TreeNode(6);
		TreeNode l22 = new TreeNode(2);
	    l11.left = l21;
	    l11.right = l22;
	    
	    TreeNode l23 = new TreeNode(0);
		TreeNode l24 = new TreeNode(8);
		l12.left = l23;
		l12.right = l24;
		
		TreeNode l31 = new TreeNode(7);
		TreeNode l32 = new TreeNode(4);
		l22.left = l31;
		l22.right = l32;
		
		TreeNode matchNode = leetCode236.lowestCommonAncestor(root, l11, l12);
		Assert.assertEquals(3, matchNode.val);
		
		matchNode = leetCode236.lowestCommonAncestor(root, l11, l32);
		Assert.assertEquals(5, matchNode.val);
		
    }

}
