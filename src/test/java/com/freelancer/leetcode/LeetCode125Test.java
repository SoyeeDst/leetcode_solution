package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Soyee on 2016/7/8.
 */
public class LeetCode125Test {

    @Test
    public void testIsPalindrome() {
        LeetCode125 leetCode125 = new LeetCode125();
        Assert.assertTrue(leetCode125.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(leetCode125.isPalindrome("race a car"));
        Assert.assertTrue(leetCode125.isPalindrome(",:,,,,,"));
        Assert.assertTrue(leetCode125.isPalindrome("a:b,,,&b&*a"));
        Assert.assertTrue(leetCode125.isPalindrome(" "));
        Assert.assertFalse(leetCode125.isPalindrome("0P"));
    }
}
