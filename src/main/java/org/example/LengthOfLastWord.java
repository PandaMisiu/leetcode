package org.example;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int spaceIndex = trimmed.lastIndexOf(' ');
        return spaceIndex == -1 ? trimmed.length() : trimmed.substring(trimmed.lastIndexOf(' ')).length()-1;
    }
}
