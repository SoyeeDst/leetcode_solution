package com.freelancer.leetcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode68Test {

    @Test
    public void testFullJustify1() {
        LeetCode68 leetCode68 = new LeetCode68();
        List<String> answerList = leetCode68.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        Assert.assertEquals(3, answerList.size());
        Assert.assertEquals("This    is    an", answerList.get(0));
        Assert.assertEquals("example  of text", answerList.get(1));
        Assert.assertEquals("justification.  ", answerList.get(2));
    }

    @Test
    public void testFullJustify2() {
        LeetCode68 leetCode68 = new LeetCode68();
        List<String> answerList = leetCode68.fullJustify(new String[]{"justification", "justification", "justification", "justification", "justification", "justification", "justification"}, 16);
        Assert.assertEquals(7, answerList.size());
        for (int index = 0; index < 7; index++) {
            Assert.assertEquals("justification   ", answerList.get(0));
        }
    }

    @Test
    public void testFullJustifyOneSingleItem() {
        LeetCode68 leetCode68 = new LeetCode68();
        List<String> answerList = leetCode68.fullJustify(new String[]{"haha"}, 4);
        Assert.assertEquals(1, answerList.size());
        Assert.assertEquals("haha", answerList.get(0));
    }
}
