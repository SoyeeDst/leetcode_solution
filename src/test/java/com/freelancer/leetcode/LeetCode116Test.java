package com.freelancer.leetcode;

import com.freelancer.leetcode.support.TreeLinkNode;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/23.
 */
public class LeetCode116Test {

    @Test
    public void testConnect() {
        LeetCode116 leetCode116 = new LeetCode116();
        TreeLinkNode stNode = new TreeLinkNode(1);
        TreeLinkNode ndNode = new TreeLinkNode(2);
        TreeLinkNode rdNode = new TreeLinkNode(3);
        TreeLinkNode fourthNode = new TreeLinkNode(4);
        TreeLinkNode fifthNode = new TreeLinkNode(5);
        TreeLinkNode sixthNode = new TreeLinkNode(6);
        TreeLinkNode svnthNode = new TreeLinkNode(7);
        stNode.left = ndNode;
        stNode.right = rdNode;
        ndNode.left = fourthNode;
        ndNode.right = fifthNode;
        rdNode.left = sixthNode;
        rdNode.right = svnthNode;

        leetCode116.connect(stNode);
    }
}
