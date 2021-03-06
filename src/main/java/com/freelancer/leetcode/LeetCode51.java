package com.freelancer.leetcode;

import java.util.*;

/**
 * Created by Soyee on 2016/5/31.
 */
public class LeetCode51 {

    private static final String QUEEN_SYMBOL = "Q";
    private static final String EMPTY_PLACE = ".";

    public List<List<String>> solveNQueens(int n) {
        if (n == 1) {
            return Collections.singletonList(Collections.singletonList(QUEEN_SYMBOL));
        } else if (n <= 0 || n == 2 || n == 3) {
            return Collections.emptyList();
        }

        // backtrace algorithm with time complexity o(n ^ 3)
        // the first index
        int startIndex = 0;

        // symmetric alternatives from each side
        int endIndex = n % 2 == 0 ? (n / 2) : (n / 2 + 1);
        List<List<String>> resultList = new ArrayList<>();
        Stack<Integer> probationStack = new Stack<>();

        do {
            probationStack.push(startIndex);
            Integer innerIndex = 0;

            do {
                int properSeatGot = nextAvailableSeat(probationStack, innerIndex, n);
                if (properSeatGot >= 0) {
                    probationStack.push(properSeatGot);
                    innerIndex = 0;
                } else {
                    // back n step
                    do {
                        innerIndex = probationStack.pop() + 1;
                    } while (innerIndex >= n && !probationStack.isEmpty());
                    continue;
                }
                if (probationStack.size() == n) {
                    // matches
                    moveToFinalResult(probationStack, resultList, n);
                    // backtrace steps, try to get another alternative solutions
                    probationStack.pop();
                    do {
                        innerIndex = probationStack.pop() + 1;
                    } while (innerIndex >= n && !probationStack.isEmpty());

                    continue;
                }
            } while (innerIndex < n && !probationStack.isEmpty());
            probationStack.clear();
            startIndex++;
        } while (startIndex < endIndex);
        return resultList;
    }

    private static int nextAvailableSeat(Stack<Integer> probationStack, int startN, int maxN) {
        for (int i = startN; i < maxN; i++) {
            if (probationStack.contains(i)) {
                continue;
            }
            int stackSize = probationStack.size();
            boolean notfound = false;
            for (int elementIndex = 0; elementIndex < stackSize; elementIndex++) {
                Integer currentElement = probationStack.elementAt(elementIndex);
                if (Math.abs(i - currentElement) == stackSize - elementIndex) {
                    notfound = true;
                    break;
                }
            }
            if (notfound) {
                continue;
            }
            return i;
        }
        return Integer.MIN_VALUE;
    }

    // it should spawn 2 results in to result list
    private static void moveToFinalResult(Stack<Integer> alternative, List<List<String>> resultList, int n) {
        Enumeration<Integer> chosenSeats = alternative.elements();
        List<String> positiveList = new ArrayList<>();
        List<String> reverseList = new ArrayList<>();
        while (chosenSeats.hasMoreElements()) {
            Integer perSeat = chosenSeats.nextElement();
            positiveList.add(printable(perSeat, n));
            reverseList.add(reversePrintable(perSeat, n));
        }
        if (!resultList.contains(positiveList)) {
            resultList.add(positiveList);
        }
        if (!resultList.contains(reverseList)) {
            resultList.add(reverseList);
        }
    }

    private static String printable(int index, int n) {
        char[] answer = new char[n];
        Arrays.fill(answer, '.');
        answer[index] = 'Q';
        return new String(answer);
    }

    private static String reversePrintable(int index, int n) {
        char[] answer = new char[n];
        Arrays.fill(answer, '.');
        answer[n - 1 - index] = 'Q';
        return new String(answer);
    }
}
