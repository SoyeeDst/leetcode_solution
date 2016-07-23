package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Soyee on 2016/7/22.
 */
public class LeetCode140Test {

    @Test
    public void testWordBreakSample() {
        LeetCode140 leetCode140 = new LeetCode140();
        Set<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        List<String> wordsList = leetCode140.wordBreak("catsanddog", dict);
        Assert.assertEquals(2, wordsList.size());
        Assert.assertEquals("cat sand dog", wordsList.get(0));
        Assert.assertEquals("cats and dog", wordsList.get(1));
    }

    @Test
    public void testWordBreakSample2() {
        LeetCode140 leetCode140 = new LeetCode140();
        Set<String> dict = new HashSet<>();
        dict.add("a");
        dict.add("abc");
        dict.add("b");
        dict.add("cd");
        List<String> wordsList = leetCode140.wordBreak("abcd", dict);
        Assert.assertEquals(1, wordsList.size());
        Assert.assertEquals("a b cd", wordsList.get(0));
    }

    @Test
    public void testWordBreakSample3() {
        LeetCode140 leetCode140 = new LeetCode140();
        Set<String> dict = new HashSet<>();
        dict.add("aaaa");
        dict.add("aa");
        dict.add("a");
        List<String> wordsList = leetCode140.wordBreak("aaaaaaa", dict);
        Assert.assertEquals(31, wordsList.size());
    }

    @Test
    public void testWordBreakSample4() {
        LeetCode140 leetCode140 = new LeetCode140();
        Long start = System.currentTimeMillis();
        Set<String> dict = new HashSet<>();
        dict.add("a");
        dict.add("aa");
        dict.add("aaa");
        dict.add("aaaa");
        dict.add("aaaaa");
        dict.add("aaaaaa");
        dict.add("aaaaaaa");
        dict.add("aaaaaaaa");
        dict.add("aaaaaaaaa");
        dict.add("aaaaaaaaaa");
        List<String> wordsList = leetCode140.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", dict);
        Assert.assertEquals(0, wordsList.size());
        System.err.println("Word break consumed : " + (System.currentTimeMillis() - start) + " ms");
    }
}
