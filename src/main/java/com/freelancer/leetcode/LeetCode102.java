package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/6/21.
 */
public class LeetCode102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> resultList = new ArrayList<>();
        levelOrder(root, resultList, 0);
        return resultList;
    }

    private static void levelOrder(TreeNode root, List<List<Integer>> resultList, int depth) {
        List<Integer> originalList;
        if (resultList.size() < depth + 1) {
            originalList = new ArrayList<>();
            resultList.add(depth, originalList);
        } else {
            originalList = resultList.get(depth);
        }
        originalList.add(root.val);
        if (root.left != null) {
            levelOrder(root.left, resultList, depth + 1);
        }
        if (root.right != null) {
            levelOrder(root.right, resultList, depth + 1);
        }
    }

}
