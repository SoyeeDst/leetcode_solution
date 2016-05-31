package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/5/31.
 */
public class LeetCode49Test {

    @Test
    public void testGroupAnagrams() {
        LeetCode49 leetCode49 = new LeetCode49();
        List<List<String>> valueList = leetCode49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assert.assertTrue(valueList.size() == 3);
    }

}
