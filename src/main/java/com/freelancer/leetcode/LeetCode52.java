package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;

/**
 * Created by Soyee on 2016/6/2.
 */
public class LeetCode52 {

    private static final String QUEEN_SYMBOL = "Q";
    private static final String EMPTY_PLACE = ".";

    public int totalNQueens(int n) {
        if (n == 1) {
            return 1;
        } else if (n <= 0 || n == 2 || n == 3) {
            return 0;
        }

        // backtrace algorithm with time complexity o(n ^ 3)
        // the first index
        int startIndex = 0;
        int endIndex = n % 2 == 0 ? (n / 2) : (n / 2 + 1);
        List<List<String>> resultList = new ArrayList<>();
        Stack<Integer> probationStack = new Stack<>();

        do {
            probationStack.push(startIndex);
            Integer innerIndex = 0;

            do {
                boolean properSeatGot;
                do {
                    properSeatGot = true;
                    int stackSize = probationStack.size();

                    for (int elementIndex = 0; elementIndex < stackSize; elementIndex++) {
                        Integer currentElement = probationStack.elementAt(elementIndex);
                        if (currentElement == innerIndex) {
                            properSeatGot = false;
                            break;
                        }
                        if (Math.abs(innerIndex - currentElement) == stackSize - elementIndex) {
                            properSeatGot = false;
                            break;
                        }
                    }
                    if (properSeatGot) {
                        break;
                    }
                    innerIndex++;
                } while (innerIndex < n);

                if (properSeatGot) {
                    probationStack.push(innerIndex);
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

        return resultList.size();
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
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (i == index) {
                stringBuffer.append(QUEEN_SYMBOL);
            } else {
                stringBuffer.append(EMPTY_PLACE);
            }
        }
        return stringBuffer.toString();
    }

    private static String reversePrintable(int index, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (n == index + i + 1) {
                stringBuffer.append(QUEEN_SYMBOL);
            } else {
                stringBuffer.append(EMPTY_PLACE);
            }
        }
        return stringBuffer.toString();
    }

}
