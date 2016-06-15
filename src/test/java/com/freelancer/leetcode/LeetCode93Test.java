package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Soyee on 2016/6/15.
 */
public class LeetCode93Test {

    @Test
    public void testParseIps() {
        LeetCode93 leetCode93 = new LeetCode93();
        List<String> ipList = leetCode93.restoreIpAddresses("25525511135");
        Assert.assertEquals(2, ipList.size());
        Assert.assertEquals("255.255.11.135", ipList.get(0));
        Assert.assertEquals("255.255.111.35", ipList.get(1));
    }

    @Test
    public void testParseIpsPlus() {
        LeetCode93 leetCode93 = new LeetCode93();
        List<String> ipList = leetCode93.restoreIpAddresses("55525511135");
        Assert.assertEquals(0, ipList.size());
    }

    @Test
    public void testParseIps2() {
        LeetCode93 leetCode93 = new LeetCode93();
        List<String> ipList = leetCode93.restoreIpAddresses("0000");
        Assert.assertEquals(1, ipList.size());
        Assert.assertEquals("0.0.0.0", ipList.get(0));
    }
}
