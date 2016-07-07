package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

/**
 * Created by Soyee on 2016/7/6.
 */
public class LeetCode124 {

    public int maxPathSum(TreeNode root) {
        if (root == null) {
           return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        Integer mtt[] = recursiveCalculate(root);
        return mtt[0] > mtt[1] ? mtt[0] : mtt[1];
    }

    private static Integer[] recursiveCalculate(TreeNode n) {
        Integer[] res = new Integer[2];
        if (n == null) {
            res[0] = 0;
            return res;
        }

        Integer l[] = recursiveCalculate(n.left);
        Integer r[] =  recursiveCalculate(n.right);
        int l1 = Math.max(Math.max(l[0] + n.val, r[0] + n.val), n.val);
        res[0] = l1;

        if (l[1] != null && r[1] != null) {
            res[1] = Math.max(Math.max(l[1], r[1]), l[0] + r[0] + n.val);
        } else if (l[1] == null && r[1] != null) {
            res[1] = Math.max(r[1], r[0] + n.val);
        } else if (l[1] != null && r[1] == null) {
            res[1] = Math.max(l[1], l[0] + n.val);
        } else {
            res[1] = n.val;
        }
        if (res[1] < res[0]) {
            res[1] = res[0];
        }
        return res;
    }
}
