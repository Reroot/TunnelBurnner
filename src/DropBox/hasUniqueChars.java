package DropBox;

/**
 * Implement an algorithm to determine if a string has all unique characters. What
 * if you cannot use additional data structures? (Assume string is ASCII based.)
 */
public class hasUniqueChars {
    // use boolean array
    boolean hasUniqueChars(String str) {
        if (str == null || str.isEmpty()) return false;
        if (str.length() > 256) return false;

        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (charSet[ch]) return false;
            else charSet[ch] = true;
        }
        return true;
    }
}