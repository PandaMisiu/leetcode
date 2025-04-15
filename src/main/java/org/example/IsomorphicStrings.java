package org.example;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character, Character> mapping = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char actualChar = s.charAt(i);
            char mappedChar = t.charAt(i);
            if(!mapping.containsKey(actualChar)){
                if(mapping.containsValue(mappedChar)) return false;
                mapping.put(actualChar,mappedChar);
            }
            else {
                if(mapping.get(actualChar) != mappedChar) return false;
            }
        }
        return true;
    }
}
