package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ValidAnagram {
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())return false;
//        int []charCounts = new int[26];
//
//        for(int i = 0;i<s.length();i++){
//            char sChar = s.charAt(i);
//            char tChar = t.charAt(i);
//
//            charCounts[sChar-'a']++;
//            charCounts[tChar-'a']--;
//        }
//        for(int count : charCounts){
//            if(count!=0) return false;
//        }
//        return true;
//    }
public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())return false;
    char []sChars = s.toCharArray();
    char []tChars = t.toCharArray();

    Arrays.sort(sChars);
    Arrays.sort(tChars);

    return Arrays.equals(sChars, tChars);
}

}
