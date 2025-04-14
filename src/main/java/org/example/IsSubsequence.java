package org.example;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.isBlank()) return true;

        int i = 0, j = 0, count = 0;
        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                count++;
                i++;
            }
            if(count == s.length()) {
                return true;
            }
            j++;
        }
        return false;
    }
}
