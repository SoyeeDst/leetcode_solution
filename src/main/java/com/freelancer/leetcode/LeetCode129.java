package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.Stack;

/**
 * Created by Soyee on 2016/7/11.
 */
public class LeetCode129 {

    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum = 0;
        TreeNode curr;
        Stack<TreeNode> ws = new Stack<TreeNode>();
        ws.push(root);

        while(!ws.empty()){
            curr = ws.pop();

            if(curr.right!=null){
                curr.right.val = curr.val*10+curr.right.val;
                ws.push(curr.right);
            }

            if(curr.left!=null){
                curr.left.val = curr.val*10+curr.left.val;
                ws.push(curr.left);
            }

            if(curr.left==null && curr.right==null){ // leaf node
                sum+=curr.val;
            }
        }
        return sum;
    }
}
