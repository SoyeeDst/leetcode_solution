package com.freelancer.leetcode;

/**
 * Created by Soyee on 2016/5/12.
 */
public class LeetCode10 {

    private static final char ANY = '.';
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
        return matcher(s, p, 0, 0);
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
        if (offset == p.length() - 1) {
            if (literal(currentChar)) {
                return MatchMode.LITERAL;
            }
            if (currentChar == ANY) {
                return MatchMode.MATCH_ANY_ONCE;
            }
            return MatchMode.MATCH_ANY_END;
        }
        char nextChar = p.charAt(offset + 1);
        if (literal(currentChar) && literal(nextChar)) {
            return MatchMode.LITERAL;
        } else if (literal(currentChar) && nextChar == ANY) {
            return MatchMode.LITERAL;
        } else if (literal(currentChar) && nextChar == ASKTERIA) {
            return MatchMode.MATCH_OPTIONAL_CHAR;
        }
        if (currentChar == ASKTERIA) {
            char preChar = p.charAt(offset - 1);
            if (preChar == ANY) {
                return MatchMode.MATCH_ANY;
            } else {
                return MatchMode.MATCH_OPTIONAL_CHAR;
            }
        }
        if (nextChar == ASKTERIA) {
            return MatchMode.MATCH_OPTIONAL_CHAR;
        }
        return MatchMode.MATCH_ANY;
    }

    private static Character charAt(int index, String str) {
        if (index < str.length()) {
            return str.charAt(index);
        }
        return null;
    }

    private static boolean matcher(String s, String p, int startOffset, int offset) {
        if (offset > p.length() - 1 && startOffset > s.length() - 1) {
            return true;
        }
        if (offset > p.length() - 1) {
            return false;
        }
        if (s.length() >= 1 && startOffset > s.length() - 1) {
            return matcher("", p, 0, offset);
        }
        int index = startOffset;
        do {
            Character currentChar = charAt(index, s);
            Character matchingChar = p.charAt(offset);
            MatchMode matchMode = matchMode(offset, p);
            if (matchMode == MatchMode.LITERAL) {
                if (currentChar == null || !currentChar.equals(matchingChar)) {
                    return false;
                }
                return matcher(s, p, startOffset + 1, offset + 1);
            } else if (matchMode == MatchMode.MATCH_ANY_END) {
                return true;
            } else if (matchMode == MatchMode.MATCH_ANY_ONCE || matchMode == MatchMode.MATCH_ANY) {
                if (currentChar == null) {
                    return false;
                }
                return matcher(s, p, startOffset + 1, offset + 1);
            } else {
                // one special char should be limited
                if (currentChar == null || (literal(matchingChar) && !currentChar.equals(matchingChar))) {
                    return matcher(s, p, startOffset, offset + 2);
                }
                if (!matcher(s, p, startOffset, offset + 2)) {
                    return matcher(s, p, startOffset + 1, offset);
                }
                return true;
            }
        } while (1 == 0);
    }

    private enum MatchMode {
        LITERAL,
        MATCH_ANY_ONCE,
        MATCH_ANY,
        MATCH_OPTIONAL_CHAR,
        MATCH_ANY_END;
    }
}
