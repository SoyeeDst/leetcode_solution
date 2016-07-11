package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Soyee on 2016/7/10.
 */
public class LeetCode127Test {

    @Test
    public void testLadderLength() {
        LeetCode127 leetCode127 = new LeetCode127();
        Set<String> ds = new HashSet<>();
        ds.add("hot");
        ds.add("dot");
        ds.add("dog");
        ds.add("lot");
        ds.add("log");
        Assert.assertEquals(5,leetCode127.ladderLength("hit", "cog", ds));
    }

    @Test
    public void testLadderLength2() {
        LeetCode127 leetCode127 = new LeetCode127();
        Set<String> ds = new HashSet<>();
        ds.add("hot");
        ds.add("dog");
        Assert.assertEquals(0,leetCode127.ladderLength("hot", "dog", ds));
    }

}