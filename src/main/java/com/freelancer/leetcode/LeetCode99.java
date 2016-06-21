package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Soyee on 2016/6/17.
 */
public class LeetCode99 {

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        List<TreeNode> pl = new ArrayList<>();
        flat(root, pl);

        if (pl.size() == 1) {
            return;
        }

        TreeNode lst = null;
        TreeNode nd = null;

        int i = 1;
        do {
            int val = pl.get(i).val;
            if (val < pl.get(i - 1).val) {
                if (lst == null) {
                    lst = pl.get(i - 1);
                    nd = pl.get(i);
                } else {
                    nd = pl.get(i);
                }
            }
            i++;
        } while (i < pl.size());

        int temp = lst.val;
        lst.val = nd.val;
        nd.val = temp;

    }

    public void flat(TreeNode root, List<TreeNode> pl) {
        if (root.left != null) {
            flat(root.left, pl);
        }
        pl.add(root);
        if (root.right != null) {
            flat(root.right, pl);
        }
    }

}
