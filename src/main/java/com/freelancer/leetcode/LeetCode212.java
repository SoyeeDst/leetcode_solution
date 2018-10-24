package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LeetCode212 {
	
	public List<String> findWordsV2(char[][] board, String[] words) {
		List<String> res = new ArrayList<>();
	    TrieNode root = buildTrie(words);
	    for (int i = 0; i < board.length; i++) {
	        for (int j = 0; j < board[0].length; j++) {
	            dfs (board, i, j, root, res);
	        }
	    }
	    return res;
	}

	public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
	    char c = board[i][j];
	    if (c == '#' || p.next[c - 'a'] == null) return;
	    p = p.next[c - 'a'];
	    if (p.word != null) {   // found one
	        res.add(p.word);
	        p.word = null;     // de-duplicate
	    }

	    board[i][j] = '#';
	    if (i > 0) dfs(board, i - 1, j ,p, res); 
	    if (j > 0) dfs(board, i, j - 1, p, res);
	    if (i < board.length - 1) dfs(board, i + 1, j, p, res); 
	    if (j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
	    board[i][j] = c;
	}

	public TrieNode buildTrie(String[] words) {
	    TrieNode root = new TrieNode();
	    for (String w : words) {
	        TrieNode p = root;
	        for (char c : w.toCharArray()) {
	            int i = c - 'a';
	            if (p.next[i] == null) p.next[i] = new TrieNode();
	            p = p.next[i];
	       }
	       p.word = w;
	    }
	    return root;
	}

	class TrieNode {
	    TrieNode[] next = new TrieNode[26];
	    String word;
	}
	

	public List<String> findWords(char[][] board, String[] words) {
		List<String> ml = new ArrayList<>();
		Set<String> checkedSet = new HashSet<>();
		for (String word : words) {
			if (checkedSet.contains(word)) {
				continue;
			}
			boolean matched = matches(board, word);
			checkedSet.add(word);
			if (matched) {
				ml.add(word);
			}
		}
		return ml;
	}

	private static boolean matches(char[][] board, String word) {
		int i = 0;
		int j = 0;
		
		do {
			do {
				if (dfsMatches(board, word, i, j, new Stack<Path>())) {
					return true;
				}
				j++;
			} while (j <= board[0].length - 1);
			i++;
			j = 0;
		} while (i <= board.length - 1);

		return false;
	}

	private static boolean dfsMatches(char[][] board, String word, int startRow, int startCol, Stack<Path> visited) {
		int i = startRow;
		int j = startCol;
		
		if (word == null || word.equals("")) {
			return true;
		}

		if (i > board.length - 1 || j > board[0].length - 1 || i < 0 || j < 0) {
			return false;
		}
		
		// judge whether this path is covered already
		for (int x = 0; x < visited.size(); x++) {
			if (visited.get(x).row == i && visited.get(x).col == j) {
				return false;
			}
		}
		
		visited.push(new Path(i, j));
		if (board[i][j] == word.charAt(0) && (dfsMatches(board, word.substring(1), i + 1, j, visited)
				|| dfsMatches(board, word.substring(1), i - 1, j, visited) || dfsMatches(board, word.substring(1), i, j - 1, visited)
				|| dfsMatches(board, word.substring(1), i, j + 1, visited))) {
			return true;
		}
        
		visited.pop();
		return false;
	}
	
	static class Path {
		
		int row;
		int col;
		
		Path(int r, int c) {
			this.row = r;
			this.col = c;
		}
		
	}
	

}
