package com.freelancer.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode68 {

    private static final char EMPTY_SPACE = ' ';

    public List<String> fullJustify(String[] words, int maxWidth) {
        if (words == null || words.length == 0) {
            return Collections.emptyList();
        }
        List<String> resultList = new ArrayList<>();
        if (words.length == 1) {
            resultList.add(wrapResult(words, 0, words.length, true, maxWidth, words[0].length()));
            return resultList;
        }
        int totalLength = 0;
        int literalLength = 0;
        int nextStartIndex = 0;
        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            if (totalLength != 0) {
                totalLength += words[wordIndex].length() + 1;
            } else {
                totalLength = words[wordIndex].length();
            }
            literalLength += words[wordIndex].length();
            boolean backtrace = false;
            if (totalLength > maxWidth) {
                backtrace = true;
            }
            if (backtrace) {
                resultList.add(wrapResult(words, nextStartIndex, wordIndex, false, maxWidth, literalLength - words[wordIndex].length()));
                nextStartIndex = wordIndex;
                // backtrace
                wordIndex--;
                literalLength = 0;
                totalLength = 0;
                continue;
            } else {
                if (totalLength == maxWidth) {
                    resultList.add(wrapResult(words, nextStartIndex, wordIndex + 1, false, maxWidth, literalLength));
                    nextStartIndex = wordIndex + 1;
                    literalLength = 0;
                    totalLength = 0;
                    continue;
                }
            }
            // left string for last alternative
            if (wordIndex == words.length - 1) {
                resultList.add(wrapResult(words, nextStartIndex, wordIndex + 1, true, maxWidth, literalLength));
            }
        }
        return resultList;
    }

    // note that endIndex is exclusive
    private static String wrapResult(String[] words, int startIndex, int endIndex, boolean isLast, int maxWidth, int literalLength) {
        char[] alternative = new char[maxWidth];
        int position = 0;
        int vacano = maxWidth - literalLength;
        int placeHolders = 0;
        if (endIndex - startIndex > 1) {
            placeHolders = vacano - (vacano / (endIndex - startIndex - 1)) * (endIndex - startIndex - 1);
        }
        for (int index = startIndex; index < endIndex; index++) {
            char[] srcArray = words[index].toCharArray();
            System.arraycopy(srcArray, 0, alternative, position, srcArray.length);
            position += srcArray.length;
            if (position < maxWidth) {
                if (isLast) {
                    Arrays.fill(alternative, position, position + 1, EMPTY_SPACE);
                    position = position + 1;
                } else {
                    if (index != endIndex - 1 && endIndex - startIndex > 1) {
                        int places = vacano / (endIndex - startIndex - 1);
                        if (placeHolders > 0) {
                            places = places + 1;
                            placeHolders--;
                        }
                        Arrays.fill(alternative, position, position + places, EMPTY_SPACE);
                        position = position + places;
                    }
                }
            }
        }
        if (position < maxWidth) {
            Arrays.fill(alternative, position, maxWidth, EMPTY_SPACE);
        }
        return new String(alternative);
    }
}
