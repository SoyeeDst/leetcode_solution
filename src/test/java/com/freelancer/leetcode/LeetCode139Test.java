package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Soyee on 2016/7/22.
 */
public class LeetCode139Test {

    @Test
    public void testWordBreakSample() {
        LeetCode139 leetCode139 = new LeetCode139();
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        Assert.assertTrue(leetCode139.wordBreak("leetcode", dict));
    }

    @Test
    public void testWordBreakSample2() {
        LeetCode139 leetCode139 = new LeetCode139();
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        Assert.assertFalse(leetCode139.wordBreak("leetCode", dict));
    }

    @Test
    public void testWordBreakSample3() {
        LeetCode139 leetCode139 = new LeetCode139();
        Set<String> dict = new HashSet<>();
        dict.add("lee");
        dict.add("ta");
        dict.add("abc");
        dict.add("leet");
        dict.add("code");
        Assert.assertTrue(leetCode139.wordBreak("leetabc", dict));
    }

    @Test
    public void testWordBreakSample4() {
        LeetCode139 leetCode139 = new LeetCode139();
        Long start = System.currentTimeMillis();
        Set<String> dict = new HashSet<>();
        dict.add("a");
        dict.add("aa");
        dict.add("aaa");
        dict.add("aaaaa");
        dict.add("aaaaaa");
        dict.add("aaaaaaaa");
        dict.add("aaaaaaaaa");
        dict.add("aaaaaaaaaa");
        Assert.assertFalse(leetCode139.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                dict));
        System.err.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testWordBreakSample5() {
        LeetCode139 leetCode139 = new LeetCode139();
        Long start = System.currentTimeMillis();
        Set<String> dict = new HashSet<>();
        dict.add("aa");
        dict.add("aaa");
        dict.add("aaaa");
        dict.add("aaaaa");
        dict.add("aaaaaa");
        dict.add("aaaaaaa");
        dict.add("aaaaaaaa");
        dict.add("aaaaaaaaa");
        dict.add("aaaaaaaaaa");
        dict.add("ba");
        Assert.assertFalse(leetCode139.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                dict));
        System.err.println(System.currentTimeMillis() - start);
    }
}
