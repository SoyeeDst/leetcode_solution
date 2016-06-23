package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeLinkNode;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/23.
 */
public class LeetCode117Test {

    @Test
    public void testConnect() {
        LeetCode117 leetCode117 = new LeetCode117();
        TreeLinkNode stNode = new TreeLinkNode(1);
        TreeLinkNode ndNode = new TreeLinkNode(2);
        TreeLinkNode rdNode = new TreeLinkNode(3);
        TreeLinkNode fourthNode = new TreeLinkNode(4);
        TreeLinkNode fifthNode = new TreeLinkNode(5);
        TreeLinkNode svnthNode = new TreeLinkNode(7);
        stNode.left = ndNode;
        stNode.right = rdNode;
        ndNode.left = fourthNode;
        ndNode.right = fifthNode;
        rdNode.right = svnthNode;

        leetCode117.connect(stNode);
    }
}
