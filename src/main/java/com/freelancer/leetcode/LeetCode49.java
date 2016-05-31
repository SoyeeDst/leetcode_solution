package com.freelancer.leetcode;

import java.util.*;

/**
 * Created by Soyee on 2016/5/31.
 */
public class LeetCode49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        if (strs.length == 1) {
            List<List<String>> resultList = new ArrayList<>();
            List<String> alter = new ArrayList<>();
            alter.add(strs[0]);
            resultList.add(alter);
            return resultList;
        }
        Arrays.sort(strs);
        int index = 0;
        Map<String, List<String>> resultMap = new HashMap<>();
        do {
            String originalKey;
            if (resultMap.isEmpty() || (originalKey = existing(resultMap, strs[index])) == null) {
                List<String> alter = new ArrayList<>();
                alter.add(strs[index]);
                resultMap.put(alphabeta(strs[index]), alter);
            } else {
                List<String> alter = resultMap.get(originalKey);
                alter.add(strs[index]);
            }
            index = index + 1;
        } while (index < strs.length);
        List<List<String>> resultList = new ArrayList<>();
        for (String key : resultMap.keySet()) {
            resultList.add(resultMap.get(key));
        }
        return resultList;
    }

    private static String existing(Map<String, List<String>> resultMap, String value) {
        // Make value to be alphabetic order
        String alphabeticalValue = alphabeta(value);
        if (resultMap.containsKey(alphabeticalValue)) {
            return alphabeticalValue;
        }
        return null;
    }

    private static String alphabeta(String value) {
        char[] chars = value.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
