package com.freelancer.leetcode;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class LeetCode212Test {

	@Test
	public void testMatches() {
		LeetCode212 test = new LeetCode212();
		char[][] board = new char[][] { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = new String[] { "oath", "pea", "eat", "rain" };

		final List<String> wordsList = test.findWords(board, words);

		Assert.assertEquals(2, wordsList.size());
	}

	@Test
	public void testMatches1() {
		LeetCode212 test = new LeetCode212();
		char[][] board = new char[][] { { 'a' } };
		String[] words = new String[] { "a", "a" };

		final List<String> wordsList = test.findWords(board, words);

		Assert.assertEquals(1, wordsList.size());
	}
	
	@Test
	public void testMatches2() {
		LeetCode212 test = new LeetCode212();
		char[][] board = new char[][] { { 'a', 'a' } };
		String[] words = new String[] { "aaa" };

		final List<String> wordsList = test.findWords(board, words);

		Assert.assertEquals(0, wordsList.size());
	}

	
	@Test
	public void testMatches3() {
		LeetCode212 test = new LeetCode212();
		char[][] board = new char[][] { { 'a', 'b' }, { 'c', 'd' } };
		String[] words = new String[] { "cdba" };

		final List<String> wordsList = test.findWords(board, words);

		Assert.assertEquals(1, wordsList.size());
	}
}
