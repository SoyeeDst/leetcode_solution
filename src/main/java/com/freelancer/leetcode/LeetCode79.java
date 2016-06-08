package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Soyee on 2016/6/8.
 */
public class LeetCode79 {

    // Search words from matrix
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        int rows = board.length;
        int cols = board[0].length;
        int counts = rows * cols;
        if (counts < word.length()) {
            return false;
        }
        return searchFromZero(board, word);
    }

    private boolean searchFromZero(char[][] board, String word) {
        char firstChar = word.charAt(0);
        List<RecordedPath> rootPaths = getRootPath(board, firstChar);
        if (word.length() == 1) {
            if (rootPaths.size() == 0) {
                return false;
            }
            return true;
        }

        for (RecordedPath rootPath : rootPaths) {
            // Depth search first(DFS and backtrace algorithm)
            Stack<RecordedPath> stack = new Stack<>();
            stack.push(rootPath);
            if (searchFromRootPath(board, word.substring(1), stack, rootPath, word.length())) {
                return true;
            }
        }
        return false;
    }

    private static boolean searchFromRootPath(char[][] board, String word, Stack<RecordedPath> excludedPath, RecordedPath parentPath, int maxDepth) {
        if (excludedPath.size() == maxDepth) {
            return true;
        }
        Character matchingChar = word.charAt(0);
        List<RecordedPath> possiblePaths = possiblePaths(parentPath, excludedPath, board, matchingChar);
        if (possiblePaths == null || possiblePaths.isEmpty()) {
            return false;
        }
        for (RecordedPath nextPath : possiblePaths) {
            excludedPath.push(nextPath);
            boolean recursiveSearchResult = searchFromRootPath(board, word.substring(1), excludedPath, nextPath, maxDepth);
            if (!recursiveSearchResult) {
                // continue to try
                excludedPath.pop();
                continue;
            } else {
                return true;
            }
        }
        return false;
    }

    private static List<RecordedPath> possiblePaths(RecordedPath parentPath, Stack<RecordedPath> excludedPath, char[][] board, char matchingChar) {
        List<RecordedPath> possiblePaths = new ArrayList<>();
        if (parentPath.rowIndex - 1 >= 0) {
            if (board[parentPath.rowIndex - 1][parentPath.colIndex] == matchingChar
                && !excludedPath.contains(RecordedPath.newInstance(parentPath.rowIndex - 1, parentPath.colIndex))) {
                possiblePaths.add(RecordedPath.newInstance(parentPath.rowIndex - 1, parentPath.colIndex));
            }
        }
        if (parentPath.colIndex - 1 >= 0) {
            if (board[parentPath.rowIndex][parentPath.colIndex - 1] == matchingChar
                    && !excludedPath.contains(RecordedPath.newInstance(parentPath.rowIndex, parentPath.colIndex - 1))) {
                possiblePaths.add(RecordedPath.newInstance(parentPath.rowIndex, parentPath.colIndex - 1));
            }
        }
        if (parentPath.colIndex + 1 <= board[0].length - 1) {
            if (board[parentPath.rowIndex][parentPath.colIndex + 1] == matchingChar
                    && !excludedPath.contains(RecordedPath.newInstance(parentPath.rowIndex, parentPath.colIndex + 1))) {
                possiblePaths.add(RecordedPath.newInstance(parentPath.rowIndex, parentPath.colIndex + 1));
            }
        }
        if (parentPath.rowIndex + 1 <= board.length - 1) {
            if (board[parentPath.rowIndex + 1][parentPath.colIndex] == matchingChar
                    && !excludedPath.contains(RecordedPath.newInstance(parentPath.rowIndex + 1, parentPath.colIndex))) {
                possiblePaths.add(RecordedPath.newInstance(parentPath.rowIndex + 1, parentPath.colIndex));
            }
        }
        return possiblePaths;
    }

    private static class RecordedPath {
        public int rowIndex;
        public int colIndex;

        public static RecordedPath newInstance(int rowIndex, int colIndex) {
            RecordedPath path = new RecordedPath();
            path.rowIndex = rowIndex;
            path.colIndex = colIndex;
            return path;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof RecordedPath)) {
                return false;
            }
            RecordedPath other = (RecordedPath)obj;
            if (this.colIndex == other.colIndex && this.rowIndex == other.rowIndex) {
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return rowIndex << 8 + colIndex;
        }
    }

    private static List<RecordedPath> getRootPath(char[][] board, char firstChar) {
        List<RecordedPath> roots = new ArrayList<>();
        int rows = board.length;
        int cols = board[0].length;
        for (int index = 0; index < rows; index++) {
            for (int index2 = 0; index2 < cols; index2++) {
                if (board[index][index2] == firstChar) {
                    RecordedPath rootPath = new RecordedPath();
                    rootPath.rowIndex = index;
                    rootPath.colIndex = index2;
                    roots.add(rootPath);
                }
            }
        }
        return roots;
    }

}
