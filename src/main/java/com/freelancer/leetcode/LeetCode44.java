package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/25.
 */
public class LeetCode44 {

    private static final char ANY = '?';
    private static final char ASKTERIA = '*';

    public boolean isMatch(String s, String p) {
        if ((s == null && p == null)) {
            return false;
        }
        if (s.equals("") && p.equals("")) {
            return true;
        }
        if (!s.equals("") && p.equals("")) {
            return false;
        }
        boolean askelia = askerisa(p);
        if (!askelia) {
            return s.equals(p);
        }

        p = compressAskteria(p);

        // needed literal counts comparison after compression
        if (mandatoryLiteralCount(s) < mandatoryLiteralCount(p)) {
            return false;
        }
        int maxLength = Math.max(s.length(), p.length()) + 1;
        Boolean[][] resultMatrix = new Boolean[maxLength][maxLength];
        return matcher(s, p, 0, 0, resultMatrix);
    }

    private static String compressAskteria(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int index = 0; index < s.length(); index++) {
            if (index >= 1 && (s.charAt(index) == s.charAt(index - 1)) && s.charAt(index) == ASKTERIA) {
                continue;
            }
            stringBuffer.append(s.charAt(index));
        }
        return stringBuffer.toString();
    }

    private static int mandatoryLiteralCount(String s) {
        int count = 0;
        for (int index = 0; index < s.length(); index++) {
            if (charAt(index, s) != ASKTERIA) {
                count++;
            }
        }
        return count;
    }

    private static boolean askerisa(String p) {
        for (char singleChar : p.toCharArray()) {
            if (singleChar == ANY || singleChar == ASKTERIA) {
                return true;
            }
        }
        return false;
    }

    private static boolean literal(char matchChar) {
        if (matchChar == ANY || matchChar == ASKTERIA) {
            return false;
        }
        return true;
    }

    public static MatchMode matchMode(int offset, String p) {
        char currentChar = p.charAt(offset);
        if (literal(currentChar)) {
            return MatchMode.LITERAL;
        }
        if (currentChar == ANY) {
            return MatchMode.MATCH_ANY_ONCE;
        }
        return MatchMode.MATCH_ANY;
    }

    private static Character charAt(int index, String str) {
        if (index < str.length()) {
            return str.charAt(index);
        }
        return null;
    }

    private static boolean matcher(String s, String p, int startOffset, int offset, Boolean[][] resultMatrix) {
        if (offset > p.length() - 1 && startOffset > s.length() - 1) {
            return true;
        }

        if ((s.length() >= 1 && startOffset > s.length() - 1) || s == null || s.equals("")) {
            do {
                if (p.charAt(offset) != ASKTERIA) {
                    resultMatrix[startOffset][offset] = false;
                    return false;
                }
                offset++;
            } while (offset <= p.length() - 1);
            resultMatrix[startOffset][offset] = true;
            return true;
        }

        if (offset > p.length() - 1) {
            MatchMode matchMode = matchMode(offset - 1, p);
            if (matchMode == MatchMode.MATCH_ANY) {
                resultMatrix[startOffset][offset] = true;
                return true;
            }
            resultMatrix[startOffset][offset] = false;
            return false;
        }

        if (resultMatrix[startOffset][offset] != null) {
            return resultMatrix[startOffset][offset];
        }

        int index = startOffset;
        do {
            Character currentChar = charAt(index, s);
            Character matchingChar = p.charAt(offset);
            MatchMode matchMode = matchMode(offset, p);
            if (matchMode == MatchMode.LITERAL) {
                if (currentChar == null || !currentChar.equals(matchingChar)) {
                    resultMatrix[startOffset][offset] = false;
                    return false;
                }
                boolean result = matcher(s, p, startOffset + 1, offset + 1, resultMatrix);
                resultMatrix[startOffset + 1][offset + 1] = result;
                return result;
            } else if (matchMode == MatchMode.MATCH_ANY_ONCE) {
                boolean result = matcher(s, p, startOffset + 1, offset + 1, resultMatrix);
                resultMatrix[startOffset + 1][offset + 1] = result;
                return result;
            } else {
                boolean result = matcher(s, p, startOffset + 1, offset + 1, resultMatrix);
                resultMatrix[startOffset + 1][offset + 1] = result;
                if (!result) {
                    // backdate if meeting any obstacle while forwarding
                    result =  matcher(s, p, startOffset + 1, offset, resultMatrix);
                    resultMatrix[startOffset + 1][offset] = result;
                    if (!result) {
                        result = matcher(s, p, startOffset, offset + 1, resultMatrix);
                        resultMatrix[startOffset][offset + 1] = result;
                        return result;
                    }
                    return true;
                }
                return true;
            }
        } while (1 == 0);
    }

    private enum MatchMode {
        LITERAL,
        MATCH_ANY_ONCE,
        MATCH_ANY
    }
}
