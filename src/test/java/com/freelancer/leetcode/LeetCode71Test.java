package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode71Test {

    @Test
    public void testSimplifyPath() {
        LeetCode71 leetCode71 = new LeetCode71();
        Assert.assertEquals("/home", leetCode71.simplifyPath("/home/"));
        Assert.assertEquals("/c", leetCode71.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void testSimplifyPath2() {
        LeetCode71 leetCode71 = new LeetCode71();
        Assert.assertEquals("/", leetCode71.simplifyPath("/a/b/../../"));
        Assert.assertEquals("/b/c", leetCode71.simplifyPath("../../a/../b/c"));
    }

    @Test
    public void testSimplifyPath3() {
        LeetCode71 leetCode71 = new LeetCode71();
        Assert.assertEquals("/e/f/g", leetCode71.simplifyPath("/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///"));
    }

}
