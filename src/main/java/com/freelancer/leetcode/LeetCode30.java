package com.freelancer.leetcode;

import java.util.*;

/**
 * Created by Soyee on 2016/5/20.
 */
public class LeetCode30 {

    // find substring
    public List<Integer> findSubstring(String s, String[] words) {
        int clipLen = words[0].length();
        int totalLen = words.length * clipLen;
        if (s == null || s.equals("") || s.length() < totalLen) {
            return Collections.emptyList();
        }

        List<Integer> resultList = new ArrayList<>();
        List<Integer> checkedOffset = new ArrayList<>();
        Map<String, Integer> wordsCount = wordsCounts(words);

        int index = s.length() - 1;
        do {
            if (checkedOffset.contains(index)) {
                // Skip
                index = index - 1;
                continue;
            }
            Map<String, Integer> matchingDataMap = temporaryMapForMatch(wordsCount);
            int start = index;
            checkedOffset.add(index);
            int maxIndex = 0;

            boolean matchOnce = false;
            while (start >= clipLen - 1) {
                boolean simpleResult = nextCheckingOrNot(s, clipLen, matchingDataMap, start);
                if (simpleResult) {
                    matchOnce = true;
                    if (matchingDataMap.isEmpty()) {
                        if (start - clipLen < 0) {
                            resultList.add(0);
                        } else {
                            resultList.add(start - clipLen + 1);
                        }
                        break;
                    } else {
                        start = start - clipLen;
                        continue;
                    }
                } else {
                    if (!matchOnce || clipLen == 1) {
                        break;
                    }

                    // first time to meet road blocks
                    int nestedStart = index - 1;
                    do {
                        checkedOffset.add(nestedStart);
                        ForwardDetection forwardDetection = forwardDetects(s, clipLen, nestedStart, wordsCount, words.length);
                        if (forwardDetection.nofurtherAlter) {
                            break;
                        }
                        if (forwardDetection.matches != null) {
                            resultList.add(forwardDetection.matches);
                            break;
                        }
                        maxIndex = Math.max(maxIndex, forwardDetection.terminal);
                        nestedStart--;
                    } while (nestedStart >= index - clipLen + 1);
                    break;
                }
            }

            if (maxIndex != 0) {
                index = maxIndex - 1;
            } else {
                index = index - 1;
            }

        } while (index >= 0 && index >= (totalLen - 1));
        return resultList;
    }

    private static boolean nextCheckingOrNot(String s, int clipLen, Map<String, Integer> matchingDataMap, int start) {
        String testedStr;
        if (start == s.length() - 1) {
            // read from the end
            testedStr = s.substring(start - (clipLen - 1));
        } else {
            if (start - clipLen < 0) {
                testedStr = s.substring(0, clipLen);
            } else {
                testedStr = s.substring(start - clipLen + 1, start + 1);
            }
        }
        return possibleGet(testedStr, matchingDataMap);
    }

    private static Map<String, Integer> wordsCounts(String[] words) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            if (wordsCount.containsKey(word)) {
                Integer oldValue = wordsCount.get(word);
                wordsCount.put(word, oldValue + 1);
                continue;
            }
            wordsCount.put(word, 1);
        }
        return wordsCount;
    }

    private static ForwardDetection forwardDetects(String str, int clipLen, int startOffset, Map<String, Integer> wordsCount, int criteriaCount) {
        ForwardDetection forwardDetection = new ForwardDetection();
        int startOffSetBackup = startOffset;
        Map<String, Integer> matchingDataMap = temporaryMapForMatch(wordsCount);
        int matchingCount = 0;
        while (startOffset > 0 && matchingCount < criteriaCount) {
            boolean simpleResult = nextCheckingOrNot(str, clipLen, matchingDataMap, startOffset);
            if (!simpleResult) {
                if (startOffset < clipLen) {
                    forwardDetection.nofurtherAlter = true;
                    return forwardDetection;
                }
                if (matchingCount == 0) {
                    forwardDetection.terminal = startOffSetBackup;
                } else {
                    forwardDetection.terminal = startOffset + (clipLen);
                }
                return forwardDetection;
            }
            matchingCount = matchingCount + 1;
            startOffset = startOffset - clipLen;
        }

        if (matchingCount != criteriaCount) {
            // no further alternatives any more
            forwardDetection.nofurtherAlter = true;
            return forwardDetection;
        }

        if (startOffSetBackup < clipLen * criteriaCount) {
            forwardDetection.matches = 0;
        } else {
            forwardDetection.matches = startOffSetBackup - clipLen * criteriaCount + 1;
        }
        return forwardDetection;
    }

    private static boolean possibleGet(String value, Map<String, Integer> matchingDataMap) {
        if (!matchingDataMap.containsKey(value)) {
            return false;
        }
        int count = matchingDataMap.get(value);
        count = count - 1;
        if (count == 0) {
            matchingDataMap.remove(value);
        } else {
            matchingDataMap.put(value, count);
        }
        return true;
    }

    private static Map<String, Integer> temporaryMapForMatch(Map<String, Integer> orginalMap) {
        Map<String, Integer> temporaryMap = new HashMap<>();
        temporaryMap.putAll(orginalMap);
        return temporaryMap;
    }

    private static class ForwardDetection {
        public int terminal;
        public Integer matches;
        public Boolean nofurtherAlter = false;
    }
}
