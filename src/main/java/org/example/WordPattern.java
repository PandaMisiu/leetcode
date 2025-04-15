package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(pattern.length()!=words.length) return false;
        Map<Character,String> mapping = new HashMap<>();

        int charIndex = 0;
        for(String word : words){
            char currentPattern = pattern.charAt(charIndex);

            if(!mapping.containsKey(currentPattern)){
                if(mapping.containsValue(word)) return false;
                mapping.put(currentPattern,word);
            }
            else {
                if(!Objects.equals(mapping.get(currentPattern), word)) return false;
            }

            charIndex++;
        }
        return true;

    }
}
