package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by soyee on 2016/10/24.
 */
public class LeetCode173 {

    private Stack<TreeNode> valueStack = new Stack<TreeNode>();

    public LeetCode173(TreeNode root) {
        fillStack(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !valueStack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode nextNode = valueStack.pop();
        fillStack(nextNode.right);
        return nextNode.val;
    }

    /** @return all the members list */
    public void fillStack(TreeNode root) {
        TreeNode workingNode = root;
        while (workingNode != null) {
            valueStack.push(workingNode);
            workingNode = workingNode.left;
        }
    }
}
