package com.freelancer.leetcode;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Created by Soyee on 2016/6/6.
 */
public class LeetCode71 {

    private static final String SLASH = "/";
    private static final String CURRENT = ".";
    private static final String PARENT = "..";

    public String simplifyPath(String path) {
        if (path == null || path.equals("")) {
            return "";
        }
        String[] hierachies = path.split(SLASH);
        Stack<String> pathStack = new Stack<>();
        for (String pathElement : hierachies) {
            if (pathElement.equals("")) {
                continue;
            }
            if (pathElement.equals(PARENT)) {
                if (pathStack.isEmpty()) {
                    continue;
                } else {
                    String topElement = pathStack.peek();
                    if (!topElement.equals(PARENT)) {
                        pathStack.pop();
                        continue;
                    }
                    pathStack.push(PARENT);
                }
            } else if (!pathElement.equals(CURRENT)) {
                pathStack.push(pathElement);
            }
        }
        if (pathStack.empty()) {
            return SLASH;
        }
        Enumeration<String> paths = pathStack.elements();
        StringBuffer pathBuffer = new StringBuffer().append(SLASH);
        while (paths.hasMoreElements()) {
            String pathClip = paths.nextElement();
            pathBuffer.append(pathClip).append(SLASH);
        }
        if (pathBuffer.length() > 1) {
            return pathBuffer.deleteCharAt(pathBuffer.length() - 1).toString();
        }
        return pathBuffer.toString();
    }

}
